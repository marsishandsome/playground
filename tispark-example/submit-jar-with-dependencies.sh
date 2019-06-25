# do not add tispark.jar to spark/jars folder
# and submit user jar with tispark dependency

/Users/mars/Dev/pingcap/spark-2.3.3-bin-hadoop2.7/bin/spark-submit \
--master local[*] \
--class com.mars.TiExtensionsExample \
target/tispark-example-1.0.0-SNAPSHOT-jar-with-dependencies.jar
