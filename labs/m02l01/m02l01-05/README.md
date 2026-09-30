# m02l01-05 · A record with a precise shape

**Lesson:** [Primitive And Reference Types](https://learnsome.tech/learn/java-course/m02l01) (lesson 2.1, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can choose suitable primitive and reference types, explain boxing, and avoid accidental null values at an API boundary.

In the lesson: A record is a compact reference type for data with a fixed shape. This customer has an identifier and an email address, and the compiler supplies accessors, equality, and a useful string form. The compact constructor runs before an instance is accepted. It rejects blank fields at the boundary, so later code can trust that those fields are present. The exception text is shown on screen because it is part of the example, while the narration names its meaning in ordinary words. Records become especially useful for request and response models in a web service.

## Files

- [`starter/Customer.java`](starter/Customer.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Customer.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l01-05` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
