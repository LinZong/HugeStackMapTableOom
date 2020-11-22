## Usage

```shell
mvn package -Dmaven.test.skip=true -DskipTests
java -jar /path/to/target/huge-stackmap-oom-0.0.1-SNAPSHOT.jar
```

And use Arthas 3.3.9 to trace method:

```shell
trace demo.OomClass traceMe
```