FROM --platform=linux/amd64 openjdk:17
ARG JAR_FILE=build/libs/*jar
COPY ${JAR_FILE} demo-springboot-ec2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-springboot-ec2-0.0.1-SNAPSHOT.jar"]
