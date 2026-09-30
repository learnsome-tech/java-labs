# m04l04-02 · Submit and collect a result

**Lesson:** [The ExecutorService](https://learnsome.tech/learn/java-course/m04l04) (lesson 4.4, module 4: Exceptions And Concurrency) · Pro  
**Check:** Graded

## Goal

You can submit tasks to an executor, collect futures, and shut the pool down without leaking worker threads.

In the lesson: The fixed pool owns two workers. Submit receives a callable task that returns forty two, and get waits until the future contains that result. The main method then prints it and shuts the pool down. In a service, get can block a request thread, so choose a timeout or compose work asynchronously when waiting is not acceptable. The finally style in production should still shut the pool down when a task or retrieval fails. Resource ownership is part of the executor contract.

## Files

- [`starter/Pool.java`](starter/Pool.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m04l04/m04l04-02/starter`
2. Read `Pool.java`.
3. Run it: `java Pool.java`.
4. Check it from the repository root: `./check m04l04-02`.

## Expected output

```text
42
```

## How to check

`./check m04l04-02` copies `starter/` into a scratch directory and runs `java Pool.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m04l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
