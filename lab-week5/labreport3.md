# Lab Report 3
## Part 1 - Bugs
---
---
## Part 2 - Researching Commands
---
Alternative ways to use the comman `find`:
- To find a single file by name, `-name` can be used like this `find /path/to/search -name ".txt"`
- To find files by a type, `type` can be used like this `find /path/to/search -type f`
- To specify the max and min directory levels to look for, `-maxdepth level` and `-mindepth level` can be used like this `find /path/to/search -maxdepth6`
  -- The example would search only up 6 levels.
- To find empty files, `-empty` can be used like this `find /path/to/search -type f -empty`
  -- This is a way to declutter and remove any unwanted files that are empty.
