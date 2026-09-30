# m08l03-02 · A MockMvc request

**Lesson:** [Testing APIs With MockMvc](https://learnsome.tech/learn/java-course/m08l03) (lesson 8.3, module 8: Persistence And Integration Testing) · Pro  
**Check:** Read along

## Goal

You can exercise Spring MVC routes with MockMvc and assert status, headers, and JSON response fields.

In the lesson: The request targets one order route, then asserts an okay status and the identifier in the JSON body. A complete test would arrange a service response or test application context before performing the request. Assertions stay at the HTTP boundary, so the test does not depend on private controller fields. Add checks for content type and documented error responses when those are part of the contract.

## Files

- [`starter/OrdersApiTest.java`](starter/OrdersApiTest.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/OrdersApiTest.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m08l03-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m08l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
