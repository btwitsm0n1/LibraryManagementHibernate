# Library Management System

A simple web application to manage books in a library. Built as part of my CDAC project to understand Hibernate with Servlets and JSP.



## What I used

- Java
- Hibernate (for database mapping)
- Servlet & JSP
- MySQL
- Tomcat 9
- Maven



## What it does

- Add a new book
- Delete a book by ID
- Update book details (title, author, price)
- Search a book by ID
- Show all books in a list



## How I structured it

I followed a basic MVC pattern:

- JSP files handle the frontend
- Servlets process the requests
- DAO layer talks to the database using Hibernate
- MySQL stores the data



## How to run it

1. Import the project as a Maven project in Eclipse
2. Create a database in MySQL: `librarydb`
3. Update `hibernate.cfg.xml` with your database username and password
4. Add Tomcat 9 server and run the project
5. Open `http://localhost:8080/LibraryManagementHibernate/` in your browser



## Database setup

Run this SQL to create the table:

-sql

CREATE DATABASE librarydb;
USE librarydb;
CREATE TABLE book (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE
);
