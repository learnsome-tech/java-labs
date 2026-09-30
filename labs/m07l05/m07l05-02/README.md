# m07l05-02 · A route matching the contract

**Lesson:** [Implementing An OpenAPI Contract](https://learnsome.tech/learn/java-course/m07l05) (lesson 7.5, module 7: Building APIs With Spring Boot) · Pro  
**Check:** Read along

## Goal

You can implement a documented OpenAPI route with matching models, status codes, and error responses.

In the lesson: This controller implements a get route for one order. The path variable and returned record match the documented resource shape. A real implementation would call a service and use the advice policy when the identifier is missing. The important habit is comparison: check the path, verb, request parameters, response fields, and statuses against the specification. A route is complete only when the implementation and document agree.

## Files

- [`starter/OrdersApi.java`](starter/OrdersApi.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/OrdersApi.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m07l05-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m07l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
