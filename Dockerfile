FROM eclipse-temurin:17-jdk-jammy AS build
COPY . .
# Compila o Main e todos os arquivos dentro da subpasta conta
RUN javac src/Main.java src/conta/*.java -d out

FROM eclipse-temurin:17-jre-jammy
COPY --from=build /out /app/out
WORKDIR /app
CMD ["java", "-cp", "out", "Main"]
