<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/CustomTag.tld" prefix="a" %>
<!DOCTYPE html>
<html>

<body>

<%-- Customer details are <%= session.getAttribute("cust")%> --%>
${cust.customerId} <br/>
${cust.customerName} <br/>
${cust.customerAddress} <br/>
${cust.billAmount} <br/>
<a:delloiteAdd></a:delloiteAdd>
</body>
</html>