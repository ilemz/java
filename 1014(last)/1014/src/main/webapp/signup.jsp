<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action = "signup_pro_dao.jsp" method = "post">
	<table align = center width = 400>
		<tr><td colspan = 2 height = 40 align = center> ȸ������ </td> </tr>
		<tr>
			<td>���̵� : </td>
			<td><input type = "text" placeholder = "email" name = "id"></td>
		</tr>
		<tr>
			<td>�н����� : </td>
			<td><input type = "password" name = "ps"></td>
		</tr>
		<tr>
			<td>�н�����(Ȯ��) : </td>
			<td><input type = "password" name = "ps2"></td>
		</tr>
		<tr>
			<td>�̸� : </td>
			<td><input type = "text" name = "name"></td>
		</tr>
		<tr>
			<td colspan = 2 align = center height = 50>
			<input type = "submit" value = "ȸ������"></td>
		</tr>
	</table>
</form>

</body>
</html>