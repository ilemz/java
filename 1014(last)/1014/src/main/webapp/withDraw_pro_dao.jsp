<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "dao.UserDAO" %>
<%
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String sql = "delete from user where id = ?";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
	
	UserDAO dao = new UserDAO();
	
	if (dao.exists(uid) == false){
		out.println("can't find user");
		return;
	}
	if(dao.delete(uid)){
		out.println("user deleted");
	}
	else{
		out.println("can't delete");
	}
	
	
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