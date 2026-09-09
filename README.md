# 🚀 Spring Boot Microservices – Quiz Platform

A **microservices-based Quiz Platform** built using **Spring Boot and Spring Cloud**, demonstrating service discovery, API Gateway routing, and independent business services.

This project is designed to demonstrate how a real-world application can be divided into multiple independently deployable microservices that communicate through well-defined REST APIs.

---

## 📌 Overview

The application follows a **Microservices Architecture** where different responsibilities are separated into independent services.

The platform currently consists of:

* 🧭 **Service Registry** – Service discovery using Netflix Eureka
* 🌐 **API Gateway** – Single entry point for client requests
* ❓ **Question Service** – Manages quiz questions
* 📝 **Quiz Service** – Creates and manages quizzes

Each service is developed and maintained independently, making the application easier to scale, maintain, and extend.

---

## 🏗️ Architecture

```text
                         ┌──────────────────┐
                         │      Client      │
                         │ Web / Postman    │
                         └────────┬─────────┘
                                  │
                                  ▼
                         ┌──────────────────┐
                         │   API Gateway    │
                         │                  │
                         │ Request Routing  │
                         └────────┬─────────┘
                                  │
                    ┌─────────────┴─────────────┐
                    │                           │
                    ▼                           ▼
          ┌──────────────────┐        ┌──────────────────┐
          │ Question Service │        │   Quiz Service   │
          │                  │        │                  │
          │ Question APIs    │        │ Quiz APIs        │
          └────────┬─────────┘        └──────────────────┘
                   │
                   │
                   ▼
          ┌──────────────────┐
          │ Service Registry │
          │  Eureka Server   │
          │                  │
          │ Service Discovery│
          └──────────────────┘
```

---

## 🧩 Microservices

| Service              | Responsibility                                  |
| -------------------- | ----------------------------------------------- |
| **Service Registry** | Service discovery and registration using Eureka |
| **API Gateway**      | Central entry point and request routing         |
| **Question Service** | Provides and manages quiz questions             |
| **Quiz Service**     | Creates and manages quizzes                     |

---

## 🛠️ Tech Stack

### Backend

* ☕ Java
* 🌱 Spring Boot
* ☁️ Spring Cloud
* 🔎 Netflix Eureka
* 🌐 Spring Cloud API Gateway
* 🔗 REST APIs
* 📦 Maven

### Development Tools

* IntelliJ IDEA / Eclipse
* Postman
* Git & GitHub
* Maven

---

## ✨ Key Features

* Microservices-based architecture
* Service discovery with **Eureka**
* Centralized request routing through **API Gateway**
* Independent Question and Quiz services
* RESTful API communication
* Modular and scalable project structure
* Independent deployment of services
* Easy addition of new microservices

---

## 📁 Project Structure

```text
spring-boot-microservices-quiz-platform/
│
├── Service-Registry/
│   └── Service-Registry/
│       └── src/
│
├── api-gateway/
│   └── src/
│
├── question-service/
│   └── question-service/
│       └── src/
│
├── quiz-service/
│   └── quiz-service/
│       └── src/
│
└── README.md
```

---

## 🔄 How It Works

1. The **Service Registry** starts and provides service discovery.
2. Individual microservices register themselves with Eureka.
3. The **API Gateway** acts as the single entry point for clients.
4. Client requests are routed by the API Gateway to the appropriate service.
5. The **Question Service** handles question-related operations.
6. The **Quiz Service** handles quiz-related operations.
7. Services can be scaled independently as application requirements grow.

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

* Java JDK
* Maven
* Git
* Postman or another REST API client
* IntelliJ IDEA / Eclipse (optional)

Verify Java:

```bash
java -version
```

Verify Maven:

```bash
mvn -version
```

---

## 📥 Clone the Repository

```bash
git clone https://github.com/shreyashshirsat23/Spring-Microservices.git
```

```bash
cd Spring-Microservices
```

---

## ▶️ Running the Application

Start the services in the following order:

### 1. Start Service Registry

Navigate to the Service Registry project and run:

```bash
mvn spring-boot:run
```

The Eureka dashboard should be available at:

```text
http://localhost:8761
```

---

### 2. Start Question Service

Navigate to:

```text
question-service/question-service
```

Run:

```bash
mvn spring-boot:run
```

---

### 3. Start Quiz Service

Navigate to:

```text
quiz-service/quiz-service
```

Run:

```bash
mvn spring-boot:run
```

---

### 4. Start API Gateway

Navigate to:

```text
api-gateway
```

Run:

```bash
mvn spring-boot:run
```

The API Gateway will provide a single entry point for accessing the backend services.

> **Note:** Exact ports and API paths should be updated here if they differ from the values configured in your `application.properties` or `application.yml` files.

---

## 🔍 Service Discovery

The project uses **Netflix Eureka** for service discovery.

Instead of hard-coding service locations, microservices register themselves with the Eureka Server.

```text
Question Service ──────┐
                       │
Quiz Service ──────────┼──► Eureka Server
                       │
API Gateway ───────────┘
```

This makes the architecture more flexible and easier to scale.

---

## 🌐 API Gateway

The API Gateway provides a centralized entry point for clients.

Instead of clients communicating directly with every microservice:

```text
Client → Question Service
Client → Quiz Service
```

the architecture uses:

```text
Client
   │
   ▼
API Gateway
   │
   ├──► Question Service
   │
   └──► Quiz Service
```

This approach provides a cleaner architecture and creates a natural place to add concerns such as authentication, authorization, logging, rate limiting, and monitoring as the project evolves.

---

## 🧪 Testing

You can test the REST APIs using:

* Postman
* cURL
* Browser for GET endpoints
* Any REST API client

Example:

```bash
curl http://localhost:<gateway-port>/<endpoint>
```

Replace `<gateway-port>` and `<endpoint>` with the values configured in the project.

---

## 📚 Concepts Demonstrated

This project provides hands-on experience with important microservices concepts:

* Microservices Architecture
* Service Discovery
* Eureka Server
* API Gateway
* RESTful APIs
* Inter-service Communication
* Independent Service Deployment
* Service Registration
* Distributed Application Design
* Scalable Backend Architecture

---

## 🔮 Future Enhancements

The architecture can be extended with additional cloud-native features such as:

* 🔐 Spring Security & JWT Authentication
* ⚡ Resilience4j Circuit Breaker
* ⚙️ Spring Cloud Config Server
* 📊 Spring Boot Actuator
* 📈 Prometheus & Grafana Monitoring
* 🐳 Docker & Docker Compose
* 📨 Apache Kafka / RabbitMQ
* 🔍 Distributed Tracing
* ☸️ Kubernetes Deployment
* 🗄️ Database per Microservice

---

## 🎯 Learning Objectives

By working with this project, you can understand how to:

* Design applications using microservices
* Build independent Spring Boot services
* Implement service discovery with Eureka
* Route requests using an API Gateway
* Structure a multi-service Maven project
* Develop REST APIs
* Understand the fundamentals of scalable distributed systems

---

## 🤝 Contributing

Contributions, suggestions, and improvements are welcome.

If you would like to contribute:

```bash
git fork
```

Create a feature branch:

```bash
git checkout -b feature/your-feature
```

Commit your changes:

```bash
git commit -m "Add your feature"
```

Push your branch:

```bash
git push origin feature/your-feature
```

Then open a Pull Request.

---

## 👨‍💻 Author

**Shreyash Shirsat**

GitHub:
https://github.com/shreyashshirsat23

---

## ⭐ Support

If you find this project useful for learning **Spring Boot, Spring Cloud, and Microservices**, consider giving the repository a ⭐ on GitHub.

---

## 📄 License

This project is intended for learning and educational purposes.
