#!/usr/bin/env bash
# Terminal session from the video, as a file you can run.
# Each line below was typed at the dollar prompt; the commented lines are
# what the machine answered. Run it from a copy of source/projects.
set -e

cd inventory
./mvnw -B -ntp test | grep -E "Tests run.*Skipped: 0$"
#   [INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
ls target
#   classes
#   generated-sources
#   generated-test-sources
#   maven-status
#   surefire-reports
#   test-classes
