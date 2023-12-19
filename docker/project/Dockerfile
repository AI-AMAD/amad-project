FROM openjdk:11

ARG JAR_FILE=*.jar

COPY ${JAR_FILE} app.jar

ENV PROFILE prod

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE}", "-jar", "/app.jar"]

