# m02l01-03 · Boxing a value into an object

**Lesson:** [Primitive And Reference Types](https://learnsome.tech/learn/java-course/m02l01) (lesson 2.1, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Graded

## Goal

You can choose suitable primitive and reference types, explain boxing, and avoid accidental null values at an API boundary.

In the lesson: Collections store objects, so Java supplies wrapper classes for every primitive. Integer is the object form of int. The assignment to boxed performs boxing, and the assignment to unboxed performs unboxing. The compiler inserts those conversions for you. Here both variables represent the same numeric value, so adding them prints eighty four. The convenience has a cost: boxing creates objects, and unboxing a null reference throws an exception. Keep primitives in tight numeric code, and use wrappers where a collection or a framework requires an object.

## Files

- [`starter/Boxing.java`](starter/Boxing.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m02l01/m02l01-03/starter`
2. Read `Boxing.java`.
3. Run it: `java Boxing.java`.
4. Check it from the repository root: `./check m02l01-03`.

## Expected output

```text
84
```

## How to check

`./check m02l01-03` copies `starter/` into a scratch directory and runs `java Boxing.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
