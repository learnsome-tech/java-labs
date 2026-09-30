# m01l03-07 · Skipping the class file for a quick script

**Lesson:** [The Lifecycle Of A Java Program](https://learnsome.tech/learn/java-course/m01l03) (lesson 1.3, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can trace a program from source to class file to loaded class to native code, explain when a class is initialised, and use the single file launcher for a quick script.

In the lesson: One convenience worth knowing. In the folder once more, with nothing compiled in it, hand the source file itself to the launcher rather than a class name. It compiles in memory and runs, and when you list the folder afterwards there is nothing new on disk: two source files, and not one class file. That is the single file launcher, and it makes Java usable for the kind of twenty line script people normally reach for another language to write. It is not how you ship anything, and it stops being an option the moment you have more than one source file to build.

## Files

- [`starter/session-skipping-the-class-file-for-a-quick-script.sh`](starter/session-skipping-the-class-file-for-a-quick-script.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-skipping-the-class-file-for-a-quick-script.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l03-07` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
