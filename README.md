Here’s an updated README for your Student Application:

# Student Application

## Overview
This repository contains the source code for the Student Application project. The project is currently under development by Anuj Garg, a passionate learner from India.

## Getting Started
To get started with this project, clone the repository to your local machine.

```bash
git clone https://github.com/Anuj3366/Application.git
```

Then, navigate into the project directory and install the necessary dependencies. To run the application, use the following command:

./gradlew clean build bootrun

Features
The Student Application project includes the following features:

Add Student: This feature allows you to add a student with their name, age, Aadhar number, and university. It returns an ID for the added student.
GetAllStudentByUniversity: This feature returns a list of all students from a specified university.
GetStudentById: This feature allows you to retrieve a student’s details using their ID.
API Endpoints
The application provides the following API endpoints:

Add Student: http://localhost:8080/Student/AddStudent
Get All Students By University: http://localhost:8080/Student/GetAllStudentByUniversity
Get Student By ID: http://localhost:8080/Student/GetStudentById
