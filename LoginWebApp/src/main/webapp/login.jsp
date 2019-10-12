<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${loginerror}

	<form action="login" method="get">
		<input type="text" name="userName" placeholder="UserName"><br>
		<input type="password" name="password" placeholder="Password"><br>
		<input type="submit" placeholder="Login" >
	</form>
</body>
</html>