FROM openjdk:8
ADD target/docker-app.jar docker-app.jar
EXPOSE 8181
ENTRYPOINT ["java" , "-jar" , "docker-app.jar"]