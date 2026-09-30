# m01l04-03 · Depending on somebody else's work

**Lesson:** [The Toolchain: Maven](https://learnsome.tech/learn/java-course/m01l04) (lesson 1.4, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a project object model file, name the coordinates of a dependency, run the build lifecycle through the wrapper, and say which phase produced which file under the target directory.

In the lesson: Dependencies are the same three coordinates again, one block each. The first dependency here is the library that turns objects into text and back, and naming it is enough: everything it needs arrives with it, resolved and downloaded once into a cache in your home directory. Then the test scope. A dependency in that scope is on the class path while the tests compile and run, and is absent from what you ship, which is exactly right for a testing library. Notice its version: that is the property from the top of the file being expanded here, rather than a number typed twice. Keeping one version in one place is the difference between upgrading a library and hunting for it.

## Files

- [`starter/PROJECT.txt`](starter/PROJECT.txt)
- [`starter/pom.xml`](starter/pom.xml): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/pom.xml` alongside the lesson.
2. Follow it the way the lesson builds it:
   - Lines 1–6: the first dependency
   - Lines 7–11: everything it needs arrives with it
   - Lines 12–17: the test scope

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l04-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
