# m05l02-02 · A Jackson record model

**Lesson:** [Working With Jackson](https://learnsome.tech/learn/java-course/m05l02) (lesson 5.2, module 5: JSON And Testing) · Pro  
**Check:** Read along

## Goal

You can configure Jackson for records, read JSON into types, and keep serialization failures at an API boundary.

In the lesson: This record is a small Jackson model with two components. Jackson can use the component names as JSON field names and construct the record from matching input. Keeping the model separate from a persistence entity makes the wire contract explicit. If the public field names differ from Java names, configure a naming strategy or annotate the component, then test the exact JSON shape at the boundary.

## Files

- [`starter/Message.java`](starter/Message.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/Message.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m05l02-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m05l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
