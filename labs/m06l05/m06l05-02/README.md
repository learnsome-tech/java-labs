# m06l05-02 · A two stage Dockerfile

**Lesson:** [Packaging Into A Container](https://learnsome.tech/learn/java-course/m06l05) (lesson 6.5, module 6: Spring Boot Fundamentals) · Pro  
**Check:** Checker

## Goal

You can package a Spring Boot jar with a multi stage container build and run it as a non root process.

In the lesson: The first stage has the development kit and runs the Maven wrapper to build the jar. The second stage starts from a runtime image, copies only the jar, switches to a numeric non root user, and launches Java with the jar. The exact base tags should be pinned and updated through a deliberate patch process. A health check and memory settings belong in the deployment design, while secrets arrive from the platform rather than this image.

## Files

- [`starter/Containerfile`](starter/Containerfile): the listing from the lesson
- [`check.json`](check.json): how `./check` runs and checks this lab

## Steps

1. Go to the starter: `cd labs/m06l05/m06l05-02/starter`
2. Read `Containerfile`.
3. Edit `Containerfile` and check it: `hadolint Containerfile`.
4. Check it from the repository root: `./check m06l05-02`.
5. The site offers these commands for this lab; the first is the default, and the only one graded. Run another with `./check m06l05-02 --command=<id>`:
   - `lint` (Lint): `hadolint Containerfile`
   - `strict` (Lint strictly): `hadolint --failure-threshold info Containerfile`

## How to check

`./check m06l05-02` copies `starter/` into a scratch directory and runs `hadolint Containerfile` there, the way the site's lab sandbox does: that directory is the working directory and `HOME`, `LANG=C.UTF-8`, `TZ=UTC`, a limit of 10 seconds and 256 KiB of output per stream.

This is a checker lab: it lints the Dockerfile with hadolint at failure threshold `error`: it passes when hadolint reports no errors (warnings are shown but do not fail it). The site shows the checker's report without grading; `./check` passes when the checker finds no errors.

---

[Open the lesson on LearnSome.tech](https://learnsome.tech/learn/java-course/m06l05) · [All labs of this lesson](../README.md) · [Course README](../../../README.md)
