FROM openjdk:latest

VOLUME /tmp

COPY target/springboot-redis-hiberate-mysql-1.0.jar app.jar

RUN bash -c "touch /app.jar"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]
