<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="post">
        <label>Username:</label>
        <input type="text" name="username" required/><br/><br/>

        <label>Password:</label>
        <input type="password" name="password" required/><br/><br/>

        <button type="submit">Register</button>
    </form>
</body>
</html>
