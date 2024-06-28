# Student Book Management System

Welcome to the Student Book Management System, a modern Spring Boot application designed to manage students and books efficiently. This project aims to provide functionalities for managing students, books, and the assign of books to students.

## Frameworks and Languages

The Student Book Management System is developed using the following frameworks and languages:

- **Java**: The programming language used for backend development.
- **Spring Boot**: A Java-based framework for building web applications.
- **Spring Data JPA**: Simplifying data access for a smoother user experience.
- **MySQL**: The chosen database management system.
- **Lombok**: Reducing boilerplate code, allowing a focus on innovative features.

## Project Structure

The project follows a standard Spring Boot MVC structure and consists of the following components:

- **Controller**: Contains the API endpoints and request mappings.
- **Service**: Implements business logic and interacts with the repository.
- **Repository**: Handles data access to the MySQL database.
- **Model**: Represents the data models (entities) mapped to the MySQL database.

## Features and Functionality

## API Endpoints

### Book Controller

- **Create Book**
  - **Endpoint:** `/book/creating`
  - **Method:** `POST`
  - **Description:** Sign up for a new account.

- **Update Book**
  - **Endpoint:** `/book/updating`
  - **Method:** `PUT`
  - **Description:** Updates an existing book with the provided details.

- **Delete Book**
  - **Endpoint:** `/book/deleting`
  - **Method:** `DELETE`
  - **Request Parameter:** `bookId` (String)
  - **Description:** Deletes a book by its ID.

- **Get All Books**
  - **Endpoint:** `/book/booksData`
  - **Method:** `GET`
  - **Description:** Retrieves details of all books.

- **Get Book By ID**
  - **Endpoint:** `/book/getDataByBookId/{bookId}`
  - **Method:** `GET`
  - **Path Variable:** `bookId` (String)
  - **Description:** Retrieves details of a book by its ID.

- **Get Book By Name**
  - **Endpoint:** `/book/getDataByBookName/{bookName}`
  - **Method:** `GET`
  - **Path Variable:** `bookName` (String)
  - **Description:** Retrieves details of a book by its name.

### Student Controller

- **Create Student**
  - **Endpoint:** `/student/creating`
  - **Method:** `POST`
  - **Description:** Creates a new student with the provided details.

- **Update Student**
  - **Endpoint:** `/student/updating`
  - **Method:** `POST`
  - **Description:** Updates an existing student with the provided details.

- **Delete Student**
  - **Endpoint:** `/student/delete`
  - **Method:** `DELETE`
  - **Request Parameter:** `studentId` (int)
  - **Description:** Deletes a student by their ID.

- **Get All Students**
  - **Endpoint:** `/student/retriving`
  - **Method:** `GET`
  - **Description:** Retrieves details of all students.

- **Get Student By ID**
  - **Endpoint:** `/student/retriveById`
  - **Method:** `GET`
  - **Request Parameter:** `studentId` (int)
  - **Description:** Retrieves details of a student by their ID.

- **Get Student By Name**
  - **Endpoint:** `/student/retriveByName`
  - **Method:** `GET`
  - **Request Parameter:** `studentName` (String)
  - **Description:** Retrieves details of a student by their name.

### Student and Book Assign Controller

- **Assign Book to Student**
  - **Endpoint:** `/studentbookassign/assign`
  - **Method:** `POST`
  - **Description:** Assigns a book to a student.

- **Deassign Book from Student**
  - **Endpoint:** `/studentbookassign/deassign`
  - **Method:** `POST`
  - **Description:** Deassigns a book from a student.

- **Get All Assignments**
  - **Endpoint:** `/studentbookassign/getdata`
  - **Method:** `GET`
  - **Description:** Retrieves all book assignments.

- **Get Data by Multiple Tables**
  - **Endpoint:** `/studentbookassign/getDataByMultipleTables`
  - **Method:** `GET`
  - **Description:** Retrieves combined data from multiple tables (students and books).

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any changes.

