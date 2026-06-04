<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Search Book</title>
</head>
<body>
    <h2>Search Book by ID</h2>
    <form action="SearchBookServlet" method="get">
        Book ID: <input type="text" name="id" required><br>
        <input type="submit" value="Search">
    </form>
    <a href="index.jsp">Back</a>
</body>
</html>