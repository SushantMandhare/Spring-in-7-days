<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
<h2>Register Employee</h2>
<sf:form method="POST" modelAttribute="emp" action="processEmp" >
	<fieldset>
	<table cellspacing="0">
	
	   
		<tr>
			<th><sf:label path="name">Emp Name:</sf:label></th>
			<td><sf:input path="name" size="15" maxlength="15" /> 
			<br />
			
		</tr>

		<tr>
         <th><sf:label path="id">Emp Id</sf:label></th>
         <td><sf:input path="id" size="30"/>       
            </td>
      </tr>

      <tr>
         <th><sf:label path="sal">Emp Sal:</sf:label></th>

         <td><sf:input path="sal" size="30"/> 
            <br/>
            
            </td>
      </tr>


		<tr>
			<th></th>
			<td><input name="commit" type="submit" value="Save Emp" /></td>
		</tr>

	</table>
	</fieldset>
</sf:form></div>