
# Unique Team Generator

This java project is made to generate unique teams using number starting from 1.

## What's the use of this project ?

This project is done to overcome the problem of generating random teams for a purpose. For example let a class consits of n students and must be divided into x sized teams for conducting mini projects . At that time this project will come in handy to quickly generate random unique teams.

## Features

- Takes input of total candidates and size of per team.
- Generates uniques team.
- when there is shortage of candidates for a team , it adds an extra number which is more than the number of candidates.
- Repository already contains pre-compiled class files.
- IDE setup codes are already present for VS Code and IntelliJ IDEA


## Prerequisite

To run this project, you need to have java installed in your computer. Visual Studio Code , IntelliJ IDEA or any such IDE is preferred to run this project.



## Installation

Check whether java is installed in your computer or not. You can download java from [oracle](https://www.oracle.com/in/java/technologies/downloads/). Skip these if you have already installed.

Check java Installation using command prompt.

```bash
java -- version
```
you should get an output similar to the output given below if java is installed.
```bash
java 20.0.2 2023-07-18
Java(TM) SE Runtime Environment (build 20.0.2+9-78)
Java HotSpot(TM) 64-Bit Server VM (build 20.0.2+9-78, mixed mode, sharing)
```



## Working

Run the project from `App.java` file . The repository contains pre-compiled class files. If not present , compile it and then run the project.



## Drawbacks

The project has some drawbacks.

- lacks UI interface.
- one of the team will fall short of candidates if total candidates fall short.
- uses dummy values greater than the total candidates when there is shortage of the same.
- generates values starting form 1 only and not between a range.
- the project has a possibility of looping for infinity times and the looping might not stop. 
```bash
// looping statement which might not break
do{
    x = rd.nextInt(total); // can keep on generating random numbers 
                           // which might be present in the "done" array
}while(done.contains(x));
```
## Support

- Email : pratham20442@gamil.com 
- github : https://github.com/pratham-ak2004
- linkedin : https://www.linkedin.com/in/pratham-a-kadekar-8397a7249/