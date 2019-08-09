<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Business Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a room
</h1>

<c:url var="addAction" value="/incrementRooms" ></c:url>

<form:form action="${addAction}" modelAttribute="storingRoom">
<table>
	<tr>
		<td>
			<form:label path="roomType">
				<spring:message text="Room Type"/>
			</form:label>
		</td>
		<td>
			<form:input path="roomType" size="8"   />
			
		</td> 
	</tr>
	
	<tr>
		<td>
			<form:label path="price">
				<spring:message text="Cost"/>
			</form:label>
		</td>
		<td>
			<form:input path="price" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="noOfRooms">
				<spring:message text="Room Availbility"/>
			</form:label>
		</td>
		<td>
			<form:input path="noOfRooms" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%-- <c:if test="${empty storingRoom.noOfRooms}">  --%>
				<input type="submit" value="save"/>
				<%--formaction="incrementRooms"--%>
					
<%-- 			</c:if>  --%>
			<%-- <c:if test="${!empty storingRoom.noOfRooms}">
				<h1>Rooms are not available</h1>
			</c:if> --%>
			
		</td>
	</tr>
</table>	
 </form:form>
 <br>
<h3>Rooms List</h3>
<c:if test="${!empty listRooms}">
	<table class="tg">
	<tr>
		<th width="80">Room type</th>
		<th width="120">Cost</th>
		<th width="120">Room Availability</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	
	
	<c:forEach items="${listRooms}" var="storingRoom">
		<tr>
			<td>${storingRoom.roomType}</td>
			<td>${storingRoom.price}</td>
			<td>${storingRoom.noOfRooms}</td>
			<td><a href="<c:url value='/incrementRooms/${storingRoom.roomType}' />" >Add</a></td>
			<td><a href="<c:url value='/decrementRooms/${storingRoom.roomType}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
 </body>
</html>
