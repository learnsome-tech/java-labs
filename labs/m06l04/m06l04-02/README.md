# m06l04-02 · A lifecycle pair

**Lesson:** [The Spring Bean Lifecycle](https://learnsome.tech/learn/java-course/m06l04) (lesson 6.4, module 6: Spring Boot Fundamentals) · Pro  
**Check:** Read along

## Goal

You can place initialization and cleanup at the correct Spring lifecycle boundary.

In the lesson: The post construct method runs after dependency injection and before the bean is used. The pre destroy method runs while the context is closing. This pair can open and close a resource owned by the manager, but it should not shut down a shared resource created elsewhere. Keep lifecycle methods short and observable through tests or logs. If initialization can fail, let startup fail with a useful message rather than leaving a half ready bean in the context.

## Files

- [`starter/ConnectionManager.java`](starter/ConnectionManager.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/ConnectionManager.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m06l04-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m06l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
