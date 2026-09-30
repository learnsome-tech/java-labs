#!/usr/bin/env bash
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
