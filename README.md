# finacc

## a. Steps to run the project using maven:

You much have maven installed on your machine :
If maven is not installed, use https://maven.apache.org/install.html to install.
If maven is already installed :

	mvn clean install spring-boot:run

Go to browser window and hit
        
        http://localhost:8080/klt

Yay! Application is running now.

## b. Using Docker and Maven :

You don't need to install java or any other dependency
	mvn clean install dockerfile:build
	
Once your docker image is successfully created please run the below command to run the application
	docker run -p 8080:8080 -t springio/finacc

#Notes

##Technology Stack

###Backend: Spring Boot Application 

###Frontend: Angular (I have used Angular for the frontend instead of updating jsp pages.)
