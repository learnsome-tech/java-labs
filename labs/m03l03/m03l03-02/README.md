# m03l03-02 · Filter then map

**Lesson:** [The Streams API](https://learnsome.tech/learn/java-course/m03l03) (lesson 3.3, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Graded

## Goal

You can build a stream pipeline that filters, transforms, and collects data without mutating its source.

In the lesson: This pipeline starts with three names. Filter keeps only names that begin with the letter A. Map transforms each remaining name to uppercase, and to list materializes the result as a list. Nothing happens while the stream is being assembled. The terminal operation starts the work, and the printed list contains ADA and ANA in encounter order. Each operation says what should happen to the data, leaving the source untouched and avoiding a temporary list for every step.

## Files

- [`starter/Names.java`](starter/Names.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m03l03/m03l03-02/starter`
2. Read `Names.java`.
3. Run it: `java Names.java`.
4. Check it from the repository root: `./check m03l03-02`.

## Expected output

```text
[ADA, ANA]
```

## How to check

`./check m03l03-02` copies `starter/` into a scratch directory and runs `java Names.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
