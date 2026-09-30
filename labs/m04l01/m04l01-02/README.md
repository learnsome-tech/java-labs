# m04l01-02 · Catch a checked failure

**Lesson:** [Checked Versus Unchecked Exceptions](https://learnsome.tech/learn/java-course/m04l01) (lesson 4.1, module 4: Exceptions And Concurrency) · Pro  
**Check:** Graded

## Goal

You can distinguish checked and unchecked exceptions and choose a boundary where each failure should be handled.

In the lesson: The read method declares a checked input output exception, so its caller must deal with that possibility. The main method catches it and prints the message. A real service would usually translate this failure into a useful response or retry policy instead of printing it. The example keeps the control flow visible: the throw leaves read, the catch receives the exception, and execution continues after the catch block. Checked exceptions make that obligation explicit in the source.

## Files

- [`starter/Checked.java`](starter/Checked.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m04l01/m04l01-02/starter`
2. Read `Checked.java`.
3. Run it: `java Checked.java`.
4. Check it from the repository root: `./check m04l01-02`.

## Expected output

```text
unavailable
```

## How to check

`./check m04l01-02` copies `starter/` into a scratch directory and runs `java Checked.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m04l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
