# m04l05-02 · Compose two asynchronous stages

**Lesson:** [Async With CompletableFuture](https://learnsome.tech/learn/java-course/m04l05) (lesson 4.5, module 4: Exceptions And Concurrency) · Pro  
**Check:** Graded

## Goal

You can compose asynchronous stages, combine results, and handle failures with CompletableFuture.

In the lesson: Supply async creates a future whose task returns ready. Then apply waits for that value and transforms it to uppercase. Join observes the final stage and prints READY. Join wraps a failure in a completion exception, which is often convenient at a boundary where the service will translate the cause. The stages are immutable descriptions, so adding another transformation returns another future rather than changing the earlier one. That makes a chain easier to test and reason about than shared callback state.

## Files

- [`starter/Async.java`](starter/Async.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m04l05/m04l05-02/starter`
2. Read `Async.java`.
3. Run it: `java Async.java`.
4. Check it from the repository root: `./check m04l05-02`.

## Expected output

```text
READY
```

## How to check

`./check m04l05-02` copies `starter/` into a scratch directory and runs `java Async.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m04l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
