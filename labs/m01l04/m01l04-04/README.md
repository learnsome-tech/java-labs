# m01l04-04 · Running the lifecycle

**Lesson:** [The Toolchain: Maven](https://learnsome.tech/learn/java-course/m01l04) (lesson 1.4, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a project object model file, name the coordinates of a dependency, run the build lifecycle through the wrapper, and say which phase produced which file under the target directory.

In the lesson: Into the project, and run the test phase. Notice the command: not maven, but a small script in the project called the wrapper, which downloads the exact version of Maven this project expects and uses that. It means a new machine needs no Maven installed, and it means everybody builds with the same one. The build compiled the main code, compiled the tests, and ran them, because a phase always runs every phase before it. Look in the target directory afterwards and you can see each of those steps as a folder: compiled classes, compiled tests, and the reports the test run wrote.

## Files

- [`starter/session-running-the-lifecycle.sh`](starter/session-running-the-lifecycle.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-running-the-lifecycle.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l04-04` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
