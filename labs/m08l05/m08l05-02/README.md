# m08l05-02 · The service path in one view

**Lesson:** [Tying It All Together](https://learnsome.tech/learn/java-course/m08l05) (lesson 8.5, module 8: Persistence And Integration Testing) · Pro  
**Check:** Read along

## Goal

You can trace an API request through controller, service, repository, database, and tested response.

In the lesson: The service receives a repository through its constructor, looks up an entity, maps it to a response view, and throws when the resource is absent. In a complete application the controller advice would translate that failure into problem details. The service does not know HTTP, JSON, or database sessions. That separation lets unit tests supply a repository fake and integration tests prove that the real repository and database agree with the same use case.

## Files

- [`starter/OrderUseCase.java`](starter/OrderUseCase.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/OrderUseCase.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m08l05-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m08l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
