<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Book</title>
</head>
<body>
    <h2>Delete Book</h2>
    <form action="DeleteBookServlet" method="post">
        Book ID: <input type="text" name="id" required><br>
        <input type="submit" value="Delete Book">
    </form>
    <a href="index.jsp">Back</a>
</body>
</html>