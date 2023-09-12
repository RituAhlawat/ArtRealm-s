<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Registration</title>
</head>
<body>
<h2>Create New Account</h2>
<form action="saveReg" method="post">
<pre>
  First name:<input type="text" name="firstName"/>
  Last name :<input type="text" name="lastName" />
  Email Id  :<input type="text" name="emailId" />
  Password  :<input type="text" name="password" />
             <input type="submit" value="Save" />
</pre>
</form>
</body>
</html>