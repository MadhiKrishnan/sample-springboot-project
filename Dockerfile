FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/sample-project/src
COPY pom.xml /home/sample-project
RUN mvn -f /home/sample-project/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=build /home/sample-project/target/sample-project-0.0.1-SNAPSHOT.jar /usr/local/lib/sample-project.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/sample-project.jar"]