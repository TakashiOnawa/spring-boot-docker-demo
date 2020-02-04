cd demo1
./gradlew build
cd ..

cd demo2
./gradlew build
cd ..

docker-compose -f docker-compose-debug.yml up --build
