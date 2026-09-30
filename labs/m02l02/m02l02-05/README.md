# m02l02-05 · A bounded choice

**Lesson:** [Generics Fundamentals](https://learnsome.tech/learn/java-course/m02l02) (lesson 2.2, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can define and use generic classes and methods, read type parameters, and explain why generic collections prevent casts.

In the lesson: The larger method places a bound on T. Every accepted type must be comparable with another value of that same type. That lets the method call compare to without a cast. The conditional expression returns the left value when it is at least as large, otherwise it returns the right value. The import is unused in this small listing and hints at the collection examples ahead. Bounds make a generic method honest about what it needs, and they let the compiler reject a type that has no meaningful ordering.

## Files

- [`starter/Scores.java`](starter/Scores.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Scores.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l02-05` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
