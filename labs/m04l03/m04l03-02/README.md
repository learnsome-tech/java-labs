# m04l03-02 · Start and join one worker

**Lesson:** [Concurrency Basics: Threads And Runnable](https://learnsome.tech/learn/java-course/m04l03) (lesson 4.3, module 4: Exceptions And Concurrency) · Pro  
**Check:** Graded

## Goal

You can start a thread safely, describe shared state risks, and join work before returning a result.

In the lesson: The worker thread prints work, and the main thread joins it before printing done. Joining gives us a stable order for this example. Without the join, the process could finish before the worker prints, or the lines could appear in another order. The lambda is a runnable task, and start creates the separate execution path. In production, prefer an executor for a service with repeated work, because it manages thread reuse and shutdown more deliberately than creating a thread for every request.

## Files

- [`starter/Worker.java`](starter/Worker.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m04l03/m04l03-02/starter`
2. Read `Worker.java`.
3. Run it: `java Worker.java`.
4. Check it from the repository root: `./check m04l03-02`.

## Expected output

```text
work
done
```

## How to check

`./check m04l03-02` copies `starter/` into a scratch directory and runs `java Worker.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m04l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
