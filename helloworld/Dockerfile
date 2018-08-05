FROM openjdk:8-jdk-alpine

#RUN echo '1 ----------------------'
VOLUME /tmp

ARG JAR_FILE

ADD ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]

#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
