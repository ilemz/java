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
		<tr><td colspan = 2 height = 40 align = center> �α��� </td> </tr>
		<tr>
			<td>���̵� : </td>
			<td><input type = "text" placeholder = "email" name = "id"></td>
		</tr>
		<tr>
			<td>�н����� : </td>
			<td><input type = "password" name = "ps"></td>
		</tr>
		<tr>
			<td colspan = 2 align = center height = 50>
			<input type = "submit" value = "�α���"></td>
		</tr>
	</table>
</form>
</body>
</html>