<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! 
		int i=9,j=7;
		int k =0;
		Scanner scan = new Scanner(System.in);
	%>


	<h1>Hello World!</h1>
	<%
		k=9/0;
	%>
	<%= k %>

</body>
</html>