<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill info</title>
</head>
<body>
<h2>Bill Info</h2>
<table>
<tr><td>FirstName:</td><td>${bill.firstName}</td></tr>
<tr><td>LastName:</td><td>${bill.lastName}</td></tr>
<tr><td>Email:</td><td>${bill.email}</td></tr>
<tr><td>Mobile:</td><td>${bill.mobile}</td></tr>
<tr><td>Product:</td><td>${bill.product}</td></tr>
<tr><td>Amount:</td><td>${bill.amount}</td></tr>
</table>



</body>
</html>