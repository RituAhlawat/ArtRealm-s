<%@ page language="java" contentType="text/html; charset=UTF-8" 
 pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Flights</title>
</head>
<body>
<h2>Flight Search Results</h2>
<h2>List of Flights</h2>
<table border="1">
<tr>
<th>Airlines</th>
<th>Department City</th>
<th>Arrival City</th>
<th>Departure Time</th>
<th>Select Flights</th>
</tr>
<c:forEach items="${findFlights}" var="findFlights">
<tr>
<td>${findFlights.operatingAirlines}</td>
<td>${findFlights.departureCity}</td>
<td>${findFlights.arrivalCity}</td>
<td>${findFlights.estimatedDepartureTime}</td>
<td><a href="showCompleteReservation?flightId=${findFlights.id}">Select</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>