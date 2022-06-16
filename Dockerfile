#Build Stage
FROM openjdk:17 AS build
WORKDIR /usr/app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src
RUN sed -i 's/\r$//' mvnw
RUN chmod +x ./mvnw && ./mvnw clean install

#Package Stage
FROM openjdk:17
COPY --from=build /usr/app/target/*.jar /usr/local/lib/shipping.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/shipping.jar"]
