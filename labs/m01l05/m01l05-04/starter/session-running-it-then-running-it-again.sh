#!/usr/bin/env bash
# Terminal session from the video, as a file you can run.
# Each line below was typed at the dollar prompt; the commented lines are
# what the machine answered. Run it from a copy of source/projects.
set -e

cd inventory-gradle
./gradlew test --console=plain | tail -3
#   BUILD SUCCESSFUL in 655ms
#   3 actionable tasks: 3 executed
./gradlew test --console=plain | grep -E "Task :test|BUILD"
#   > Task :testClasses UP-TO-DATE
#   > Task :test UP-TO-DATE
#   BUILD SUCCESSFUL in 347ms
