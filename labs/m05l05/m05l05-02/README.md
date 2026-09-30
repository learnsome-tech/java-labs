# m05l05-02 · Injecting a clock

**Lesson:** [Designing Testable Code](https://learnsome.tech/learn/java-course/m05l05) (lesson 5.5, module 5: JSON And Testing) · Pro  
**Check:** Read along

## Goal

You can separate side effects from decisions and inject collaborators so unit tests stay fast and focused.

In the lesson: The expiry decision receives a clock through its constructor instead of reading the system clock directly. Production code can pass the system clock, while a test can pass a fixed clock and choose the exact instant. The method then contains only one decision and one dependency. Constructor injection makes the requirement visible and prevents a hidden global from changing test results. The same pattern works for repositories, clients, and message publishers.

## Files

- [`starter/Expiry.java`](starter/Expiry.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Expiry.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m05l05-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m05l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
