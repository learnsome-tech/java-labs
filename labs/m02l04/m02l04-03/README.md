# m02l04-03 · Switching over every case

**Lesson:** [Sealed Types And Exhaustiveness](https://learnsome.tech/learn/java-course/m02l04) (lesson 2.4, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can constrain an inheritance hierarchy with sealed types and make every permitted case explicit in a switch.

In the lesson: The switch expression handles every permitted case and returns one string. The arrow form keeps each arm short, while pattern matching binds the current value to a name with its specific type. There is no default arm. Because the input type is sealed, the compiler can check that the three named cases are exhaustive. Omitting one produces a compilation error, which is exactly the feedback you want when an API state changes. Exhaustiveness turns a hidden runtime assumption into a visible build time obligation.

## Files

- [`starter/PaymentText.java`](starter/PaymentText.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/PaymentText.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l04-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
