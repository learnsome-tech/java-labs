# m01l02-02 · What is actually installed here

**Lesson:** [Release Trains And Long Term Support](https://learnsome.tech/learn/java-course/m01l02) (lesson 1.2, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can explain the six month release train, say what long term support actually guarantees, read the version of a running machine, and target an older release from a newer compiler.

In the lesson: Start in the folder, then ask the machine what it is. Three lines come back. The first is the feature version, twenty one here, followed by the patch level and the date this build was made. The second names the runtime, and the third names the virtual machine itself and the mode it is running in. Then ask the compiler separately, because the two can differ on one machine and the difference is a classic source of confusion: a build that compiles and then fails to run. Notice that these lines go to the error stream, not the output stream, which surprises people writing scripts around them.

## Files

- [`starter/session-what-is-actually-installed-here.sh`](starter/session-what-is-actually-installed-here.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-what-is-actually-installed-here.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l02-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
