FROM openjdk:17-jdk-slim-buster
WORKDIR /apps
COPY .idea/artifacts/Processing_jar.xml /app/bankapp.jar
ENTRYPOINT ["java", "-jar", "bankapp.jar"]