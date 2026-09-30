# m01l02-04 · Asking the running machine its own version

**Lesson:** [Release Trains And Long Term Support](https://learnsome.tech/learn/java-course/m01l02) (lesson 1.2, module 1: Ecosystem And Toolchain) · Free  
**Check:** Graded

## Goal

You can explain the six month release train, say what long term support actually guarantees, read the version of a running machine, and target an older release from a newer compiler.

In the lesson: A program can ask the same question while it is running. The version object has a feature method, which gives the number people mean when they say which Java is this. The second line uses a fact worth knowing: the class file version you saw from the disassembler is the feature number plus a fixed offset of forty four. Run that on this machine and you get twenty one, then sixty five, which is exactly the number the disassembler printed a moment ago. Seventeen plus forty four is sixty one, which is the other number you saw. Two views of one fact, and now neither of them is a mystery.

## Files

- [`starter/WhichJava.java`](starter/WhichJava.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m01l02/m01l02-04/starter`
2. Read `WhichJava.java`.
3. Notes from the lesson:
   - Line 6: class file version is the feature number plus forty four
4. Run it: `java WhichJava.java`.
5. Check it from the repository root: `./check m01l02-04`.

## Expected output

```text
feature: 21
class file: 65
```

## How to check

`./check m01l02-04` copies `starter/` into a scratch directory and runs `java WhichJava.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
