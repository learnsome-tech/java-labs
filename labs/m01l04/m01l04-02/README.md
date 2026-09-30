# m01l04-02 · The project object model, at the top

**Lesson:** [The Toolchain: Maven](https://learnsome.tech/learn/java-course/m01l04) (lesson 1.4, module 1: Ecosystem And Toolchain) · Free  
**Check:** Read along

## Goal

You can read a project object model file, name the coordinates of a dependency, run the build lifecycle through the wrapper, and say which phase produced which file under the target directory.

In the lesson: Maven's project file is called the project object model, and it is a single file of declarations. The schema header at the top never changes and nobody reads it. What matters starts below. Three coordinates: the group, which is usually a reversed domain name, the artifact name, and the version. Together they are the address of this project, and they are exactly the same three values you will use to depend on somebody else's work. Then the properties block, where this project fixes the Java release the compiler targets, the source encoding, and a version number it will reuse below rather than repeat.

## Files

- [`starter/PROJECT.txt`](starter/PROJECT.txt)
- [`starter/pom.xml`](starter/pom.xml): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/pom.xml` alongside the lesson.
2. Follow it the way the lesson builds it:
   - Lines 1–5: the schema header
   - Lines 6–11: three coordinates
   - Lines 12–17: the properties block
3. Notes from the lesson:
   - Line 9: group, artifact and version: the address of this project

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m01l04-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
