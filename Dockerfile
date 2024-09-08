# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/simpleapi-0.0.1-SNAPSHOT.jar /app/simpleapi.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/simpleapi.jar"]

# Expose port 8087 for the application
EXPOSE 8087
