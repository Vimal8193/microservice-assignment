FROM openjdk:8-alpine

EXPOSE 8765

WORKDIR /usr/local/bin

COPY ./target/netflix-zuul-api-gateway-server-0.0.1-SNAPSHOT.jar zuul-api.jar

CMD ["java", "-jar", "zuul-api.jar"]