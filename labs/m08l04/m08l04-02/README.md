# m08l04-02 · A database container test

**Lesson:** [Database Integration With Testcontainers](https://learnsome.tech/learn/java-course/m08l04) (lesson 8.4, module 8: Persistence And Integration Testing) · Pro  
**Check:** Read along

## Goal

You can run repository tests against a disposable real database and keep schema assumptions visible.

In the lesson: The testcontainers annotation manages the lifecycle of the test class. The container annotation starts a PostgreSQL container before tests and stops it afterward. A real test would connect Spring to the mapped host and port, apply migrations, save an entity, and query it back. Pin the database image version so a future image change is deliberate. The test proves the integration with the database rather than merely proving a mock interaction.

## Files

- [`starter/OrderRepositoryTest.java`](starter/OrderRepositoryTest.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/OrderRepositoryTest.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m08l04-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m08l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
