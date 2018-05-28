<%@page import="Model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Book here</title>
</head>
<body>
<center>
<h3>Last entered emp :${emp.empName}</h3>
<h2>Using Employee Model</h2>
		<h3> 
		    <a href="createTable">Create table</a>
		</h3>
		<h3> 
		    <a href="regemp">Click Here to Employee</a>
		</h3>
		<h3> 
		    <a href="detemp?empname=Sushant">Request Parameter Employee</a>
		</h3>
		<h3> 
		    <a href="detemp/Mandhare">Path Parameter Employee</a>
		</h3>
		<h3> 
		    <a href="selectAll">selectAll Employee</a>
		</h3>
</center>
<table border="1">
<tr>
	<td>ID</td>
	<td>Name</td>
	<td>Salary</td>
	</tr>
<%
Object obj=session.getAttribute("emparr");
if(obj !=null){
	ArrayList<Employee> arr=(ArrayList<Employee>)obj;
	for(Employee e:arr)
	{
		//out.println("${e.empid} "+e.getEmpid());
		%>
		<tr>
		<td><%=  e.getEmpid()%></td>
		<td><%=  e.getEmpName()%></td>
		<td><%=  e.getSalary()%></td>
		</tr>
		<%
	}
}
%>
</table>
</body>
</html>