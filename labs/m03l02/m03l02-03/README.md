# m03l02-03 · Writing to a consumer

**Lesson:** [Generics And Collections](https://learnsome.tech/learn/java-course/m03l02) (lesson 3.2, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Graded

## Goal

You can read wildcard collection types and write methods that safely consume or produce generic values.

In the lesson: The add defaults method accepts a list whose element type is Integer or one of its parents. It can safely add integers because every permitted list can hold them. Reading a value back only gives the broad Object type, since the method does not know the exact element type. The caller supplies a list of Number, receives two values, and prints the list. This is the consumer side of the rule: the list consumes values from the method, so super describes the lower bound.

## Files

- [`starter/Consumer.java`](starter/Consumer.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m03l02/m03l02-03/starter`
2. Read `Consumer.java`.
3. Run it: `java Consumer.java`.
4. Check it from the repository root: `./check m03l02-03`.

## Expected output

```text
[1, 2]
```

## How to check

`./check m03l02-03` copies `starter/` into a scratch directory and runs `java Consumer.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
