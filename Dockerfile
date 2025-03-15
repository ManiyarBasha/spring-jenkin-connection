FROM openjdk:17-jdk-slim
EXPOSE 9098
ADD target/spring-rest-one.jar spring-rest-one.jar
CMD ["java", "-jar" ,"spring-rest-one.jar"]