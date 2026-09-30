# m03l05-03 · An empty lookup uses a fallback

**Lesson:** [Handling Nulls With Optional](https://learnsome.tech/learn/java-course/m03l05) (lesson 3.5, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Graded

## Goal

You can use Optional to model a possibly missing result without hiding null checks inside business logic.

In the lesson: This time the optional is empty, so or else supplies the word MISSING. The fallback is evaluated before the call, which is fine for a cheap value. When creating the fallback is expensive or has side effects, use or else get so the supplier runs only when needed. Avoid calling get without first proving that a value exists. That moves a missing value into a different exception and hides the decision from the reader.

## Files

- [`starter/Missing.java`](starter/Missing.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m03l05/m03l05-03/starter`
2. Read `Missing.java`.
3. Run it: `java Missing.java`.
4. Check it from the repository root: `./check m03l05-03`.

## Expected output

```text
MISSING
```

## How to check

`./check m03l05-03` copies `starter/` into a scratch directory and runs `java Missing.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
