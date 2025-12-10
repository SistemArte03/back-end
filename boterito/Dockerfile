FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

COPY boterito/ .

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
