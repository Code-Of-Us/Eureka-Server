FROM openjdk:17-jdk-slim
WORKDIR /eureka-server
COPY build/libs/*.jar eureka-server.jar
EXPOSE 8080
CMD ["java", "-jar", "eureka-server.jar"]
LABEL org.opencontainers.image.source https://github.com/code-of-us/eureka-server