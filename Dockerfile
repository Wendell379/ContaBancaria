FROM eclipse-temurin:17-jdk-jammy AS build
COPY . .
# Procura e compila todos os arquivos .java do projeto automaticamente
RUN find . -name "*.java" > sources.txt && javac @sources.txt -d out

FROM eclipse-temurin:17-jre-jammy
COPY --from=build /out /app/out
WORKDIR /app
CMD ["java", "-cp", "out", "Main"]