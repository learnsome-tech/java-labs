#!/usr/bin/env bash
# Terminal session from the video, as a file you can run.
# Each line below was typed at the dollar prompt; the commented lines are
# what the machine answered. Run it from a copy of source/projects.
set -e

cd inventory
./mvnw -B -ntp package -DskipTests | tail -4
#   [INFO] ------------------------------------------------------------------------
#   [INFO] Total time:  0.461 s
#   [INFO] Finished at: 2026-09-11T10:54:31+01:00
#   [INFO] ------------------------------------------------------------------------
ls target/*.jar
#   target/inventory-1.0.0.jar
jar tf target/*.jar | head -5
#   META-INF/
#   META-INF/MANIFEST.MF
#   com/
#   com/example/
#   com/example/inventory/
