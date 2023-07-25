<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact info</title>
</head>
<body>
<h2>Contact Info</h2>
<table>
<tr><td>FirstName:</td><td>${contact.firstName}</td></tr>
<tr><td>LastName:</td><td>${contact.lastName}</td></tr>
<tr><td>Email:</td><td>${contact.email}</td></tr>
<tr><td>Mobile:</td><td>${contact.mobile}</td></tr>
<tr><td>Source:</td><td>${contact.source}</td></tr>
</table>



</body>
</html>