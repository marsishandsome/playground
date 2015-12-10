#!/bin/bash

FWDIR="$(cd "`dirname "$0"`"/..; pwd)"

mvn clean install
