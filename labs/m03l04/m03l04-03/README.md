# m03l04-03 · Stop when a match appears

**Lesson:** [Advanced Stream Operations](https://learnsome.tech/learn/java-course/m03l04) (lesson 3.4, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Graded

## Goal

You can sort, flatten, group, and short circuit stream pipelines while keeping their cost visible.

In the lesson: Any match asks whether at least one value satisfies a condition. The stream sees two even values, then reaches seven and can stop immediately because the answer is now known. The program prints true without needing to inspect the final eight. This short circuit is useful for existence checks and avoids collecting data you do not need. The condition uses the remainder operator on screen, while the narration calls it a test for an odd value. Keep these predicates small and named when they carry domain meaning.

## Files

- [`starter/AnyMatch.java`](starter/AnyMatch.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m03l04/m03l04-03/starter`
2. Read `AnyMatch.java`.
3. Run it: `java AnyMatch.java`.
4. Check it from the repository root: `./check m03l04-03`.

## Expected output

```text
true
```

## How to check

`./check m03l04-03` copies `starter/` into a scratch directory and runs `java AnyMatch.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
