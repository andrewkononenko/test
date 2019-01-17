FROM openjdk:8-jdk-alpine

LABEL title="test"

COPY target/test-0.0.1-SNAPSHOT.jar /usr/src/myapp/
WORKDIR /usr/src/myapp

EXPOSE 80

CMD ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]