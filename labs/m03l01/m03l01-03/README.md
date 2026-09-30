# m03l01-03 · Choosing a linked map

**Lesson:** [The Collections Framework](https://learnsome.tech/learn/java-course/m03l01) (lesson 3.1, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Read along

## Goal

You can choose lists, sets, and maps by the access and uniqueness guarantees your API needs.

In the lesson: This class keeps an index from a string key to a numeric position. The field is declared as a map, but the implementation is a linked map because predictable iteration order matters when the index is displayed or serialized. The field is final, which protects the map reference even though entries can still change. The remember method makes the mutation explicit and keeps callers away from the storage detail. A collection choice is part of a service contract whenever order or uniqueness reaches the response.

## Files

- [`starter/Index.java`](starter/Index.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Index.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m03l01-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
