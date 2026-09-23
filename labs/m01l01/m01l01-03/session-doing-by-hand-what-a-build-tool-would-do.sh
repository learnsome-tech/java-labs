#!/usr/bin/env bash
# Modern Java: Virtual Threads & High-Throughput Services — lesson m01l01 — The Virtual Machine, The Kit And The Runtime
# https://learnsome.tech/courses/java-course/watch?lesson=m01l01
# © LearnSome.tech
# Terminal session from the video, as a file you can run.
# Each line below was typed at the dollar prompt; the commented lines are
# what the machine answered. Run it from a copy of source/projects.
set -e

cd hello
javac Hello.java
ls
#   Greeter.java
#   Hello.class
#   Hello.java
java Hello
#   Hello from the Java virtual machine
