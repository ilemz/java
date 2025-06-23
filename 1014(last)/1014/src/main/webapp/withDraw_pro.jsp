<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String sql = "delete from user where id = ?";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
	
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setString(1, uid);
	
	int count = stmt.executeUpdate();
	if (count == 1){
		out.println("회원 탈퇴가 완료되었습니다.");
	}else{
		out.println("회원 탈퇴가 실패하였습니다.");
	}
	stmt.close(); conn.close();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>