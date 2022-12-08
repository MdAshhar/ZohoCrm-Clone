<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Bill</title>
</head>
<body>
	<h2>List Bill</h2>

	<table border="">
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Product</th>
			<th>Amount</th>
		</tr>
			<c:forEach var="bill" items="${Bill}">
				<tr>		
					<td>${bill.firstName}</td>
					<td>${bill.lastName}</td>
					<td>${bill.email}</td>
					<td>${bill.mobile}</td>
					<td>${bill.product}</td>
					<td>${bill.amount}</td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>