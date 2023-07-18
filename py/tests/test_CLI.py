import pytest
import os
import pathlib
import tempfile
import subprocess


class TestCLI():

    # ---- GENLL ----

    def test_genll_CLI(self):
        """
        Tests CLI of 'genll' command.
        """

        # Default output
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            subprocess.run(["genll", "input.c"],
                           cwd=tmpdir)

            # Check if file 'input.ll' was created.
            tmpfileout = tmpdir / "input.ll"
            assert os.path.exists(tmpfileout)

        # CLI option '-o'
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            subprocess.run(["genll", "input.c", "-o", "newfilename.ll"],
                           cwd=tmpdir)

            # Check if file 'newfilename.ll' was created.
            tmpfileout = tmpdir / "newfilename.ll"
            assert os.path.exists(tmpfileout)
            tmpfileout = tmpdir / "newfilename"
            assert not os.path.exists(tmpfileout)
            tmpfileout = tmpdir / "input.ll"
            assert not os.path.exists(tmpfileout)

        # CLI option '-o' - 2
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            subprocess.run(["genll", "input.c", "-o", "newfilename"],
                           cwd=tmpdir)

            # Check if file 'newfilename' was created.
            tmpfileout = tmpdir / "newfilename"
            assert os.path.exists(tmpfileout)
            tmpfileout = tmpdir / "newfilename.ll"
            assert not os.path.exists(tmpfileout)
            tmpfileout = tmpdir / "input.ll"
            assert not os.path.exists(tmpfileout)

    def test_genll_clang_error(self):
        """
        Tests 'genll' behaviour when clang error occurs.
        """

        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ syntax_error }")

            with pytest.raises(subprocess.CalledProcessError):
                subprocess.run(["genll", "input.c"],
                               cwd=tmpdir, check=True)

            tmpfileout = tmpdir / "input.ll"
            assert not os.path.exists(tmpfileout)

    # ---- GENTRIE ----

    def test_gentrie_CLI(self):
        """
        Tests CLI of 'gentrie' command.
        """

        # Default.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.dot"
            samplefile = pathlib.Path("tests/data/a-cfg-sample.dot")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gentrie", "input.dot"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            assert files == set(["input.dot", "trie-input.dot", "ccpt.log"])

        # Default and '-e'.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.dot"
            samplefile = pathlib.Path("tests/data/a-cfg-sample.dot")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gentrie", "input.dot", "-e"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.dot", "trie-input.dot", "input.grapes",
                            "trie-input.pdf", "ccpt.log"])
            assert files == expfiles

        # '-e'.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.dot"
            samplefile = pathlib.Path("tests/data/a-cfg-sample.dot")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gentrie", "input.dot", "-e"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.dot", "trie-input.dot",
                            "input.grapes", "trie-input.pdf", "ccpt.log"])
            assert files == expfiles

        # '-o' and '-e'.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.dot"
            samplefile = pathlib.Path("tests/data/a-cfg-sample.dot")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gentrie", "input.dot", "-e", "-o", "output.dot"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.dot", "output.dot",
                            "input.grapes", "output.pdf", "ccpt.log"])
            assert files == expfiles

    # ---- GENCFG ----

    def test_gencfg_CLI_def(self):
        """
        Test 'gencfg' CLI default.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "acfg-input.dot", "ccpt.log"])
            assert files == expfiles

    def test_gencfg_CLI_e(self):
        """
        Test 'gencfg' CLI with extra output.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll", "-e"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "acfg-input.dot", "ccpt.log",
                            # "ocfg-input.dot", "ocfg-input.pdf",
                            "acfg-input.pdf"])
            assert files == expfiles

    def test_gencfg_CLI_e_o(self):
        """
        Test 'gencfg' CLI with extra output and specifing output name.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll", "-e", "-o", "myout.dot"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "myout.dot",
                            # "ocfg-myout.dot", "ocfg-myout.pdf",
                            "myout.pdf", "ccpt.log"])
            assert files == expfiles

    def test_gencfg_CLI_e_o_2(self):
        """
        Test 'gencfg' CLI with extra output and specifing output name.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll", "-e", "-o", "myout"],
                           cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "myout",
                            # "ocfg-myout.dot", "ocfg-myout.pdf",
                            "myout.pdf", "ccpt.log"])
            assert files == expfiles

    def test_gencfg_CLI_e_main(self):
        """
        Test 'gencfg' CLI with extra output.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll", "-e",
                            "-fn", "main"], cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "acfg-input-main.dot", "ccpt.log",
                            "ocfg-input-main.dot", "ocfg-input-main.pdf",
                            "acfg-input-main.pdf"])
            assert files == expfiles

    def test_gencfg_CLI_e_o_main(self):
        """
        Test 'gencfg' CLI with extra output and specifing output name.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll", "-e", "-o", "myout.dot",
                            "-fn", "main"], cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "myout.dot",
                            "ocfg-myout.dot", "ocfg-myout.pdf",
                            "myout.pdf", "ccpt.log"])
            assert files == expfiles

    def test_gencfg_CLI_e_o_2_main(self):
        """
        Test 'gencfg' CLI with extra output and specifing output name.
        """
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.ll"
            samplefile = pathlib.Path("tests/data/ll-sample.ll")
            with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
                for line in sf:
                    tf.write(line)

            subprocess.run(["gencfg", "input.ll", "-e", "-o", "myout",
                            "-fn", "main"], cwd=tmpdir)

            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.ll", "myout",
                            "ocfg-myout.dot", "ocfg-myout.pdf",
                            "myout.pdf", "ccpt.log"])
            assert files == expfiles

    # OUTDATED: from acfg+callgraph support, if function is not specified
    # the program creates a complete acfg instead of raising an exception.
    #
    # def test_gencfg_CLI_must_specify_function(self):
    #     """
    #     Test 'gencfg' CLI with extra output and specifing output name.
    #     """
    #     with tempfile.TemporaryDirectory() as tmpdirname:
    #         tmpdir = pathlib.Path(tmpdirname)
    #         tmpfile = tmpdir / "input.ll"
    #         samplefile = pathlib.Path("tests/data/ll-two-function-sample.ll")
    #         with open(samplefile, "r") as sf, open(tmpfile, "w") as tf:
    #             for line in sf:
    #                 tf.write(line)
    #         with pytest.raises(subprocess.CalledProcessError):
    #             subprocess.run(["gencfg", "input.ll"],
    #                 cwd=tmpdir, check=True)
    #         files = set(os.listdir(tmpdirname))
    #         expfiles = set(["input.ll", "ccpt.log"])
    #         assert files == expfiles

    # ---- CFGTOTRIE (run all) ----

    def test_cfgtotrie_CLI_def(self):
        """
        Tests CLI of 'cfgtotrie' command.
        """

        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            subprocess.run(["cfgtotrie", "input.c"],  # TODO: _2 temp.
                           cwd=tmpdir)

            # Check if only file 'trie-acfg-input.dot' was created.
            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.c", "trie-acfg-input.dot", "ccpt.log"])
            assert files == expfiles

    def test_cfgtotrie_CLI_o(self):
        """
        Tests CLI of 'cfgtotrie' command.
        """

        # With extension.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            subprocess.run(["cfgtotrie", "input.c", "-o", "myout.dot"],
                           cwd=tmpdir)

            # Check if only file 'trie-acfg-input.dot' was created.
            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.c", "myout.dot", "ccpt.log"])
            assert files == expfiles

        # Without extension.
        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            subprocess.run(["cfgtotrie", "input.c", "-o", "myout"],
                           cwd=tmpdir)

            # Check if only file 'trie-acfg-input.dot' was created.
            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.c", "myout", "ccpt.log"])
            assert files == expfiles

    def test_cfgtotrie_CLI_must_specify_function(self):
        """
        Tests CLI of 'cfgtotrie' command.
        """

        with tempfile.TemporaryDirectory() as tmpdirname:

            tmpdir = pathlib.Path(tmpdirname)
            tmpfile = tmpdir / "input.c"
            tmpfile.write_text("int main(){ return 0; }")

            # Check that program ends with error.
            with pytest.raises(subprocess.CalledProcessError):
                subprocess.run(["cfgtotrie", "input.cc"],
                               cwd=tmpdir, check=True)

            # Check no file was generated.
            files = set(os.listdir(tmpdirname))
            expfiles = set(["input.c", "ccpt.log"])
            assert files == expfiles
