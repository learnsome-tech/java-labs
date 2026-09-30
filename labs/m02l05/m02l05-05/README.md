# m02l05-05 · Combining a pattern with a text block

**Lesson:** [Pattern Matching And Text Blocks](https://learnsome.tech/learn/java-course/m02l05) (lesson 2.5, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can use pattern matching to narrow values safely and text blocks to keep multi line payloads readable.

In the lesson: This record keeps an error code and detail, then offers a small JSON shaped view for a test or example. The text block makes the template visible, and formatted substitutes the two component values. In production, hand built JSON becomes fragile as soon as values contain quotes or nested data, so the later Jackson lesson will replace this with serialization. The example still shows a useful boundary: modern syntax can clarify a fixture while a dedicated library enforces the wire format.

## Files

- [`starter/ErrorBody.java`](starter/ErrorBody.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/ErrorBody.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l05-05` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
