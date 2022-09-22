<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
<a href="/">Create Lead</a>
<h2>List of the Leads</h2>
<table border="1" width="500">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Source</th>
<th>Email</th>
<th>Mobile</th>
</tr>
</table>

<c:forEach var="stored" items="${stored}">
<table border="1" width="500">
<tr>
<td><a href="leadInfo?id=${stored.id}">${stored.firstName}</a></td>
<td>${stored.lastName}</td>
<td>${stored.source}</td>
<td>${stored.email}</td>
<td>${stored.mobile}</td>
</tr>
</table>

        </c:forEach>
</body>
</html>