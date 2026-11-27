# Maven CI Sample

A small Java application built with Maven. The application prints a greeting, and the JUnit test checks the output of the entry point.

## Prerequisites

- A Java Development Kit (JDK)
- Apache Maven

## Build and test

Run the test suite:

```bash
mvn clean test
```

Build the JAR:

```bash
mvn package
```

Run the packaged application:

```bash
java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.App
```

The expected output is:

```text
Hello World!
```

## Project structure

- `src/main/java/com/example/App.java` — application entry point
- `src/test/java/com/example/AppTest.java` — output assertion test
- `pom.xml` — Maven project configuration and test dependency
- `azure-pipelines.yml` — Azure Pipelines build configuration

