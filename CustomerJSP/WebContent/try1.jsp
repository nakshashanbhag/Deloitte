<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html>
<html>

<body>
<s:forEach begin="2" end="10" step="2" var="num">
<br/>${num}
</s:forEach>


</body>
</html>