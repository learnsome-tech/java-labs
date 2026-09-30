# m01l01-05 · Reading the bytecode the compiler wrote

**Lesson:** [The Virtual Machine, The Kit And The Runtime](https://learnsome.tech/learn/java-course/m01l01) (lesson 1.1, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can say exactly what the virtual machine, the runtime and the development kit each are, compile and run a program by hand without a build tool, and read the bytecode a class file holds.

In the lesson: The kit ships a disassembler, so none of this has to be taken on trust. Change back into the folder, compile once more, then run the disassembler on the class, and read the first few lines. There is a constructor you never wrote, because every class gets one if you do not write one yourself. Inside it, three instructions: load this, call the constructor of the parent class, return. Those are bytecode instructions, each with its offset in the method. You will not write bytecode, but being able to look at it turns the compiler from magic into a tool whose output you can inspect when something surprises you.

## Files

- [`starter/session-reading-the-bytecode-the-compiler-wrote.sh`](starter/session-reading-the-bytecode-the-compiler-wrote.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-reading-the-bytecode-the-compiler-wrote.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l01-05` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
