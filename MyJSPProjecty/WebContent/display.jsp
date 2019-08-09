<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
</head>
<body>

	<%! String username;
	Date d;%>
	
	<%
		username =request.getParameter("username");
	%>
	Welcome,<%=username%>
	<%
	if(username.equals("chai"))
	{
		d= new Date();
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.include(request, response);
		
	}
	else
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("hello.html");
			dispatcher.include(request, response);
	}
	%>
	

</body>
</html>