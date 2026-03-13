# 👤 User Management API - Learning Spring Boot

**Description**: This project is a comprehensive introduction to **Spring Boot 3** and **REST API** development. It follows an evolutionary path from a basic "Hello World" style health check to a professional layered architecture with automated testing and business logic validation.

## 📌 Project Goals

The primary objective of this exercise is to master the fundamental building blocks of the Spring ecosystem:

* Understanding **REST APIs** and JSON data exchange.
* Defining endpoints using `@RestController` and HTTP methods (**GET**, **POST**).
* Handling URL data with `@PathVariable`, `@RequestParam`, and `@RequestBody`.
* Implementing **Inversion of Control (IoC)** and **Dependency Injection**.
* Mastering the **Service** and **Repository** patterns.
* Applying **TDD (Test-Driven Development)** using **MockMvc**, **JUnit 5**, and **Mockito**.

## ✨ Features by Development Level

### Level 1: Infrastructure & Health Check

* Setup of a Spring Boot environment on port `9000`.
* Implementation of a `/health` endpoint returning a structured JSON: `{"status": "OK"}`.
* Manual verification via Browser and **Postman**.
* Automated Web Layer testing using `@WebMvcTest`.
* Executable `.jar` generation and deployment using **Maven**.

### Level 2: In-Memory Data Management

* Creation of a `User` model with `UUID`, `name`, and `email`.
* Management of an in-memory user list within the controller.
* Endpoints implemented:
* `GET /users`: List all users or filter by name using `@RequestParam`.
* `POST /users`: Create users with auto-generated UUIDs.
* `GET /users/{id}`: Retrieve a specific user with **404 Not Found** handling.



### Level 3: Layered Architecture & TDD

* **Refactoring**: Moving from a "Fat Controller" to a decoupled architecture (SOLID principles).
* **Repository Layer**: Implementation of `UserRepository` (Interface) and `InMemoryUserRepository`.
* **Service Layer**: Business logic isolation in `UserServiceImpl` (Email uniqueness validation).
* **Advanced Testing**:
* Integration tests with `@SpringBootTest`.
* Unit tests for business logic using **Mockito** to mock repository dependencies.



## 🛠 Technologies

* **Backend**: Java 21 (LTS), Spring Boot 3.x
* **Build Tool**: Maven
* **Testing**: JUnit 5, MockMvc, Mockito
* **JSON Processing**: Jackson (Native Spring Boot)
* **Utilities**: Spring Boot DevTools, UUID

## 🚀 Installation and Execution

1. **Clone the repository**:
```bash
git clone https://github.com/your-username/user-api.git

```


2. **Configure Environment**: Ensure you are using Java 21. Check `src/main/resources/application.properties` for `server.port=9000`.
3. **Build the project**:
```bash
mvn clean package

```


4. **Run the Application**:
```bash
java -jar target/userapi-0.0.1-SNAPSHOT.jar

```


5. **Testing**: Run all automated tests (Unit & Integration):
```bash
mvn test

```



## 🧩 Technical Decisions & Patterns

* **Separation of Concerns**: The Controller only handles HTTP, the Service handles logic, and the Repository handles data.
* **UUID for IDs**: Since there is no database auto-increment, `UUID` ensures unique identifiers within the code.
* **Conventional Commits**: All progress is documented using clear, English-standard commit messages (e.g., `feat:`, `test:`, `refactor:`).
* **Dependency Injection**: Used to decouple the Service from specific Repository implementations, allowing for easier testing and future database migration (e.g., to H2 or MySQL).
