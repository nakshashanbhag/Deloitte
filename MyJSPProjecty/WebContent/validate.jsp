<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>

<%
String Username= request.getParameter("username");
String password= request.getParameter("password");

if(Username.equalsIgnoreCase("chaithra") && password.equals("nayak"))
{
	%>
	<jsp:forward page="success.jsp"></jsp:forward>
	<% 
}
else
{
	session.setAttribute("errMsg","incorrect usernaame or Password");
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>