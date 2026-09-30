# m02l03-03 · Value equality comes for free

**Lesson:** [Records And Data Classes](https://learnsome.tech/learn/java-course/m02l03) (lesson 2.3, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Graded

## Goal

You can model immutable API data with records and know when a full class is the better choice.

In the lesson: Two separately created points can still represent the same value. The record compiler generates equals by comparing each component, so this program prints true. It also generates a matching hash code, which makes records safe keys when their components are suitable keys themselves. The accessor names are x and y, without a get prefix. That small convention reads naturally in mapping code. If equality should depend on an external identifier or mutable state, a record may be the wrong tool and a regular class gives you more control.

## Files

- [`starter/RecordEquality.java`](starter/RecordEquality.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m02l03/m02l03-03/starter`
2. Read `RecordEquality.java`.
3. Run it: `java RecordEquality.java`.
4. Check it from the repository root: `./check m02l03-03`.

## Expected output

```text
true
```

## How to check

`./check m02l03-03` copies `starter/` into a scratch directory and runs `java RecordEquality.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
