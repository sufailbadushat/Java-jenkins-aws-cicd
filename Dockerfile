FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/java-jenkins-aws-cicd.jar java-jenkins-aws-cicd.jar

EXPOSE 8080

CMD ["java","-jar","java-jenkins-aws-cicd.jar"]