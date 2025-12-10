FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

COPY boterito/ .

# Dar permisos de ejecución
RUN chmod +x mvnw

# Compilar
RUN ./mvnw clean package -DskipTests

# Run
FROM eclipse-temurin:17-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
