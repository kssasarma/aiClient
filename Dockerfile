# Use an official JDK runtime as a parent image
FROM eclipse-temurin:21-jre-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the executable jar to the container
# This expects the jar to be built before docker build, as in the workflow
COPY target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

# Expose the default Spring Boot port
EXPOSE 8080
