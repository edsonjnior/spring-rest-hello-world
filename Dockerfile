FROM openjdk:8
EXPOSE 8080
ADD target/hello-world-rest-sample.jar hello-world-rest-sample.jar
ENTRYPOINT ["java", "-jar", "hello-world-rest-sample.jar"]