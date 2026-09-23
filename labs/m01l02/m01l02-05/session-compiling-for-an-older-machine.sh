#!/usr/bin/env bash
# Modern Java: Virtual Threads & High-Throughput Services — lesson m01l02 — Release Trains And Long Term Support
# https://learnsome.tech/courses/java-course/watch?lesson=m01l02
# © LearnSome.tech
# Terminal session from the video, as a file you can run.
# Each line below was typed at the dollar prompt; the commented lines are
# what the machine answered. Run it from a copy of source/projects.
set -e

cd hello
javac --release 17 Hello.java
javap -v Hello | grep major
#     major version: 61
javac Hello.java
javap -v Hello | grep major
#     major version: 65
