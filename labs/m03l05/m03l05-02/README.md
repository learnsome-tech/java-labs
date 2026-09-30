# m03l05-02 · Map a present value

**Lesson:** [Handling Nulls With Optional](https://learnsome.tech/learn/java-course/m03l05) (lesson 3.5, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Graded

## Goal

You can use Optional to model a possibly missing result without hiding null checks inside business logic.

In the lesson: The find method returns an optional containing ready. Map transforms the contained string only when it is present, and or else supplies a fallback when it is empty. The program therefore prints READY. There is no explicit null check in the caller, but the missing case is still visible in the final fallback. Use map for a transformation that may preserve absence, and use flat map when the transformation itself already returns an optional. Those two operations keep nested wrappers from leaking into ordinary code.

## Files

- [`starter/Lookup.java`](starter/Lookup.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m03l05/m03l05-02/starter`
2. Read `Lookup.java`.
3. Run it: `java Lookup.java`.
4. Check it from the repository root: `./check m03l05-02`.

## Expected output

```text
READY
```

## How to check

`./check m03l05-02` copies `starter/` into a scratch directory and runs `java Lookup.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
