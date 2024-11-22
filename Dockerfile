#FROM eclipse-temurin:17-jdk-alpine
#
## Add a volume pointing to /tmp
#VOLUME /tmp
#
## Make port 8080 available to the world outside this container
#EXPOSE 8080
#
## The application's jar file
#ARG JAR_FILE=target/*.jar
#
## Add the application's jar to the container
#COPY ${JAR_FILE} app.jar
#
## Run the jar file
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


## Use OpenJDK 17 with Alpine as the base image
#FROM openjdk:22
#
## Set working directory
#WORKDIR /app
#
## Copy your application JAR file into the container
#COPY target/app.jar /app/app.jar
#
## Command to run your application
#CMD ["java", "-jar", "/app/app.jar"]

#FROM openjdk:17-jdk-slim
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]



#FROM openjdk:17-jdk-slim
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]


FROM openjdk:21-jdk
WORKDIR /app
COPY target/GolfClubMembership-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "app.jar"]

