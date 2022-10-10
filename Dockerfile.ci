FROM openjdk:8
EXPOSE 8080
COPY target/github-actions.jar github-actions.jar
ENTRYPOINT ["java","-jar","/github-actions.jar"]