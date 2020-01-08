<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>User Submission Form</h1>
<form:form action="submitForm"  method="POST"  commandName="user">
<table>
<tr>
<td>User Name</td>
<td><form:input path="name"/> </td>
</tr>
<tr>
<td>Password</td>
<td><form:password path="password"/> </td>
</tr>
<tr>
<td>Genter</td>
<td>
<form:radiobutton path="gender"  label="Male"  value="male"/>
<form:radiobutton path="gender"  label="Female"  value="female"/>
</td>
</tr>
<tr>
<td>Country</td>
<td>
<form:select path="country">
<form:option value=""  label="-select-"></form:option>
<form:option value="Spain"  label="Spain"></form:option>
<form:options items="${countryList }"   itemLabel="countryName"   itemValue="countryId"/>
</form:select>
</td>
</tr>
<tr>
<td>About You</td>
<td>
<form:textarea path="aboutYou"/>
</td>
</tr>
<tr>
<td>Community List</td>
<td>
<form:checkboxes items="${communityList }" path="community"  itemLabel="communityName"  itemValue="communityId"/>
</td>
</tr>
<tr>
<td>Mailing</td>
<td>
<form:checkbox path="mailingList"  label="Please tell us if you want mails?"/>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit"  value="Submit"> </td>
</tr>
</table>

</form:form>

</div>
</body>
</html>