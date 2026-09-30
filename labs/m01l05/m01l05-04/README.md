# m01l05-04 · Running it, then running it again

**Lesson:** [The Toolchain: Gradle](https://learnsome.tech/learn/java-course/m01l05) (lesson 1.5, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a Gradle build script, run its test task through the wrapper, explain what up to date means, and choose between Maven and Gradle for a new service with reasons.

In the lesson: Into the Gradle project and run the test task, through the wrapper again, for the same reason as before: the wrapper pins the version so every machine agrees. Three tasks ran. Now run the same work a second time, without changing a single file, and filter the output down to the test task and the result. Both the test compilation and the test run report that they are up to date, and nothing is executed. Gradle knows what those tasks read and what they write, it knows none of those files changed, and it refuses to do the work twice. On a project of any size, that is the difference between a build you run constantly and one you avoid.

## Files

- [`starter/session-running-it-then-running-it-again.sh`](starter/session-running-it-then-running-it-again.sh): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/session-running-it-then-running-it-again.sh` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l05-04` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
