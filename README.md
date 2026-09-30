<p>
  <a href="https://learnsome.tech/courses/java-course">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset=".github/assets/wordmark-inverse.svg">
      <img src=".github/assets/wordmark.svg" alt="LearnSome.tech" width="260">
    </picture>
  </a>
</p>

# Modern Java: Virtual Threads & High-Throughput Services

**Project Loom, Structured Concurrency & JVM Performance**

8 modules, 40 lessons: Ecosystem And Toolchain; Types, Modern Syntax, And Generics; Collections, Streams, And Optional; Exceptions And Concurrency; JSON And Testing; Spring Boot Fundamentals; Building APIs With Spring Boot; Persistence And Integration Testing. Intermediate level, about 2 hours.

This repository holds the labs of the LearnSome.tech course [Modern Java: Virtual Threads & High-Throughput Services](https://learnsome.tech/courses/java-course): each lab's starter files, a README with the goal, the steps and the expected output, and `./check`, which tests your work the way the site does.

## Start

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/learnsome-tech/java-labs?quickstart=1)

- **Codespaces:** the badge opens this repository in a dev container with Python 3.14.7, Java 21 (OpenJDK) and hadolint 2.15.1, as in the site's lab sandbox.
- **On your machine:**

  ```sh
  git clone https://github.com/learnsome-tech/java-labs.git
  cd java-labs
  ./check m01l01-02
  ```

  You need Python 3 for `./check`, and for the labs themselves Python 3.14.7, Java 21 (OpenJDK) and hadolint 2.15.1. Other versions mostly work, but only the sandbox's versions are sure to print what the site prints. VS Code's Dev Containers extension builds the same container as Codespaces (x86-64).

## Doing a lab

1. Open the lesson on LearnSome.tech and the lab folder beside it: `labs/<lesson>/<lab>/`. The lab README has the goal, the steps and the expected output.
2. Work in the lab's `starter/` folder.
3. From the repository root, run `./check <lab>` (for example `./check m01l01-02`), or `./check <lesson>` for all labs of a lesson, or `./check --all`. `./check --list` shows every lab and how it is checked.

`./check` runs your starter the way the site's lab sandbox does: in a scratch copy that is its working directory and `HOME`, with `LANG=C.UTF-8`, `TZ=UTC`, `input.txt` on standard input, 10 seconds and 256 KiB of output per stream. It then compares the output with the site's own rules, so a pass here is a pass on the site.

| Check | What `./check` does | Labs |
| --- | --- | --- |
| Graded | Runs the program and compares its output with `expected.txt`. | 23 |
| Checker | Validates the file with the checker the site uses (hadolint, kubeconform, actionlint, yamllint, `ansible-playbook --syntax-check` or `terraform validate`); passes when it finds no errors. | 1 |
| Read along | Nothing to run here: the site shows the listing read-only, and the lab README says honestly what it needs (Docker, a cluster, a cloud account...). | 43 |

## What is published, and what is not

Every lab's starter is the code the lesson shows on screen, which is also what the lab editor on the site opens with. Where that code is the whole program, such as a recorded shell session or a script from the video, it is published as it is: it is the lesson content. Nothing beyond the lesson is published. There are no reference solutions and no answers to the lesson exercises, and nothing the site keeps private.

Pro lessons' labs are here as starters too. LearnSome.tech runs and grades your labs in its sandbox, hosts the videos and keeps your progress; running and grading a Pro lab on the site needs Pro.

## Modules and lessons

### Module 1: Ecosystem And Toolchain

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 1.1 | [The Virtual Machine, The Kit And The Runtime](https://learnsome.tech/learn/java-course/m01l01) | [3 labs](labs/m01l01/) | Free |
| 1.2 | [Release Trains And Long Term Support](https://learnsome.tech/learn/java-course/m01l02) | [3 labs](labs/m01l02/) | Free |
| 1.3 | [The Lifecycle Of A Java Program](https://learnsome.tech/learn/java-course/m01l03) | [4 labs](labs/m01l03/) | Free |
| 1.4 | [The Toolchain: Maven](https://learnsome.tech/learn/java-course/m01l04) | [4 labs](labs/m01l04/) | Free |
| 1.5 | [The Toolchain: Gradle](https://learnsome.tech/learn/java-course/m01l05) | [3 labs](labs/m01l05/) | Free |

### Module 2: Types, Modern Syntax, And Generics

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 2.1 | [Primitive And Reference Types](https://learnsome.tech/learn/java-course/m02l01) | [3 labs](labs/m02l01/) | Pro |
| 2.2 | [Generics Fundamentals](https://learnsome.tech/learn/java-course/m02l02) | [3 labs](labs/m02l02/) | Pro |
| 2.3 | [Records And Data Classes](https://learnsome.tech/learn/java-course/m02l03) | [3 labs](labs/m02l03/) | Pro |
| 2.4 | [Sealed Types And Exhaustiveness](https://learnsome.tech/learn/java-course/m02l04) | [3 labs](labs/m02l04/) | Pro |
| 2.5 | [Pattern Matching And Text Blocks](https://learnsome.tech/learn/java-course/m02l05) | [3 labs](labs/m02l05/) | Pro |

### Module 3: Collections, Streams, And Optional

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 3.1 | [The Collections Framework](https://learnsome.tech/learn/java-course/m03l01) | [2 labs](labs/m03l01/) | Pro |
| 3.2 | [Generics And Collections](https://learnsome.tech/learn/java-course/m03l02) | [2 labs](labs/m03l02/) | Pro |
| 3.3 | [The Streams API](https://learnsome.tech/learn/java-course/m03l03) | [2 labs](labs/m03l03/) | Pro |
| 3.4 | [Advanced Stream Operations](https://learnsome.tech/learn/java-course/m03l04) | [2 labs](labs/m03l04/) | Pro |
| 3.5 | [Handling Nulls With Optional](https://learnsome.tech/learn/java-course/m03l05) | [2 labs](labs/m03l05/) | Pro |

### Module 4: Exceptions And Concurrency

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 4.1 | [Checked Versus Unchecked Exceptions](https://learnsome.tech/learn/java-course/m04l01) | [1 lab](labs/m04l01/) | Pro |
| 4.2 | [The Cost Of Checked Exceptions](https://learnsome.tech/learn/java-course/m04l02) | [1 lab](labs/m04l02/) | Pro |
| 4.3 | [Concurrency Basics: Threads And Runnable](https://learnsome.tech/learn/java-course/m04l03) | [1 lab](labs/m04l03/) | Pro |
| 4.4 | [The ExecutorService](https://learnsome.tech/learn/java-course/m04l04) | [1 lab](labs/m04l04/) | Pro |
| 4.5 | [Async With CompletableFuture](https://learnsome.tech/learn/java-course/m04l05) | [1 lab](labs/m04l05/) | Pro |

### Module 5: JSON And Testing

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 5.1 | [Serialization And JSON](https://learnsome.tech/learn/java-course/m05l01) | [1 lab](labs/m05l01/) | Pro |
| 5.2 | [Working With Jackson](https://learnsome.tech/learn/java-course/m05l02) | [1 lab](labs/m05l02/) | Pro |
| 5.3 | [Testing Basics With JUnit 5](https://learnsome.tech/learn/java-course/m05l03) | [1 lab](labs/m05l03/) | Pro |
| 5.4 | [Fluent Assertions With AssertJ](https://learnsome.tech/learn/java-course/m05l04) | [1 lab](labs/m05l04/) | Pro |
| 5.5 | [Designing Testable Code](https://learnsome.tech/learn/java-course/m05l05) | [1 lab](labs/m05l05/) | Pro |

### Module 6: Spring Boot Fundamentals

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 6.1 | [Dependency Injection And The IoC Container](https://learnsome.tech/learn/java-course/m06l01) | [1 lab](labs/m06l01/) | Pro |
| 6.2 | [Spring Boot Auto Configuration](https://learnsome.tech/learn/java-course/m06l02) | [1 lab](labs/m06l02/) | Pro |
| 6.3 | [Configuration And Profiles](https://learnsome.tech/learn/java-course/m06l03) | [1 lab](labs/m06l03/) | Pro |
| 6.4 | [The Spring Bean Lifecycle](https://learnsome.tech/learn/java-course/m06l04) | [1 lab](labs/m06l04/) | Pro |
| 6.5 | [Packaging Into A Container](https://learnsome.tech/learn/java-course/m06l05) | [1 lab](labs/m06l05/) | Pro |

### Module 7: Building APIs With Spring Boot

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 7.1 | [Controllers And Routing](https://learnsome.tech/learn/java-course/m07l01) | [1 lab](labs/m07l01/) | Pro |
| 7.2 | [Reading The Request](https://learnsome.tech/learn/java-course/m07l02) | [1 lab](labs/m07l02/) | Pro |
| 7.3 | [Validation](https://learnsome.tech/learn/java-course/m07l03) | [1 lab](labs/m07l03/) | Pro |
| 7.4 | [Exception Handling To Problem Details](https://learnsome.tech/learn/java-course/m07l04) | [1 lab](labs/m07l04/) | Pro |
| 7.5 | [Implementing An OpenAPI Contract](https://learnsome.tech/learn/java-course/m07l05) | [1 lab](labs/m07l05/) | Pro |

### Module 8: Persistence And Integration Testing

| # | Lesson | Labs | Access |
| --- | --- | --- | --- |
| 8.1 | [Persistence With JPA And Hibernate](https://learnsome.tech/learn/java-course/m08l01) | [1 lab](labs/m08l01/) | Pro |
| 8.2 | [Spring Data Repositories](https://learnsome.tech/learn/java-course/m08l02) | [1 lab](labs/m08l02/) | Pro |
| 8.3 | [Testing APIs With MockMvc](https://learnsome.tech/learn/java-course/m08l03) | [1 lab](labs/m08l03/) | Pro |
| 8.4 | [Database Integration With Testcontainers](https://learnsome.tech/learn/java-course/m08l04) | [1 lab](labs/m08l04/) | Pro |
| 8.5 | [Tying It All Together](https://learnsome.tech/learn/java-course/m08l05) | [1 lab](labs/m08l05/) | Pro |

**Free** lessons are open to anyone with a free LearnSome.tech account; **Pro** lessons need a Pro membership to watch, run and grade on the site.

## Licence

- **Code** (starter files, `check` and `.learnsome/`, the dev container and the workflows) is under the [MIT licence](LICENSE).
- **Written text** (the READMEs, lab instructions, lesson text, exercises and questions) is under [CC BY-NC-SA 4.0](LICENSE-text.md): share and adapt it with attribution to LearnSome.tech, not commercially, under the same licence.
- The LearnSome.tech name and logo are not covered by either licence.

## Contributing and security

This repository is generated from the course. Report a broken lab or a content error [as an issue](../../issues/new/choose); see [CONTRIBUTING.md](CONTRIBUTING.md). Security reports go to [SECURITY.md](SECURITY.md).

© 2026 LearnSome.tech
