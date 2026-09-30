# m07l03-02 · A validated request

**Lesson:** [Validation](https://learnsome.tech/learn/java-course/m07l03) (lesson 7.3, module 7: Building APIs With Spring Boot) · Pro  
**Check:** Read along

## Goal

You can validate request models with Jakarta constraints and return useful field errors to clients.

In the lesson: This request record declares that sku must contain non whitespace text and quantity must be positive. The annotations make the basic contract visible to both the framework and the reader. A controller can mark the body for validation, and Spring will report violations before the service receives the object. The record remains a data model; it does not decide whether the product exists or whether stock is available.

## Files

- [`starter/CreateOrder.java`](starter/CreateOrder.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/CreateOrder.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m07l03-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m07l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
