# m03l03-03 · A pipeline with a named predicate

**Lesson:** [The Streams API](https://learnsome.tech/learn/java-course/m03l03) (lesson 3.3, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Read along

## Goal

You can build a stream pipeline that filters, transforms, and collects data without mutating its source.

In the lesson: This method turns user records into the names of active users. The method references say which record component supplies the predicate and which supplies the final value. The pipeline is short because the domain type carries its own accessors. The result is a list created by the terminal operation, while the input list stays as it was. A stream pipeline is easiest to maintain when each step has one clear job and the method name explains the resulting view.

## Files

- [`starter/ActiveUsers.java`](starter/ActiveUsers.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/ActiveUsers.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m03l03-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
