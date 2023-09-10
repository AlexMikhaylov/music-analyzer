# Use the official Maven image as the base
FROM maven:3.8.2-jdk-17 AS build

# Set the working directory within the container
WORKDIR /app

# Copy the pom.xml and source code to the container's working directory
COPY pom.xml ./
COPY src ./src/

# Build the application inside the container
RUN mvn -f pom.xml clean package

# Use the official Java 17 image as the base for the runtime image
FROM openjdk:17-jdk

# Expose port 8080 for the application
EXPOSE 8080

# Set the working directory within the container
WORKDIR /app

# Copy the JAR from the build container to the runtime container
COPY --from=build /app/target/music-analyzer-0.0.1-SNAPSHOT.jar /app/music-analyzer.jar

# Set the default command to run the application
ENTRYPOINT ["java", "-jar", "/app/music-analyzer.jar"]