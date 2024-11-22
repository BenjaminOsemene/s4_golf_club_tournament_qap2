FROM openjdk:21-jdk
WORKDIR /app
COPY target/GolfClubMembership-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "app.jar"]

