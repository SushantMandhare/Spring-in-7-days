<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<sf:form method="POST" modelAttribute="book" action="savebook.obj">
<fieldset>
	<%-- <h2>Add <b>book: ${bookName} </b></h2> --%>
	<sf:label path="bookName">Book Name:</sf:label>
	<sf:input path="bookName"/><br>
	<sf:label path="bookPrice">Book Price:</sf:label>
	<sf:input path="bookPrice"/><br>
	<sf:label path="bookAuthor">Book Author:</sf:label>
	<sf:input path="bookAuthor"/><br>
	<input name="commit" type="submit" value="Save Book" />
</fieldset>
</sf:form>
</body>
</html>