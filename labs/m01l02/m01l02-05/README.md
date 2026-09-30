# m01l02-05 · Compiling for an older machine

**Lesson:** [Release Trains And Long Term Support](https://learnsome.tech/learn/java-course/m01l02) (lesson 1.2, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can explain the six month release train, say what long term support actually guarantees, read the version of a running machine, and target an older release from a newer compiler.

In the lesson: A new compiler can produce class files an older machine will accept, and the release flag is how you ask for that. In the folder again, compile with the release flag naming seventeen, then look at the class file version the disassembler reports. Sixty one. Now compile it again with no flag at all, and look once more: the number moves to sixty five. Each feature release bumps that number by one. An older machine reads the number, decides the file is from the future, and refuses to load it, which is the error you get when a library was built for a newer platform than the one you are running.

## Files

- [`starter/session-compiling-for-an-older-machine.sh`](starter/session-compiling-for-an-older-machine.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-compiling-for-an-older-machine.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l02-05` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
