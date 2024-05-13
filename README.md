# Quiz-App build using Microservices Architecture

## Microservices 

1. [Quiz Microservice](./QuizService/)
2. [Question Microservice](./QuestionService/)
3. [ServiceRegistry Microservice](./ServiceRegistry/)
4. [APIGateway Microservice](./APIGateway/)

## Packages

1. OpenFiegn Package: For communication between microservices over http 
2. spring-cloud-starter-loadbalancer
3. spring-cloud-starter-netflix-eureka-server
4. spring-cloud-starter-netflix-eureka-client
5. spring-cloud-starter-gateway-mvc


## Setup

1. Create sql-database `create database quiz`
2. To see all instances running and load-balancing check. Go on http://localhost:8761/

## References

1. [YouTube Video Link](https://www.youtube.com/watch?v=Nb2PPuqtL2g)
