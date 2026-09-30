# m02l03-05 · A record can derive a view

**Lesson:** [Records And Data Classes](https://learnsome.tech/learn/java-course/m02l03) (lesson 2.3, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can model immutable API data with records and know when a full class is the better choice.

In the lesson: A record may still contain methods that derive useful views. This price stores the smallest unit as a long, then formats that value for a simple display. The stored component stays the source of truth, while the method keeps presentation logic close to the data it describes. Real currency formatting needs locale rules, so treat this as a small illustration rather than a money library. The record remains transparent and value based, even though it has behavior alongside its components.

## Files

- [`starter/Price.java`](starter/Price.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Price.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l03-05` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
