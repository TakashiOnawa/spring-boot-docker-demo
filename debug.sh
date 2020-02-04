cd demo1
./gradlew build -x test
cd ..

cd demo2
./gradlew build -x test
cd ..

docker-compose -f docker-compose-debug.yml up --build
