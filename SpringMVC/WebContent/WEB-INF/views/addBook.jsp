<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
<h2>Create a User</h2>
<sf:form method="GET" modelAttribute="book" action="ProcessBook.obj" >
	<fieldset>
	 <b>book brandname: ${brandname} </b>
	<table cellspacing="0">
	
	   
		<tr>
			<th><sf:label path="bookname">Bookname:</sf:label></th>
			<td><sf:input path="bookname" size="15" maxlength="15" /> 
			<br />
			
		</tr>

		<tr>
         <th><sf:label path="bookid">Bookid</sf:label></th>
         <td><sf:input path="bookid" size="30"/>       
            </td>
      </tr>

      <tr>
         <th><sf:label path="bookprice">Book Price:</sf:label></th>

         <td><sf:input path="bookprice" size="30"/> 
            <br/>
            
            </td>
      </tr>


		<tr>
			<th></th>
			<td><input name="commit" type="submit" value="Save Book" /></td>
		</tr>

	</table>
	</fieldset>
</sf:form></div>