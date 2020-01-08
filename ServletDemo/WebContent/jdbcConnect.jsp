<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JDBC Connect</title>
</head>
<body>
	<%!
	String url;
	String user;
	String password;
	String sql;
	%>
	
	<%
	url = "jdbc:mysql://localhost:3306/test";
	user = "root";
	password = "root";
	sql = "select * from table1";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, user, password);	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	while(rs.next())
	{
		out.println(rs.getString(1) + " " + rs.getInt(2));
	}
	%>
	

</body>
</html>