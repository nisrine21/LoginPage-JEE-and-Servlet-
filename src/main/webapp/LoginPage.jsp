<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form action="ExamplePackage/LoginServlet">
            <label for="un">Username:</label>
            <input type="text" id="un" name="un">
            <label for="pw">Password:</label>
            <input type="password" id="pw" name="pw">
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
