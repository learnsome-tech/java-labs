# m01l05-02 · A build script, top to bottom

**Lesson:** [The Toolchain: Gradle](https://learnsome.tech/learn/java-course/m01l05) (lesson 1.5, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a Gradle build script, run its test task through the wrapper, explain what up to date means, and choose between Maven and Gradle for a new service with reasons.

In the lesson: The whole build, in about twenty lines. A plugin block first, because a plugin is what adds tasks: this one adds compiling, testing and packaging a library. Then the coordinates of this project, in two lines rather than three elements. Then the toolchain, which is the part Maven has no real equivalent of: you state the Java version the build needs, and Gradle finds it or downloads it, so the build does not depend on what happens to be installed. Then where dependencies come from, then the dependencies themselves, each one string of coordinates with a configuration name in front saying when it applies.

## Files

- [`starter/PROJECT.txt`](starter/PROJECT.txt)
- [`starter/build.gradle.kts`](starter/build.gradle.kts): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/build.gradle.kts` alongside the lesson.
2. Follow it the way the lesson builds it:
   - Lines 1–3: a plugin block
   - Lines 4–12: the toolchain
   - Lines 13–16: where dependencies come from
   - Lines 17–22: the dependencies themselves
3. Notes from the lesson:
   - Line 9: a toolchain: Gradle fetches this Java version if you lack it

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l05-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
