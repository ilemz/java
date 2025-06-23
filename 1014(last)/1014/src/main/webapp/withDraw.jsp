<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action = "withDraw_pro_dao.jsp" method = "post">
		<table align = center>
			<tr><td colspan = 2 height = 40> 회원탈퇴 </td></tr>
			<tr>
				<td>아이디 : </td>
				<td><input type = "text" name = "id" placeholder = "Email address" required></td>
			</tr>
			<tr>
				<td colspan = 2 align = center height = 50>
					<input type = "submit" value = "회원탈퇴하기">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>