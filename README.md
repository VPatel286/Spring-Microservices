# Spring-Microservices-Project

## Spring Microservices - V1 & V2 - REST + Microservices + Spring Boot + Spring Cloud + Docker + Kubernetes

- Launch MySQL as Docker Container <br />

docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle

There are so many topics which I learned and implement and create Project on the basis of knowledge which I have.

- Docker <br />
- Kubernetes <br />
- Spring Boot 2.4.x+ & Spring Cloud 2020.x+ <br />
- Service Registry using Eureka Naming Server <br />
- Load Balancing with Spring Cloud LoadBalancer (replacing Ribbon) <br />
- API Gateway with Spring Cloud Gateway (instead of Zuul) <br />
- Circuit Breaker with Resilience4j (instead of Hystrix) <br />
- Distributed Tracing with Zipkin <br />
- Asynchronous Communication using Rabbit MQ <br />

* Microservices with Spring Cloud - V2 <br />

Step 01 - Setting up Limits Microservice <br />
Step 02 - Creating a hard coded limits service <br />
Step 03 - Enhance limits service to pick up configuration from application properties <br />
Step 04 - Setting up Spring Cloud Config Server <br />
Step 05 - Installing Git and Creating Local Git Repository <br />
Step 06 - Connect Spring Cloud Config Server to Local Git Repository <br />
Step 07 - Connect Limits Service to Spring Cloud Config Server <br />
Step 08 - Configuring Profiles for Limits Service <br />
Step 09 - Introduction to Currency Conversion and Currency Exchange Microservices <br />
Step 10 - Setting up Currency Exchange Microservice <br />
Step 11 - Create a simple hard coded currency exchange service <br />
Step 12 - Setting up Dynamic Port in the the Response <br />
Step 13 - Configure JPA and Initialized Data <br />
Step 14 - Create a JPA Repository <br />
Step 15 - Setting up Currency Conversion Microservice <br />
Step 16 - Creating a service for currency conversion <br />
Step 17 - Invoking Currency Exchange Microservice from Currency Conversion Microservice <br />
Step 18 - Using Feign REST Client for Service Invocation <br />
Step 19 - Understand Naming Server and Setting up Eureka Naming Server <br />
Step 20 - Connect Currency Conversion Microservice & Currency Exchange Microservice to Eureka <br />
Step 21 - Load Balancing with Eureka, Feign & Spring Cloud LoadBalancer <br />
Step 22 - Setting up Spring Cloud API Gateway <br />
Step 23 - Enabling Discovery Locator with Eureka for Spring Cloud Gateway <br />
Step 24 - Exploring Routes with Spring Cloud Gateway <br />
Step 25 - Implementing Spring Cloud Gateway Logging Filter <br />
Step 26 - Getting started with Circuit Breaker - Resilience4j <br />
Step 27 - Playing with Resilience4j - Retry and Fallback Methods <br />
Step 28 - Playing with Circuit Breaker Features of Resilience4j <br />
Step 29 - Exploring Rate Limiting and BulkHead Features of Resilience4j <br />

* Docker with Microservices using Spring Boot and Spring Cloud - V2

Step 00 - Docker and Microservices <br />
Step 01 - Installing Docker - Docker <br />
Step 02 - First Docker Usecase - Deploy a Spring Boot Application <br />
Step 03 - Important Docker Concepts - Registry, Repository, Tag, Image and Container <br />
Step 04 - Playing with Docker Images and Containers <br />
Step 05 - Understanding Docker Architecture - Docker Client, Docker Engine <br />
Step 06 - Why is Docker Popular <br />
Step 07 - Playing with Docker Images <br />
Step 08 - Playing with Docker Containers <br />
Step 09 - Playing with Docker Commands - stats, system <br />
Step 10 - Introduction to Distributed Tracing <br />
Step 11 - Launching Zipkin Container using Docker <br />
Step 12 - Connecting Currency Exchange Microservice with Zipkin <br />
Step 13 - Connecting Currency Conversion Microservice and API Gateway with Zipkin <br />
Step 14 - Getting Setup with Microservices for Creating Container Images <br />
Step 15 - Creating Container Image for Currency Exchange Microservice <br />
Step 16 - Getting Started with Docker Compose - Currency Exchange Microservice <br />
Step 17 - Running Eureka Naming Server with Docker Compose <br />
Step 18 - Running Currency Conversion Microservice with Docker Compose <br />
Step 19 - Running Spring Cloud API Gateway with Docker Compose <br />
Step 20 - Running Zipkin with Docker Compose <br />
Step 21 - Running Zipkin and RabbitMQ with Docker Compose <br />

* Kubernetes with Microservices using Docker, Spring Boot and Spring Cloud - V2

Step 00 - Docker, Kubernetes and Microservices - Made for each other <br />
Step 01 - Getting Started with Docker, Kubernetes and Google Kubernetes Engine <br />
Step 02 - Creating Google Cloud Account <br />
Step 03 - Creating Kubernetes Cluster with Google Kubernete Engine (GKE) <br />
Step 04 - Review Kubernetes Cluster and Learn Few Fun Facts about Kubernetes <br />
Step 05 - Deploy Your First Spring Boot Application to Kubernetes Cluster <br />
Step 06 - Quick Look at Kubernetes Concepts - Pods, Replica Sets and Deployment <br />
Step 07 - Understanding Pods in Kubernetes <br />
Step 08 - Understanding ReplicaSets in Kubernetes <br />
Step 09 - Understanding Deployment in Kubernetes <br />
Step 10 - Quick Review of Kubernetes Concepts - Pods, Replica Sets and Deployment <br />
Step 11 - Understanding Services in Kubernetes <br />
Step 12 - Quick Review of GKE on Google Cloud Console <br />
Step 13 - Understanding Kubernetes Architecture - Master Node and Nodes <br />
Step 14 - Setup Currency Exchange & Currency Conversion Microservices - K8S versions <br />
Step 15 - Create Container images for Currency Exchange & Currency Conversion Microservices <br />
Step 16 - Deploy Microservices to Kubernetes & Understand Service Discovery <br />
Step 17 - Creating Declarative Configuration Kubernetes YAML for Microservices <br />
Step 18 - Clean up Kubernetes YAML for Microservices <br />
Step 19 - Enable Logging and Tracing APIs in Google Cloud Platform <br />
Step 20 - Deploying Microservices using Kubernetes YAML Configuration <br />
Step 21 - Playing with Kubernetes Declarative YAML Configuration <br />
Step 22 - Creating Environment Variables to enable Microservice Communication <br />
Step 23 - Understanding Centralized Configuration in Kubernetes - Config Maps <br />
Step 24 - Exploring Centralized Logging and Monitoring in GKE <br />
Step 25 - Exploring Microservices Deployments with Kubernetes <br />
Step 26 - Configuring Liveness and Readiness Probes for Microservices with K8S <br />
Step 27 - Autoscaling Microservices with Kubernetes <br />
Step 28 - Delete Kubernetes Cluster <br />

### Thank You!
