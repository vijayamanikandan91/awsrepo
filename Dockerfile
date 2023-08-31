FROM eclipse-temurin:17
COPY target/awsproject.jar awsproject.jar
CMD ["java","-jar","awsproject.jar"]