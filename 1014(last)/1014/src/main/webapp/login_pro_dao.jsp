<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "dao.*" %>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String upass = request.getParameter("ps");
	
	UserDAO dao = new UserDAO();
	
	int code = dao.login(uid, upass);
	
	if(code == 1){
		out.print("아이디가 존재하지 않는다.");
	}else if (code == 2) {
		out.print("패스워드가 일치하지 않는다.");
	}else{
		session.setAttribute("id", uid);
		response.sendRedirect("main.jsp");
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