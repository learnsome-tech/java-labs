# m01l05-03 · Configuring a task

**Lesson:** [The Toolchain: Gradle](https://learnsome.tech/learn/java-course/m01l05) (lesson 1.5, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a Gradle build script, run its test task through the wrapper, explain what up to date means, and choose between Maven and Gradle for a new service with reasons.

In the lesson: The last block reaches into an existing task and changes it. The test task needs to be told to use the modern testing platform, which is one line of switching that people forget and then wonder why no tests run. Below it, logging: by default Gradle prints nothing per test, and this asks for a line whenever a test passes or fails. This is the shape of most Gradle configuration. You are not writing steps to execute. You are finding an object the plugin created and setting properties on it, in a language with types and completion in your editor.

## Files

- [`starter/PROJECT.txt`](starter/PROJECT.txt)
- [`starter/build.gradle.kts`](starter/build.gradle.kts): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/build.gradle.kts` alongside the lesson.
2. Notes from the lesson:
   - Line 2: without this, Gradle would run the old testing library instead

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l05-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
