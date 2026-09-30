# m02l05-02 · Pattern matching narrows a value

**Lesson:** [Pattern Matching And Text Blocks](https://learnsome.tech/learn/java-course/m02l05) (lesson 2.5, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Graded

## Goal

You can use pattern matching to narrow values safely and text blocks to keep multi line payloads readable.

In the lesson: The condition checks that value is a string and binds it as text. The second condition proves that the string is not blank before the body runs. Inside the body, text already has string methods available, so there is no cast to read and no temporary variable to keep in sync. The method returns the uppercase form, and the main method prints READY. If the value is another type or a blank string, control reaches the fallback. This is a small example of turning validation into a value you can safely use.

## Files

- [`starter/Describe.java`](starter/Describe.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m02l05/m02l05-02/starter`
2. Read `Describe.java`.
3. Run it: `java Describe.java`.
4. Check it from the repository root: `./check m02l05-02`.

## Expected output

```text
READY
```

## How to check

`./check m02l05-02` copies `starter/` into a scratch directory and runs `java Describe.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
