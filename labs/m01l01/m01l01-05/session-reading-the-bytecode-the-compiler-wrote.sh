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
javap -c Hello | head -8
#   Compiled from "Hello.java"
#   public class Hello {
#     public Hello();
#       Code:
#          0: aload_0
#          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
#          4: return
