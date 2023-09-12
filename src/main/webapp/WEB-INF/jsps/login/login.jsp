<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<h2>Login Here</h2>
${error}
<form action="verifyLogin" method="post">
  Email Id  :<input type="text" name="emailId" /><br>
  Password  :<input type="password" name="password" /><br>
                <input type="submit" value="Login" />
</form>
</body>
</html>