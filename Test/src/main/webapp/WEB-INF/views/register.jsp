<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body {
  background-image: url("https://i.imgur.com/KaLyyPW.jpg");
  background-repeat:no-repeat;
  background-size:cover;
}
</style>
</head>
<center style="padding-top:100px;font-size:20px;">
<body>
<form action="/register.do" >
  <div class="container">
    <h1>REGISTER</h1>
    <p>Please fill in this form to create an account.</p>

    <label for="username"><b>UserName</b></label>
    <input type="search" placeholder="Enter Username" name="username" id="username" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required>

    <p>By creating an account you agree to our <a href="/termsandconditions.do">Terms & Privacy</a>.</p>
    <button style="font-size:16px;" type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="/login.do">Sign in</a>.</p>
  </div>
</form>
</center>
</body>
</html>