<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Account</title>
</head>
<body>
	<h1>List Account</h1>
	<a href="${pageContext.request.contextPath}/account/insert.html">Insert Account</a>
	
	<table cellspacing="0px" cellpadding="5px" border="1px" style="margin-top: 10px">
		<tr>
			<th>Username</th>
			<th>Password</th>
			<th>Category</th>
			<th>...</th>
		</tr>
		<c:forEach var="account" items="${msgListAccount}">
			<tr>
				<td>${account.username}</td>
				<td>${account.password}</td>
				<td>${account.category.name}</td>
				<td>
					<a href="${pageContext.request.contextPath}/account/edit.html">Edit</a>
					<a href="${pageContext.request.contextPath}/account/delete.html">Delete</a>
				</td>
			</tr>
		</c:forEach>
		
		
	</table>
	
</body>
</html>