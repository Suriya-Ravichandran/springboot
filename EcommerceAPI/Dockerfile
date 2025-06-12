# Use Java 21 as base image
FROM eclipse-temurin:21-jdk

# Set working directory inside container
WORKDIR /app

# Copy your JAR into the container
COPY target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
