# m08l02-02 · A typed repository

**Lesson:** [Spring Data Repositories](https://learnsome.tech/learn/java-course/m08l02) (lesson 8.2, module 8: Persistence And Integration Testing) · Pro  
**Check:** Read along

## Goal

You can define a repository interface, choose query methods deliberately, and keep persistence details out of controllers.

In the lesson: The repository extends a Spring Data interface with the entity type and identifier type. The inherited methods cover common persistence operations, while find by status derives a query from the method name. The return type tells callers that several rows may match. A service can translate these entities into response records and apply application rules before returning them. Keeping the interface small prevents controllers from depending on database vocabulary.

## Files

- [`starter/PersistencePort.java`](starter/PersistencePort.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/PersistencePort.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m08l02-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m08l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
