<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image: url("https://i.imgur.com/i3yUEO1.jpg");
  background-repeat:no-repeat;
  background-size:100% 330%;
}
</style>
</head>
<body style="font-family:-webkit-pictograph;">
<form>
	<a style="float:right;" href="/logout.do" >Logout</a>
</form>
<p>Hii!!! ${name}</p>
<p>Your Play List is:</p>
<ol>
	<c:forEach items="${playlist}" var="playlist">
		<li>${playlist.name} &nbsp; &nbsp; <a href="\deleteplaylist.do?playlist=${playlist.name}">Delete</a></li>
	</c:forEach>
</ol>
<form action="/playlist.do" method="post">
	<input type="text" name="playlist2"/>
	<input type="submit" value="Add"/>
</form>
</body>
</html>