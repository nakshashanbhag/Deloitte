<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<h2>Login Page</h2>
<form action="validate.jsp">
UserName: <input type="text" name="username"><br/>
Password: <input type="password" name="password">
<input type="submit" value="login">
<%
String errorMessage = (String)session.getAttribute("errMsg");
if(errorMessage==null)
	errorMessage="";
%>
<br/>
<font color="red"><%=errorMessage %></font>

</form>



</body>
</html>