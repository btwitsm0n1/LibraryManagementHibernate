<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Book</title>
</head>
<body>
    <h2>Update Book</h2>
    <form action="UpdateBookServlet" method="post">
        Book ID: <input type="text" name="id" required><br>
        New Title: <input type="text" name="title"><br>
        New Author: <input type="text" name="author"><br>
        New Price: <input type="text" name="price"><br>
        <input type="submit" value="Update Book">
    </form>
    <a href="index.jsp">Back</a>
</body>
</html>