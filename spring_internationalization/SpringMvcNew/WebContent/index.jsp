<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
 
	<center>
		
		<p> Last Registered Employee is ${emp.name}  </p>
	
		<h2>Using Request Parameter empname with Emp Controller</h2>
		<h3> 
		    <a href="empdet?empname=Rajat">Employee With Request Param empname</a>
		</h3>
		
		
	    <h2>Using Path Parameter with Emp Controller</h2>
		<h3> 
		    <a href="empdet1/Raj">Emp with path parameter</a>
		</h3>
		
	    <h2>Using Emp Model With Emp Controller</h2>
		<h3> 
		    <a href="regEmp">Click Here to Register Employee</a>
		</h3>
		
		 <h2>Using Welcome</h2>
		<h3> 
		    <a href="welcome">Click Here to Welcome page</a>
		</h3>
		
		
		
		
	</center>
</body>
</html>