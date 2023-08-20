# SpringBoot
# Spring Boot Application with JWT, Spring Security, MongoDB, and MySQL Integration

This repository contains a Spring Boot application that demonstrates the integration of various technologies such as Spring Boot, JWT (JSON Web Tokens), Spring Security, MongoDB, and MySQL. The application showcases a secure authentication and authorization setup using JWT tokens, along with data storage and retrieval using both MongoDB and MySQL databases.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Endpoints](#endpoints)
- [Authentication and Authorization](#authentication-and-authorization)
- [Database Configuration](#database-configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven
- MongoDB
- MySQL

## Getting Started

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/your-spring-boot-repo.git
   ```

2. Navigate to the project directory:

   ```bash
   cd your-spring-boot-repo
   ```

3. Build the application using Maven:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

## Configuration

- Application configuration can be found in the `application.properties` file, where you can configure properties like server port, database connection details, and JWT secret key.

## Endpoints

The application exposes the following endpoints:

- `/api/signup` - Register a new user
- `/api/login` - Obtain a JWT token by logging in
- `/api/resource` - A protected endpoint requiring authentication
- `/api/admin` - A protected endpoint requiring ADMIN role

## Authentication and Authorization

The application utilizes JWT for authentication and authorization. After successful login, a JWT token is generated and sent back to the client, which should be included in the `Authorization` header of subsequent requests.

## Database Configuration

- MongoDB: The application uses MongoDB for certain data storage. MongoDB connection details can be configured in `application.properties`.

- MySQL: The application uses MySQL for certain data storage. MySQL connection details can be configured in `application.properties`.

## Usage

1. **User Registration**: Make a POST request to `/api/signup` with user details in the request body to register a new user.

2. **User Login**: Make a POST request to `/api/login` with user credentials in the request body. On successful login, you'll receive a JWT token.

3. **Access Protected Endpoints**: Include the obtained JWT token in the `Authorization` header for protected endpoints (`/api/resource` and `/api/admin`).

## Contributing

Contributions to this project are welcome! If you find any issues or want to add enhancements, feel free to create a pull request. For major changes, please open an issue first to discuss the proposed changes.

## License

This project is licensed under the [MIT License](LICENSE).

---

