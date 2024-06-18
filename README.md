# Makersharks-Assessment

## Description

This project is a simple user registration and user details fetch RESTful API built with Spring Boot and MySQL.

## Prerequisites

- Java Development Kit (JDK) 17 or later
- Maven 3.3.0 or later
- MySQL Server

## Getting Started

### Clone the Repository

```bash
git clone  https://github.com/AbhishekPapondiya/MakersharksAssessment_.git
# Configure MySQL Database
Create a MySQL database for the application.
Update the application.properties file with your MySQL database configuration.
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

The application should now be running on http://localhost:8080.

## API Endpoints
Register a User
URL: /api/user/register
Method: POST
Request Body:
{
  "username": "example_user",
  "email": "user@example.com",
  "password": "securepassword"
}


## Fetch User Details
URL: /api/user/fetch
Method: GET
Query Parameter: username
