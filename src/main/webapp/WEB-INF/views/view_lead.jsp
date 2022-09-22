<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Application</title>
</head>
<body>
<form action="saveOneLead" method="post">
<h2>Enter the Details of Lead</h2>
<table>

<tr>
<td>First Name</td>
<td><input type="text" name="firstName"/></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/></td>
</tr>

<tr>
<td>Source</td>
<td><select name="source" id="source">
  <option value="newspaper">News Paper</option>
  <option value="radio">Radio</option>
  <option value="tv">TV</option>
  <option value="online">Online</option>
</select></td>
</tr>

<tr>
<td>Email</td>
<td><input type="email" name="email"/></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="text" name="mobile"/></td>
</tr>

<tr>
<td><input type="submit" value="save"/></td>
</tr>

</table>
</form>
</body>
</html>