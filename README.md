# Microservices Architecture with Spring Boot
(Learnings from Aimerz.ai)

## Overview
This project demonstrates a microservices-based architecture using Spring Boot, Spring Cloud, and Netflix Eureka. The system consists of three main services:

1. **Eureka Server** - Service registry for service discovery.
2. **API Gateway** - Gateway for routing requests to appropriate services.
3. **User Service** - Manages user information and interacts with Contact Service.
4. **Contact Service** - Manages user contacts and provides contact details.

## Technologies Used
- **Spring Boot**
- **Spring Cloud Netflix Eureka**
- **Spring Data JPA**
- **Spring Web**
- **RestTemplate for inter-service communication**
- **MySQL Database**
- **Hibernate ORM**


## Service Descriptions

### 1. **Eureka Server**
- Acts as the service registry.
- Enables service discovery.
- Registered services can discover each other via Eureka.


### 2. **API Gateway**
- Routes client requests to corresponding microservices.
- Uses Spring Cloud Gateway for request routing.


### 3. **User Service**
- Manages users and their details.
- Fetches user contacts from Contact Service using RestTemplate.


### 4. **Contact Service**
- Stores user contact details.
- Exposes REST API to retrieve contact details.


### Running the Microservices
- Start the Eureka Server.
- Start the API Gateway.
- Start the Contact Service.
- Start the User Service.
