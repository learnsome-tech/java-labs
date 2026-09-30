# m05l01-02 · A small JSON shaped string

**Lesson:** [Serialization And JSON](https://learnsome.tech/learn/java-course/m05l01) (lesson 5.1, module 5: JSON And Testing) · Pro  
**Check:** Graded

## Goal

You can explain serialization, JSON shape, and why wire contracts need explicit models.

In the lesson: This program builds a small JSON shaped string and prints it. The escaped quotes are Java syntax that produces ordinary quotes on the wire. Hand building JSON can illustrate a shape, but it becomes unsafe when values contain quotes, nested objects, or arrays. A serializer handles escaping and type conversion consistently. Treat this listing as a view of the contract, then use a library for real requests and responses.

## Files

- [`starter/JsonShape.java`](starter/JsonShape.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m05l01/m05l01-02/starter`
2. Read `JsonShape.java`.
3. Run it: `java JsonShape.java`.
4. Check it from the repository root: `./check m05l01-02`.

## Expected output

```text
{"status":"ready","count":2}
```

## How to check

`./check m05l01-02` copies `starter/` into a scratch directory and runs `java JsonShape.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m05l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
