# m02l04-02 · Three permitted outcomes

**Lesson:** [Sealed Types And Exhaustiveness](https://learnsome.tech/learn/java-course/m02l04) (lesson 2.4, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can constrain an inheritance hierarchy with sealed types and make every permitted case explicit in a switch.

In the lesson: This sealed interface names exactly three permitted outcomes. Each outcome is a record, so its data and its place in the family are visible together. Approved and pending carry an identifier, while declined carries a reason. The empty interface body is enough because the hierarchy is the contract. If a fourth implementation appears without being permitted, the compiler rejects it. That gives an API author a useful guard: the response mapping must be updated whenever the domain grows a new outcome.

## Files

- [`starter/PaymentResult.java`](starter/PaymentResult.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/PaymentResult.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l04-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
