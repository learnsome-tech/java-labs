# m02l03-02 · The compact response model

**Lesson:** [Records And Data Classes](https://learnsome.tech/learn/java-course/m02l03) (lesson 2.3, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can model immutable API data with records and know when a full class is the better choice.

In the lesson: This response model has an identifier, a count, and a status. The component list is the public shape, so a reader sees the contract before reading any methods. The compact constructor keeps the same component names and validates the count before the record is built. The fields are final without us writing field declarations. A record is a good fit when identity is the complete combination of its data and there is no separate lifecycle to manage. Validation here protects every caller, whether the object came from a controller or a test.

## Files

- [`starter/OrderSummary.java`](starter/OrderSummary.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/OrderSummary.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l03-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
