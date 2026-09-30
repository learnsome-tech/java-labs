# m06l01-02 · A constructor injected service

**Lesson:** [Dependency Injection And The IoC Container](https://learnsome.tech/learn/java-course/m06l01) (lesson 6.1, module 6: Spring Boot Fundamentals) · Pro  
**Check:** Read along

## Goal

You can explain inversion of control and define constructor injected Spring beans.

In the lesson: The service annotation tells Spring to discover this class as a bean. Its constructor requires a clock, and the final field keeps that dependency available after construction. Spring finds a clock bean and supplies it when creating the service. A unit test can call the same constructor with a fixed clock. The class does not search a global container and does not build its own collaborator, so its dependency graph stays explicit.

## Files

- [`starter/GreetingService.java`](starter/GreetingService.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/GreetingService.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m06l01-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m06l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
