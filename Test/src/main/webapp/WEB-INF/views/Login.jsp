<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp login page</title>
<style>
div.bor{
border-style:solid;
width:50%;}
body {
  background-image: url("https://i.imgur.com/x2Uj4An.jpg");
  background-repeat:no-repeat;
  background-size:50%;
  font-size:22px;
}
</style>
</head>
<body >
<center  style="padding-left: 750px;padding-top: 90px;">

<h1>Login Form </h1><div class="bor">

<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>
		<table style="border-spacing:15px;">
 
			<tr>
				<td>UserName:</td>
				<td><input type="search" name="name" /></td>
			</tr>
				<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<br>
		<input style="font-size:20px;" type="submit" value="Login" /></form>
<p>To create an account click on signup</p>
<form action="/register.do">
	<input style="font-size:18px;" type="submit" value="signup"/>
</form>
<br>
<br>
</div>
</center>
</body>
</html>