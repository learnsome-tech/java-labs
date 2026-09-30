# m01l01-02 · The smallest program that does anything

**Lesson:** [The Virtual Machine, The Kit And The Runtime](https://learnsome.tech/learn/java-course/m01l01) (lesson 1.1, module 1: Ecosystem And Toolchain) · Free  
**Check:** Graded

## Goal

You can say exactly what the virtual machine, the runtime and the development kit each are, compile and run a program by hand without a build tool, and read the bytecode a class file holds.

In the lesson: Here is the smallest program that does anything at all. A public class called Hello, and inside it the main method, which is the entry point the virtual machine looks for by name. Every part of that line is fixed by the platform. It is public so the machine can see it. It is static so the machine can call it without building an object first. It returns nothing. It takes an array of strings, which holds the command line arguments. Then the closing brace, and the file is done. Compile it and run it, and one line of text arrives. Notice how much ceremony surrounds one statement. That ceremony is the price of a language where the entry point is a method on a class.

## Files

- [`starter/Hello.java`](starter/Hello.java): the listing from the lesson
- [`starter/PROJECT.txt`](starter/PROJECT.txt)
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m01l01/m01l01-02/starter`
2. Read `Hello.java` the way the lesson builds it:
   - Lines 1: a public class
   - Lines 2–5: the main method
   - Lines 6: the closing brace
3. Notes from the lesson:
   - Line 3: public static void main with a string array: the fixed entry point
4. Run it: `java Hello.java`.
5. Check it from the repository root: `./check m01l01-02`.

## Expected output

```text
Hello from the Java virtual machine
```

## How to check

`./check m01l01-02` copies `starter/` into a scratch directory and runs `java Hello.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l01) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
