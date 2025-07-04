# Stage 1: Build the JAR
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom and source code
COPY pom.xml .
COPY src ./src

# Build the app (package phase)
RUN mvn clean package -DskipTests

# Stage 2: Create a lightweight image and copy the JAR from build stage
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/book-crud-1.0-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]
