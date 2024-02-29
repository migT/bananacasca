FROM maven:3.9.6-eclipse-temurin-21-alpine AS execute

WORKDIR /app

COPY ./target/com.dummy.examples-*SNAPSHOT.jar /app/

RUN mvn clean install