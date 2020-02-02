./gradlew build
docker build ./ --build-arg JAR_FILE=build/libs/*.jar -t demo2
docker run -p 8081:8080 --name demo2 demo2
