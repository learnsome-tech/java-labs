# m07l04-02 · A problem detail handler

**Lesson:** [Exception Handling To Problem Details](https://learnsome.tech/learn/java-course/m07l04) (lesson 7.4, module 7: Building APIs With Spring Boot) · Pro  
**Check:** Read along

## Goal

You can map application failures to consistent RFC problem detail responses with controller advice.

In the lesson: The rest controller advice annotation applies this handler across controllers. The exception handler annotation connects an order missing failure to the missing method. It creates a problem detail with not found status and a client safe detail message. A complete implementation would also set a stable type and instance, and would handle validation and unexpected failures separately. Centralization prevents each controller from inventing a different error shape.

## Files

- [`starter/ApiAdvice.java`](starter/ApiAdvice.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/ApiAdvice.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m07l04-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m07l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
