FROM openjdk:8-alpine

EXPOSE 8081

WORKDIR /usr/local/bin

COPY ./target/assignment-user-0.0.1-SNAPSHOT.jar user.jar

CMD ["java", "-jar", "user.jar"]