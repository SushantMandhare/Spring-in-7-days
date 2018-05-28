<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<h2>Create a User</h2>
<form method="GET"  action="login" >

	<table cellspacing="0">
		<tr>
			<th><label for="username">Username:</label></th>
			<td><input type="text" name="username"/> </td>
		</tr>

		<tr>
            <th><label for="password">Password</label></th>
			<td><input type="password" name="password"/> </td>
      </tr>

      <tr>
			<th></th>
			<td><input name="submit" type="submit" value="Login" /></td>
		</tr>

	</table>
	
	</form>
	