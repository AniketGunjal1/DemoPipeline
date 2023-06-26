FROM openjdk:17
EXPOSE 9005
ADD target/spring-boot-docker.jar spring-boot-docker
ENTRYPOINT [ "java","-jar" ,"/spring-boot-docker"]