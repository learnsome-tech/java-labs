# m03l01-02 · Three collection shapes

**Lesson:** [The Collections Framework](https://learnsome.tech/learn/java-course/m03l01) (lesson 3.1, module 3: Collections, Streams, And Optional) · Pro  
**Check:** Graded

## Goal

You can choose lists, sets, and maps by the access and uniqueness guarantees your API needs.

In the lesson: This program builds the three common shapes from the same input. The list keeps both copies, so its size is two. The linked set removes the duplicate while retaining encounter order, so its size is one. The map stores a count under the key a, and get retrieves two. The declarations use interfaces while the first two constructions choose implementations. That keeps callers focused on the behavior they need and leaves room to change the implementation later. The printed line makes each guarantee visible.

## Files

- [`starter/CollectionShapes.java`](starter/CollectionShapes.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m03l01/m03l01-02/starter`
2. Read `CollectionShapes.java`.
3. Run it: `java CollectionShapes.java`.
4. Check it from the repository root: `./check m03l01-02`.

## Expected output

```text
2 1 2
```

## How to check

`./check m03l01-02` copies `starter/` into a scratch directory and runs `java CollectionShapes.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m03l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
