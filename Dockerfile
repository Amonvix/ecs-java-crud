FROM openjdk:17-slim

WORKDIR /app

COPY target/crud-java-2025-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar", "--server.port=8080", "--server.address=0.0.0.0"]
