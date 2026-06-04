<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
    <h2>Add New Book</h2>
    <form action="AddBookServlet" method="post">
        Title: <input type="text" name="title" required><br>
        Author: <input type="text" name="author" required><br>
        Price: <input type="text" name="price" required><br>
        <input type="submit" value="Add Book">
    </form>
    <a href="index.jsp">Back</a>
</body>
</html>