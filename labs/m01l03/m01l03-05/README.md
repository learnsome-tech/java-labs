# m01l03-05 · Proving when the setup runs

**Lesson:** [The Lifecycle Of A Java Program](https://learnsome.tech/learn/java-course/m01l03) (lesson 1.3, module 1: Ecosystem And Toolchain) · Free  
**Check:** Graded

## Goal

You can trace a program from source to class file to loaded class to native code, explain when a class is initialised, and use the single file launcher for a quick script.

In the lesson: Here is the proof, in one program. The inner class has a static block, which is the class's own one time setup, and it announces itself. The entry point prints a word, then calls a method on that inner class, then prints another word. Look at the order of the output. The setup line appears between the two, not before them, because the class was untouched until that call needed it. Move the call and the line moves with it. This is also why a class file with a nested class produces two class files on disk: the inner one is a class in its own right, loaded on its own schedule.

## Files

- [`starter/Lazy.java`](starter/Lazy.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m01l03/m01l03-05/starter`
2. Read `Lazy.java`.
3. Notes from the lesson:
   - Line 4: a static block: the class's own one time setup
4. Run it: `java Lazy.java`.
5. Check it from the repository root: `./check m01l03-05`.

## Expected output

```text
started
Heavy is being initialised
42
done
```

## How to check

`./check m01l03-05` copies `starter/` into a scratch directory and runs `java Lazy.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m01l03) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
