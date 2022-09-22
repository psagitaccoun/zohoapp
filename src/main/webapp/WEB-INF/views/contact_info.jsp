<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<body>
<h2>Details of the Contact</h2>
Lead Id:${contact.id} <br/>
First Name:${contact.firstName} <br/>
Last Name:${contact.lastName} <br/>
Email:${contact.email} <br/>
Mobile:${contact.mobile}


</body>
</html>