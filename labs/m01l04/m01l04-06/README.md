# m01l04-06 · Packaging the jar

**Lesson:** [The Toolchain: Maven](https://learnsome.tech/learn/java-course/m01l04) (lesson 1.4, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a project object model file, name the coordinates of a dependency, run the build lifecycle through the wrapper, and say which phase produced which file under the target directory.

In the lesson: Back in the project, ask for the package phase and skip the tests, since the last panel already ran them. The last lines of any Maven build tell you whether it worked and how long it took. The archive is named from those coordinates you read at the top: artifact name, then version, then the extension. Look inside it with the archive tool that ships with the kit, and it is an ordinary zip file: a directory of metadata, a manifest, and then your packages and classes. That is the whole mystery of a jar file. It is a zip with a manifest, and the machine can load classes straight out of it without unpacking anything.

## Files

- [`starter/session-packaging-the-jar.sh`](starter/session-packaging-the-jar.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-packaging-the-jar.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l04-06` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
