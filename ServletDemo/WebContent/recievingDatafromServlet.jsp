<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstName = (String)session.getAttribute("fName");
		String lastName = (String)session.getAttribute("lName"); 
	%>
	${name}
	${rollNo}
	
	Full Name:
	
	
	<%= firstName %>
	<%= lastName %>
	
</body>
</html>