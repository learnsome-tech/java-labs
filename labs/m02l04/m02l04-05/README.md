# m02l04-05 · A complete switch returns a value

**Lesson:** [Sealed Types And Exhaustiveness](https://learnsome.tech/learn/java-course/m02l04) (lesson 2.4, module 2: Types, Modern Syntax, And Generics) · Pro  
**Check:** Graded

## Goal

You can constrain an inheritance hierarchy with sealed types and make every permitted case explicit in a switch.

In the lesson: Enums are closed families too, so the compiler can check this switch without a default. The action method returns a string expression for each light. When the main method passes green, the program prints go. The same shape works for a sealed interface and its records. Keeping the switch expression total means callers never receive an accidental null or an unexplained fallback. If the enum later gains an amber value, the compiler points to this method until the new behavior is chosen.

## Files

- [`starter/Traffic.java`](starter/Traffic.java): the listing from the lesson
- [`expected.txt`](expected.txt): the output the check compares with
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m02l04/m02l04-05/starter`
2. Read `Traffic.java`.
3. Run it: `java Traffic.java`.
4. Check it from the repository root: `./check m02l04-05`.

## Expected output

```text
go
```

## How to check

`./check m02l04-05` copies `starter/` into a scratch directory and runs `java Traffic.java` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

It passes when the output matches `expected.txt` by the site's rules, within the limits. Standard output is compared line by line; spaces at the end of a line and blank lines at the end do not count. If that differs, standard output followed by standard error is compared with Python traceback frames and blank lines set aside, so a lesson that shows an error passes when your program prints the same error. A pass here is a pass on the site.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m02l04) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
