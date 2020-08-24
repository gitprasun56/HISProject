<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td> <a href="register">REGISTER</a> </td>
	</tr>
</table>
<hr/>
<H3>WELCOME TO ADMIN REGISTER PAGE</H3>
<form action="save" method="POST">
<pre>
 ID  : <input type="text" name="adminId"/>
First Name: <input type="text" name="firstName"/>
Last Name : <input type="text" name="lastName"/>
Email Id : <input type="text" name="email"/>
Gender : <input type="radio" id="male" name="gender" value="male">
  <label for="male">Male</label><br>
  <input type="radio" id="female" name="gender" value="female">
  <label for="female">Female</label><br>
  Role: <select name="role">
  <option value="admin">admin</option>
  <option value="caseworker">Case Worker</option>
  </select>
	<input type="submit" value="Create"/>
</pre>
</form>
${message}
</body>
</html>