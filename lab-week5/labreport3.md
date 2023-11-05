# Lab Report 3
## Part 1 - Bugs
---
---
## Part 2 - Researching Commands
---
Alternative ways to use the comman `find`:
- To find a single file by name, `-name` can be used in the form: `find /path/to/search -name ".txt"`
<br />
EXAMPLE 1: `find ./technical -name "chapter-1.txt"`
Output: `./technical/911report/chapter-1.txt`
If the file exists, then the `find` command would return the path to the file. Else, it would not produce output.
<br />
EXAMPLE 2: `find ./technical -name "1468-6708-3-1.txt"`
Output: `./technical/biomed/1468-6708-3-1.txt`
Since the file exist, the `find` command returned the path to get to the file `"1468-6708-3-1.txt"`. Otherwise, it would not produce output if it did not exist in `./technical`
<br /> 
- To find files by a type, `type` can be used like this `find /path/to/search -type f`
- To specify the max and min directory levels to look for, `-maxdepth level` and `-mindepth level` can be used like this `find /path/to/search -maxdepth6`
  -- The example would search only up 6 levels.
- To find empty files, `-empty` can be used like this `find /path/to/search -type f -empty`
  -- This is a way to declutter and remove any unwanted files that are empty.
