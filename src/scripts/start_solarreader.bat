@echo off
set JAVA=java
set JAVA_OPTS="-Dtinylog.writer.level=info -Djava.io.tmpdir=./tmp -Dport=8080 -Dsolarreader.maxthreads=5"
$JAVA $JAVA_OPTS -jar solarreader.jar





