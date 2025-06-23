<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action = "login_pro_dao.jsp" method = "post">
	<table align = center width = 400>
		<tr><td colspan = 2 height = 40 align = center> 로그인 </td> </tr>
		<tr>
			<td>아이디 : </td>
			<td><input type = "text" placeholder = "email" name = "id"></td>
		</tr>
		<tr>
			<td>패스워드 : </td>
			<td><input type = "password" name = "ps"></td>
		</tr>
		<tr>
			<td colspan = 2 align = center height = 50>
			<input type = "submit" value = "로그인"></td>
		</tr>
	</table>
</form>
</body>
</html>