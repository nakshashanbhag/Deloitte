<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<form>
<%
	out.println("Say hello to JSP");
%>

<%
for(int i=0;i<5;i++){
%>
<h1>Hai</h1>
<%
}%>

<%
int marks =9;
if(marks>10)
	out.println("Work hard");
else
	out.println("Congrats");
%>
<h2>You obtained <%= marks %></h2>
</form>
</body>
</html>