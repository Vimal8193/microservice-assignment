FROM openjdk:8-alpine

EXPOSE 8888

WORKDIR /usr/local/bin

COPY ./target/assignment-aggregator-0.0.1-SNAPSHOT.jar aggregator.jar

CMD ["java", "-jar", "aggregator.jar"]