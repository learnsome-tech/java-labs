# m06l03-02 · Typed service settings

**Lesson:** [Configuration And Profiles](https://learnsome.tech/learn/java-course/m06l03) (lesson 6.3, module 6: Spring Boot Fundamentals) · Pro  
**Check:** Read along

## Goal

You can bind typed configuration and select environment specific profiles without changing application code.

In the lesson: This record binds properties whose names begin with service. The application receives a typed name and timeout rather than reading strings from a global environment in every method. A validation annotation could reject a negative timeout at startup. Grouped settings are easier to document, test, and review than scattered property lookups. The prefix is part of the external contract, so changes to it should be deliberate and compatible.

## Files

- [`starter/ServiceSettings.java`](starter/ServiceSettings.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/ServiceSettings.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m06l03-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m06l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
