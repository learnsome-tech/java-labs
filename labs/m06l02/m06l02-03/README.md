# m06l02-03 · An explicit application entry point

**Lesson:** [Spring Boot Auto Configuration](https://learnsome.tech/learn/java-course/m06l02) (lesson 6.2, module 6: Spring Boot Fundamentals) · Pro  
**Check:** Read along

## Goal

You can describe how Spring Boot selects infrastructure from the classpath and explicit application settings.

In the lesson: The spring boot application annotation combines component scanning, auto configuration, and a configuration declaration. The main method asks Spring application to create the context and start the application. Boot reads the classpath and configuration while it builds that context. The annotation does not implement an endpoint or a business rule; it establishes the boundary where framework infrastructure becomes available to application beans.

## Files

- [`starter/Application.java`](starter/Application.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Application.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m06l02-03` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m06l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
