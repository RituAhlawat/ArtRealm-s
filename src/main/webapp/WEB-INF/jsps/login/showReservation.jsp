<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>
Flight Number:${flight.flightNumber}<br>
Operating Airlines:${flight.operatingAirlines}<br>
Departure City:${flight.departureCity}<br>
Arrival City:${flight.arrivalCity}<br>
Departure Date:${flight.dateOfDeparture}<br>

<h2>Enter Passenger Details</h2>
<form action="confirmReservation" method="post">
<pre>
 First name:<input type="text" name="firstName"/>
 Last name:<input type="text" name="lastName" />
 Middle name:<input type="text" name="middleName" />
 Email Id :<input type="text" name="emailId" />
 Phone :<input type="text" name="phone" />
  <input type="hidden"  name="flightId" value="${flight.id}" />
  <h2>Enter The Payments Details</h2>
 Name on the Card:<input type="text" name="nameOnTheCard"/><br>
 Card Number:<input type="text" name="cardNumber" /><br>
 CVV:<input type="text" name="cvv" /><br>
 Expiry Date:<input type="text" name="expiryDate" /><br>
  
  <input type="submit" value="Complete Reservation" />
</pre>
</form>


</body>
</html>