FROM openjdk:8-alpine

EXPOSE 8761

WORKDIR /usr/local/bin

COPY ./target/netflix-eureka-naming-server-0.0.1-SNAPSHOT.jar eureka.jar

CMD ["java", "-jar", "eureka.jar"]