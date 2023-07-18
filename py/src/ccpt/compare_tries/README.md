# Compare Trie
This folder contains all the files needed to compare to tries,
generated with the 'cfg_to_trie' routine.

##### scores.csv
The 'scores.csv' file contains the results of all the comparison made
using the command `cmptries`. 

It is a simple csv file that contains, for every row, the names of 
the two compared files along with the two jaccard scores.

##### data.csv
The 'data.csv' files contains a list of results obtained comparing two different
tries. The number after '.tmp' in the folder name tells us the lenght of the 
path used in the generation of the trie.
Inside every folder four folders can be found: const-var, noconst-var, 
const-novar and noconst-novar.
Each name tells us what kind of setting was used in the generations of the 
tries, e.g. const-var means that the constants and the variables were present
in the generation fo the tries.

After that two number can be found: the first is the result of 'jaccard1' and 
the second is the 'jaccard2' between the two tries specified in the
corresponding line.

##### cross_comparison.py
This file allows to create the 'data.csv' file.

##### data_Analysis
This is a Jupyter Notebook that contains a lot of different checks to verify 
and to analize the data of 'data.csv'

