# m01l03-02 · One source file, one class file

**Lesson:** [The Lifecycle Of A Java Program](https://learnsome.tech/learn/java-course/m01l03) (lesson 1.3, module 1: Ecosystem And Toolchain) · Free  
**Check:** Graded

## Goal

You can trace a program from source to class file to loaded class to native code, explain when a class is initialised, and use the single file launcher for a quick script.

In the lesson: An ordinary class, in the shape you will see everywhere. A field and a constructor that fills it in, and the field is final, so once an object is built that value cannot change. Then a method that returns a greeting for it. Then the entry point, which makes two of these objects and prints what each one says. Run it and two lines come out. One source file here becomes exactly one class file, but that is not a rule: a file with a nested class inside it produces one class file for each, and you can see that on disk, which is the next thing we do.

## Files

- [`starter/Greeter.java`](starter/Greeter.java): the listing from the lesson
- [`starter/PROJECT.txt`](starter/PROJECT.txt)
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m01l03/m01l03-02/starter`
2. Read `Greeter.java` the way the lesson builds it:
   - Lines 1–8: a field and a constructor
   - Lines 9–12: a method that returns
   - Lines 13–18: the entry point
3. Run it: `java Greeter.java`.
4. Check it from the repository root: `./check m01l03-02`.

## Expected output

```text
Hello, world
Hello, Java
```

## How to check

`./check m01l03-02` copies `starter/` into a scratch directory and runs `java Greeter.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
