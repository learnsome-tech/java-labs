# m05l03-02 · A JUnit five test shape

**Lesson:** [Testing Basics With JUnit 5](https://learnsome.tech/learn/java-course/m05l03) (lesson 5.3, module 5: JSON And Testing) · Pro  
**Check:** Read along

## Goal

You can structure a JUnit five test around a behavior and read failures as feedback about a contract.

In the lesson: This test imports the JUnit five test annotation and an assertion. The method name describes the behavior in plain language. It calls the production method with one input and checks the complete returned value. The test has no setup ceremony because the example has no external dependency. In a larger test, keep arrangement visible and avoid hiding the rule inside a helper that makes the failure difficult to read.

## Files

- [`starter/GreetingTest.java`](starter/GreetingTest.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/GreetingTest.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m05l03-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m05l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
