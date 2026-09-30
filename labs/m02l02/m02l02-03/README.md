# m02l02-03 · A generic method

**Lesson:** [Generics Fundamentals](https://learnsome.tech/learn/java-course/m02l02) (lesson 2.2, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Graded

## Goal

You can define and use generic classes and methods, read type parameters, and explain why generic collections prevent casts.

In the lesson: A method can declare its own type parameter before its return type. This method accepts two values of one shared type and returns the first. The compiler infers the type from the arguments, so the call does not need to spell out the type name. The result is assigned directly to a string variable, with no cast. If the two arguments do not share a compatible type, compilation stops at the call site. Generic methods are a small tool with a large payoff when a service transforms request data without losing its type.

## Files

- [`starter/GenericMethod.java`](starter/GenericMethod.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m02l02/m02l02-03/starter`
2. Read `GenericMethod.java`.
3. Run it: `java GenericMethod.java`.
4. Check it from the repository root: `./check m02l02-03`.

## Expected output

```text
ready
```

## How to check

`./check m02l02-03` copies `starter/` into a scratch directory and runs `java GenericMethod.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
