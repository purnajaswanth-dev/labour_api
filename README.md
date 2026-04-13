🚀 Labour Backend API

A RESTful backend system built using Spring Boot to manage job postings for labour/workforce applications.
This API allows creating, retrieving, and managing job listings with MySQL as the database.

---

🧠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven

---

⚙️ Features

- Create job postings
- Get all jobs
- Get job by ID
- Automatic table creation using JPA
- RESTful API design

---


🗄️ Database Setup

1. Create MySQL database:

CREATE DATABASE labour_db;

2. Configure "application.properties":

spring.datasource.url=jdbc:mysql://localhost:3306/labour_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

▶️ Running the Project

Using Maven Wrapper

./mvnw spring-boot:run

Or using Maven

mvn spring-boot:run

Server will start at:

http://localhost:8080

---

📡 API Endpoints

🔹 Create Job

POST /api/jobs

Request Body:

{
  "title": "Construction Worker",
  "description": "Skilled worker needed",
  "location": "Mumbai",
  "salary": 15000.0,
  "employerName": "ABC Builders",
  "jobType": "Full-Time"
}

---

🔹 Get All Jobs

GET /api/jobs

---

🔹 Get Job by ID

GET /api/jobs/{id}

---

🧪 Testing APIs

Using curl

curl.exe http://localhost:8080/api/jobs

Using PowerShell

Invoke-RestMethod http://localhost:8080/api/jobs

---

🔐 Security Note

- Do NOT commit "application.properties" with real credentials
- Use environment variables or local configs for sensitive data

---

🚀 Future Improvements

- Add filtering (location, salary range)
- Pagination support
- Authentication & authorization (JWT)
- API documentation (Swagger)

---

👨‍💻 Author

Built as a backend system for learning and scaling into production-ready architecture.

---
