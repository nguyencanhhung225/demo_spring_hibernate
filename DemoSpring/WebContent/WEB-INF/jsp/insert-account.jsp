<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Account</title>
</head>
<body>
	<h1>Insert Account</h1>
	<table cellpadding="5px">
		<form>
			<tr>
				<td>Username</td>
				<td><input type="text" name=""></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name=""></td>
			</tr>
			<tr>
				<td>Category</td>
				<td>
					<select>
						<c:forEach var="category" items="${msgListCategory}">
							<option value="${category.idCategory}">${category.name}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>