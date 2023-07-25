<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill page</title>
</head>
<body>
<h2>Create Bill Here..</h2>
<form  action="saveBill" method="post">
<table>
<tr><td>FirstName</td><td><input type="text" name="firstName" value="${contact.firstName}"/></td></tr>
<tr><td>LastName</td><td><input type="text" name="lastName" value="${contact.lastName}"/></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value="${contact.email}"/></td></tr>
<tr><td>Mobile</td><td><input type="text" name="mobile" value="${contact.mobile}"/></td></tr>
<tr><td>Product</td><td><input type="text" name="product"/></td></tr>
<tr><td>Amount</td><td><input type="text" name="amount"/></td></tr>
<tr><td><input type="submit" value="Generate Bill"/></td></tr>
</table>
</form>

</body>
</html>