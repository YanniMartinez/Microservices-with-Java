#Start with a base image containing Java runtime
#Es la dependencia de java, al usar FROM
FROM openjdk:21-jdk-slim

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER eazybytes.com
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="eazybytes.com"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
#Comandos a ser ejecutados en el contenedor una vez se le de inciar
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]