#!/bin/bash

FWDIR="$(cd "`dirname "$0"`"/..; pwd)"

mvn mars:test -pl mars-maven-plugin-example
