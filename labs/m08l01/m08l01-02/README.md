# m08l01-02 · A small JPA entity

**Lesson:** [Persistence With JPA And Hibernate](https://learnsome.tech/learn/java-course/m08l01) (lesson 8.1, module 8: Persistence And Integration Testing) · Pro  
**Check:** Read along

## Goal

You can map a domain record to a JPA entity and understand what Hibernate manages for you.

In the lesson: The entity annotation marks this class for persistence and the ID annotation identifies its primary key. The protected no argument constructor lets JPA create the object through its persistence mechanism. Fields map to columns by default, while explicit annotations can control names, relationships, and nullability. A persistence entity is shaped for the database and lifecycle, so it need not be the same type that a controller returns as JSON.

## Files

- [`starter/OrderEntity.java`](starter/OrderEntity.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/OrderEntity.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m08l01-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m08l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
