./gradlew build
docker build ./ --build-arg JAR_FILE=build/libs/*.jar -t demo1
docker run -p 8080:8080 --name demo1 demo1
