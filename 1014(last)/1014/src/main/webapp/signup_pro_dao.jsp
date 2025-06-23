<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "dao.UserDAO" %>
<%
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String upass = request.getParameter("ps");
	String uname = request.getParameter("name");
	
	UserDAO dao = new UserDAO();
	
	if (dao.exists(uid)){
		out.println("already exists");
		return;
	}
	
	if(dao.insert(uid, upass, uname)) {
		out.println("finished");
	}
	else {
		out.println("failed");
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