<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SL DevCode Registration</title>
</head>
<body bgcolor="lightgreen">

	<h1 align="center">SL DevCode YouTube Channel..!!</h1>

	<form action="loginRegister" method ="post">
		<table
			style="background-color: skyblue; margin-left: 500px; margin-top: 50px">
			<tr>
				<td><h3 style="color: red;">SL DevCode Registration Form..</h3></td>
				<td></td>
			</tr>

			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>
			
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>Password :</td>
				<td><input type="password" name="password1"></td>
			</tr>
			
			<tr>
				<td>Re-Type Password :</td>
				<td><input type="password" name="password2"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="register"></td>
			</tr>
		</table>
	</form>

</body>
</html>