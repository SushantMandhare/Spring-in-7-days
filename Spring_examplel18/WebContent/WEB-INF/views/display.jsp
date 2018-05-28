<%@page import="Model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<td>ID</td>
	<td>Name</td>
	<td>Salary</td>
	</tr>
<%
Object obj=request.getAttribute("emparr");
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
<a href="${pageContext.request.contextPath}/">Main Page
</body>
</html>