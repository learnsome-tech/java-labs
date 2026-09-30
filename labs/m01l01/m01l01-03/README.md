# m01l01-03 · Doing by hand what a build tool would do

**Lesson:** [The Virtual Machine, The Kit And The Runtime](https://learnsome.tech/learn/java-course/m01l01) (lesson 1.1, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can say exactly what the virtual machine, the runtime and the development kit each are, compile and run a program by hand without a build tool, and read the bytecode a class file holds.

In the lesson: No build tool here, just the two commands underneath every build tool. Change into the folder with the source in it. Run the compiler, giving it the name of the source file. It says nothing, which is how compilers report success. List the folder and there is a new file, with the same name and the class extension. That file is what actually runs. Now start the virtual machine and hand that name to it, without any extension, because you are naming a class and not a file. Out comes the line. Everything Maven and Gradle do later is bookkeeping on top of exactly these two steps.

## Files

- [`starter/session-doing-by-hand-what-a-build-tool-would-do.sh`](starter/session-doing-by-hand-what-a-build-tool-would-do.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-doing-by-hand-what-a-build-tool-would-do.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l01-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
