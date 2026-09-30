# m02l05-04 · A readable JSON shaped literal

**Lesson:** [Pattern Matching And Text Blocks](https://learnsome.tech/learn/java-course/m02l05) (lesson 2.5, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can use pattern matching to narrow values safely and text blocks to keep multi line payloads readable.

In the lesson: A text block keeps a multi line string close to the shape people read on the wire. Three quote marks open and close it, while the indentation before the content is removed according to the common margin. The JSON punctuation stays in the code where it belongs, rather than being described in narration. Text blocks are useful for test fixtures, example requests, and small documentation snippets. They do not parse JSON or validate a schema by themselves. A real service still delegates those jobs to a library such as Jackson.

## Files

- [`starter/Payload.java`](starter/Payload.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Payload.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l05-04` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
