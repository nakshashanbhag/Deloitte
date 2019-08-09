<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<hr color="red" />
	<form>
		<table >
		<label>Location</label>

		<select id="location" >
      		<option> Bangalore </option>          
       		<option>Chennai</option>
       		<option> Hyderabad </option>
     	</select>
		
 
			<tr>
				<td>Check-in</td>
				<td><input type="text" id="checkIn" name="checkIn"></td>
			</tr>
			
			<tr>
				<td>Check-out</td>
				<td><input type="text" id="checkOut" name="checkOut"></td>
			</tr>
			
		<label>Number Of People</label>

		<select id="noOfPeople" >
      		<option> 1 </option>          
       		<option>2</option>
       		<option> 3 </option>
     	</select>
			
			
	<label>Number Of Rooms</label>

		<select id="noOfRoom" >
      		<option> 1 </option>          
       		<option>2</option>
       		<option> 3 </option>
     	</select>
			<tr>
				<td><input type="submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</form>



</body>
</html>