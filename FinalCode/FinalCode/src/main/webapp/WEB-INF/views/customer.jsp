<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Sign Up</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>

<c:url var="addAction" value="/saveCustomerRecord" ></c:url>

<form:form action="${addAction}" modelAttribute="customer">
<table>
	<tr>
		<td>
			<form:label path="customerName">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="customerUsername">
				<spring:message text="Username"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerUsername" size="8"   />
			
		</td> 
	</tr>
	<%-- </c:if> --%>

	<tr>
		<td>
			<form:label path="customerPassword">
				<spring:message text="Password"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerPassword" type="password"/>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="customerContact">
				<spring:message text="Contact"/>
			</form:label>
		</td>
		<td>
			<form:input path="customerContact"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<input type = "submit" value="Sign up!">
		<%-- 	<c:if test="${!empty customer.customerName}">
				<input type="submit" 
				formaction="add/update"
					value="<spring:message text="Signed up! :)" />" />
			</c:if>
			<c:if test="${empty customer.customerName}">
				<input type="submit"
					value="<spring:message text="Sign up!"/>" />
			</c:if> --%>
		</td>
	</tr>
</table>	
</form:form>
${displ} 
<%-- <br>
<h3>Persons List</h3>
<c:if test="${!empty listPersons}">
	<table class="tg">
	<tr>
		<th width="80">Person ID</th>
		<th width="120">Person Name</th>
		<th width="120">Person Country</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listPersons}" var="person">
		<tr>
			<td>${person.id}</td>
			<td>${person.name}</td>
			<td>${person.country}</td>
			<td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if> --%>
</body>
</html>
