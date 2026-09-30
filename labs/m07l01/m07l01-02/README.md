# m07l01-02 · A mapped controller

**Lesson:** [Controllers And Routing](https://learnsome.tech/learn/java-course/m07l01) (lesson 7.1, module 7: Building APIs With Spring Boot) · Pro  
**Check:** Read along

## Goal

You can map HTTP requests to Spring controllers and keep transport code separate from application services.

In the lesson: The rest controller annotation makes the class a web endpoint whose return values become response bodies. The get mapping annotation connects a get request for orders to the list method. This tiny method returns a string only to keep the transport boundary visible. A real controller would inject a service and return a response model. The path and verb are public API, so changing either needs the same care as changing a method signature.

## Files

- [`starter/GreetingController.java`](starter/GreetingController.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/GreetingController.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m07l01-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m07l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
