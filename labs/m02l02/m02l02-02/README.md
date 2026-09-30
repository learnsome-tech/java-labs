# m02l02-02 · A generic box

**Lesson:** [Generics Fundamentals](https://learnsome.tech/learn/java-course/m02l02) (lesson 2.2, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Read along

## Goal

You can define and use generic classes and methods, read type parameters, and explain why generic collections prevent casts.

In the lesson: This box has one type parameter named T. The field, the put method, and the get method all use that same name, so a box of strings can only put and get strings. The class itself does not know which concrete type will be chosen. That is the useful separation: the implementation is written once, while each caller gets a checked version. The private field protects the value, and the method names describe the two operations plainly. A generic type parameter is a promise carried through an entire API.

## Files

- [`starter/GenericBox.java`](starter/GenericBox.java): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Read `starter/GenericBox.java` alongside the lesson.

## How to check

**Read along.** It is a listing to read alongside the lesson, not a program to run.

There is nothing to check: `./check m02l02-02` says so and moves on.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
