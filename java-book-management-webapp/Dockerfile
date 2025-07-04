# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file from target folder into the container
COPY target/book-crud-1.0-SNAPSHOT.jar app.jar

# Expose port 8080 (or whatever your app uses)
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
