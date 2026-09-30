# m07l02-02 · Binding request data

**Lesson:** [Reading The Request](https://learnsome.tech/learn/java-course/m07l02) (lesson 7.2, module 7: Building APIs With Spring Boot) · Pro  
**Check:** Read along

## Goal

You can bind path variables, query parameters, headers, and request bodies to typed controller arguments.

In the lesson: The path variable binds the identifier from the route. The request parameter binds an optional verbose flag and supplies false when the client omits it. Spring converts the text value into a boolean before the method runs. In a production controller, conversion failures should become a clear client error through the exception handling policy. The method signature documents exactly which request data it needs.

## Files

- [`starter/RequestController.java`](starter/RequestController.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/RequestController.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m07l02-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m07l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
