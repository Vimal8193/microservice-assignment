FROM openjdk:8-alpine

EXPOSE 8081

WORKDIR /usr/local/bin

COPY ./target/assignment-orders-0.0.1-SNAPSHOT.jar orders.jar

CMD ["java", "-jar", "orders.jar"]