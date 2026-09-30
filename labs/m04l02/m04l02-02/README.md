# m04l02-02 · Translate at a service boundary

**Lesson:** [The Cost Of Checked Exceptions](https://learnsome.tech/learn/java-course/m04l02) (lesson 4.2, module 4: Exceptions And Concurrency) · Pro  
**Check:** Graded

## Goal

You can assess checked exception costs across layers and translate unstable library failures into stable service errors.

In the lesson: The storage layer catches the checked input output failure and translates it into a domain shaped runtime exception. The cause is preserved, so the original message remains available to logs and diagnostics. The caller handles one stable type instead of importing a storage library. In a web service, a higher boundary could turn StorageFailure into a problem detail response without exposing the disk. Translation is useful when a lower layer has no recovery choice and the upper layer needs a meaningful policy.

## Files

- [`starter/Translate.java`](starter/Translate.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m04l02/m04l02-02/starter`
2. Read `Translate.java`.
3. Run it: `java Translate.java`.
4. Check it from the repository root: `./check m04l02-02`.

## Expected output

```text
disk
```

## How to check

`./check m04l02-02` copies `starter/` into a scratch directory and runs `java Translate.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m04l02) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
