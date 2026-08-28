FROM eclipse-temurin:17-jdk-jammy AS build
COPY . .
# Compila procurando todos os arquivos Java dentro da pasta src de forma segura
RUN javac $(find src -name "*.java") -d out

FROM eclipse-temurin:17-jre-jammy
COPY --from=build /out /app/out
WORKDIR /app
CMD ["java", "-cp", "out", "Main"]
