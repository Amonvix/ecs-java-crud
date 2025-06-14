        FROM openjdk:17-slim
        EXPOSE 8080
        WORKDIR /app
        COPY target/crud-java-2025-0.0.1-SNAPSHOT.jar app.jar
        CMD java -jar app.jar --server.port=8080 --server.address=0.0.0.0
