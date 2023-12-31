# Lab Report 1
## Example of using the command with no arguments: 

![Image](cdnoarg.png)
- The working directory was /home/lecture1.
- Command produces no output.
- It is not an error as it is simply changing the directory from /lecture1 to /home when using the command cd.

![Image](lsg.PNG)
- The working directory was /home.
- Command lists the files and folder in the path, in this case it is lecture1.
- It is not an error as it is a status-checking command that listed the files in the path.

![Image](catg.PNG)
- The working directory was /home.
- Command produces no output. Should print the contents of the files in path (there is no content to print in path to do this).
- It is not an error as there is nothing to concatenate and thus, does not show any content.
  
## Exmaple of using the command with a path to a directory as an argument: 

![Image](cddirect.PNG)
- The working directory was /home/lecture1/messages that files were cloned into.
- Command produces no output.
- It is not an error as it simply changing the working directory to given path /messages.
  
![Image](lsdirect.PNG) 
- The working directory was /home.
- Command produces a list of the files in lecture1.
- It is not an error as there was access to the path of /home/lecture1 thus being able to output a list of all the files.

![Image](catdirect.PNG) 
- The working directory was /home.
- Command produces a confirmation of how the path was a directory.
- It is an error as there is nothing to concatenate or print and thus, does not print any content.
  
## Example of using the command with a path to a file as an argument: 

![Image](cdpath.png)
- Working directory was /home/lecture1.
- Command produced an error.
- It is an error as it is changing the directory but Hello.java is not a directory. The commands, ls or cat would be utilized to list or print contents of the file.
  
![Image](lspath.png)
- Working directory was /home/lecture1.
- Lists the name of files in directory.
- Command produced an output of "Hello.java"
- It is not an error as it is a status-checking command and listed the file in the directory.
  
![Image](catpath.PNG)
- The working directory was /home.
- Concatenates and prints content, given the path.
- Command produced an output of the contents in the file Hello.java.
- It is a not an error as all contents were printed in the file.
