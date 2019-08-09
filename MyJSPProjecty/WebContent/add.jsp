<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

<%! int num1,num2,total; %>
<%
num1= Integer.parseInt(request.getParameter("num1"));
num2= Integer.parseInt(request.getParameter("num2"));
total=num1+num2;
session.setAttribute("total", total);

%>

<jsp:forward page="result.jsp"></jsp:forward>
</body>
</html>