<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
Employee reg Details:
<ul>
<li>${emp.empid}</li>
<li>${emp.empName}</li>
<li>${emp.salary}</li>
</ul>
<a href="${pageContext.request.contextPath}/">Main Page</a>
</body>
</html>