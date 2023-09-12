<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Flights</title>
</head>
<body>
<h2>Find Flights</h2>
<form action="findFlights" method="post">
  From :<input type="text" name="from" /><br>
  To   :<input type="text" name="to" /><br>
  Departure date:<input type="text" name="departureDate" /><br>
            <input type="submit" value="Search" />
</form>
</body>
</html>