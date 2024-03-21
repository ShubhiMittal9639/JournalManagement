# Use a base image with Java
FROM openjdk:17

# Set the working directory in the container
WORKDIR /JournalManagement

# Copy the packaged Spring Boot JAR file into the container
COPY target/JournalManagement-0.0.1-SNAPSHOT.jar /JournalManagement/

# Specify the command to run your Spring Boot application
CMD ["java", "-jar", "JournalManagement-0.0.1-SNAPSHOT.jar"]


