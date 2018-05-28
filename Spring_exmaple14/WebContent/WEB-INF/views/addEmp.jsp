<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Employee</title>
</head>
<body>
<sf:form method="POST" modelAttribute="emp" action="saveemp">
<fieldset>
	<sf:label path="empid">Employee ID:</sf:label>
	<sf:input path="empid"/><br>
	<sf:label path="empName">Employee Name:</sf:label>
	<sf:input path="empName"/><br>
	<sf:label path="salary">Employee Salary:</sf:label>
	<sf:input path="salary"/><br>
	<input name="commit" type="submit" value="Save Employee" />
</fieldset>
</sf:form>
</body>
</html>