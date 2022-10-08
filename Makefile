run-dist:
		./build/install/app/bin/app
build:
		sudo ./gradlew installDist
clean:
		sudo ./gradlew clean
lint:
		sudo gradle checkstyleMain
