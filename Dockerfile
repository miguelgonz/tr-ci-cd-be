FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/innovation-be-0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
