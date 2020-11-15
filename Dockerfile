# AlpineLinux with a glibc-2.21 and Oracle Java 8

FROM davidcaste/alpine-java-unlimited-jce

## Setup work directory
RUN mkdir /server
WORKDIR /server

## Copy application
ADD ./target/auth-microservice-0.0.1-SNAPSHOT.jar /server/

EXPOSE 20000

# Define default command.
CMD ["java","-XX:+PrintFlagsFinal","-XX:+PrintGCDetails", "-Xmx580m", "-Dspring.profiles.active=stage","-jar", "auth-microservice-0.0.1-SNAPSHOT.jar"]
