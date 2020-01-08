<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
	<form action="add" method="post">
		Enter 1st Number: <input type="text" name="num1"><br>
		Enter 2nd Number: <input type="text" name="num2"><br>
		<input type="submit">
	</form>
	
	<a href="home.jsp"><button>HOME</button></a>
	
	<form action="home.jsp">
		<input type="submit" value="Go to home">
	</form>
</body>
</html>