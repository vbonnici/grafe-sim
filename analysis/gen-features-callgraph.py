# Given a set of source code files, generates all the prefix trees of
# a-cfgs and put them in a .csv file (one csv for each configuration).

import argparse
import logging
import pathlib
import time
import itertools
import pandas as pd
import os
import tqdm
from tqdm.contrib.logging import logging_redirect_tqdm

import ccpt.cfg_to_trie.utils as utils
import ccpt.cfg_to_trie.gencfg as gencfg
import ccpt.cfg_to_trie.gentrie as gentrie


logging.basicConfig(level=logging.CRITICAL)
logger = logging.getLogger(__name__)


def generate_tries(file_dict: dict, conf: dict, cpp_flag: bool,
                   excluded: list) -> dict:

    tries_dict: dict[gentrie.Trie] = {}
    i = 1
    for f, llvmir in file_dict.items():

        logger.info(f"[{i}/{len(file_dict)}] generating trie for {f}...")

        # logger.info(f"Conf: lp={lp}, c={const_flag}, v={var_flag}, \
        #             sty={sty_flag}, cut={cut_flag}, f={function}.")

        # TODO: temporary. Not needed when using log.
        # Disable output
        # sys.stdout = open(os.devnull, "w")
        # sys.stderr = open(os.devnull, "w")

        # Generate abstract cfg of (eventually) specified function.
        map_path = gencfg.get_predef_map_path(conf["mapID"])
        map = gencfg.gen_map_from_csv(map_path)
        try:
            acfg = gencfg.generate_acfg(llvmir, map, conf["var"],
                                        conf["const"], conf["sty"],
                                        conf["cut"])
        except BaseException:
            logger.critical(f"Got an exception in gencfg() for file {f}.")
            # raise
            if f not in excluded:
                excluded.append(f)
            continue

        # Generate prefix tree.
        try:
            T: gentrie.Trie = gentrie.Trie(acfg, conf["lp"], None)
        except BaseException:
            logger.critical(
                f"Got an exception in generate_trie() for file {f}.")
            # raise
            if f not in excluded:
                excluded.append(f)
            continue

        # Name the prefix tree graph as the file.
        T.set_name(f)
        tries_dict[f] = T

        # Enable output
        # sys.stdout = sys.__stdout__
        # sys.stderr = sys.__stderr__

        i += 1

    return tries_dict


def compilation_test(file_paths, cpp_flag) -> list:

    clangcmd = "clang++-7" if cpp_flag else "clang-7"
    not_passed = []
    for i, f in enumerate(file_paths, start=1):
        logger.info(f"[{i}/{len(file_paths)}] compilation test for {f}...")

        cmd = f"{clangcmd} {f} -O0"
        if utils.execute_shell_cmd(cmd) != 0:
            not_passed.append(f)
            logger.info("not ok.")
        else:
            logger.info("ok.")

    return not_passed


def main() -> None:

    start = time.time()

    # TODO
    # -cpp -c -v -s -?cut? -lp LP_BEG LP_END -m ?ID?
    # -o --out OUT_FILENAME
    # -l --log LOG_LEVEL

    # CLI args
    parser: argparse.ArgumentParser = argparse.ArgumentParser()

    parser.add_argument("--log", type=(lambda x: getattr(logging, x)),
                        default=logging.DEBUG, help="set log level.")
    parser.add_argument("files", type=argparse.FileType('r'), nargs="*",
                        help="input source files")
    parser.add_argument("-cpp", "--use-clang-cpp", action="store_true",
                        default=False, help="use clang++ instead of clang")
    parser.add_argument("-ctest", "--compile-test", action="store_true",
                        default=False,
                        help="do preliminary compilation test on files")
    parser.add_argument("-od", "--out-dir",
                        default=pathlib.Path("."),
                        help="output directory")
    args = parser.parse_args()

    # Set log level.
    # logger.setLevel(args.log)

    file_paths: list[pathlib.Path] = \
        [pathlib.Path(f.name) for f in args.files]

    print(f"Total files selected: {len(file_paths)}.")

    if args.compile_test:
        logger.debug("Executing compilation test...")
        not_compiles = compilation_test(file_paths, args.use_clang_cpp)
        if len(not_compiles) > 0:
            logger.info("One or more files does not compile.")
            logger.debug(not_compiles)
            exit(1)

    file_dict = {}
    excluded = []
    print("Generating LLVMIRs...")
    for i, f in enumerate(file_paths, start=1):
        logger.info(f"[{i}/{len(file_paths)}] Generating LLVMIR for {f}...")
        print(f"[{i}/{len(file_paths)}]", end="")
        # Generate LLVMIR
        try:
            file_dict[f.name] = utils.c_to_ll(f.absolute(), args.use_clang_cpp)
        except BaseException:
            excluded.append(f.name)
    print("done.")

    lp = range(3, 10)  # range(3,10)
    const_flag = [True, False]
    sty_flag = [True, False]
    var_flag = [True, False]
    cut_flag = [True, False]
    map_ids = range(0, 5)

    confs = list(itertools.product(lp, const_flag, var_flag, sty_flag,
                                   cut_flag, map_ids))
    conf_keys = ["lp", "const", "var", "sty", "cut", "mapID"]
    confs = [dict(zip(conf_keys, i)) for i in confs]

    out_dir = pathlib.Path(args.out_dir)
    if not os.path.exists(out_dir):
        os.makedirs(out_dir)

    with logging_redirect_tqdm():
        for c in tqdm.tqdm(confs):

            # logger.info(f"[{i}/{len(confs)}] conf {c}")

            # Generate Tries.
            tries_dict = generate_tries(file_dict, c, args.use_clang_cpp,
                                        excluded)

            # Generate DF.
            global_list = set()
            for lk in [T.get_paths().keys() for _, T in tries_dict.items()]:
                for k in lk:
                    global_list.add(k)

            list_of_lines = []
            for k, trie in tries_dict.items():
                feature_vector = trie.get_paths()
                feature_vector = {k: int(v) for k, v in feature_vector.items()}
                for k in global_list:
                    if k not in feature_vector.keys():
                        feature_vector[k] = 0
                feature_vector["id"] = trie.get_name()
                list_of_lines.append(feature_vector)

            df = pd.DataFrame(list_of_lines)
            timestamp: str = time.strftime('%Y%m%d-%H%M%S', time.localtime())
            conf_str = "-".join(f"{k}:{v}" for k, v in c.items())
            filename = timestamp + "-" + conf_str + ".csv"
            df.to_csv(out_dir / filename)

            del tries_dict

    end = time.time()
    print(f"Excluded files: {excluded}")
    print(f"Total elapsed time (minutes): {(end - start) / 60}")


if __name__ == "__main__":
    main()
