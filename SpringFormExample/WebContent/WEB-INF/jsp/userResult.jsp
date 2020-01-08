<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User Name 			: ${user.name}  <br>
Gender					: ${user.gender } <br>
Country				: ${user.country} <br>
About You			: ${user.aboutYou} <br>
Mailing					: ${user.mailingList } <br>
Community			: <c:forEach var="c"  items="${user.community}" >
										<c:out value="${c }"></c:out>
									</c:forEach>

</body>
</html>