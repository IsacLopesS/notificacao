FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/notificacao.jar

EXPOSE 8082

CMD ["java","-jar", "/app/notificacao.jar"]
