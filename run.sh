./remove.sh

cd demo1
./gradlew build
cd ..

cd demo2
./gradlew build
cd ..

docker network create --driver bridge spring-boot-docker-demo-network

docker-compose up -d
