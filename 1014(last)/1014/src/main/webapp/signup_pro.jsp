<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String uid = request.getParameter("id");
	String upass = request.getParameter("ps");
	String uname = request.getParameter("name");
	
	/* String sql = "insert into user (id, password, name) values";
	sql += "('" + uid + "' , '" + upass + "' , ' " + uname + "')"; */
	String sql = "insert into user (id, password, name) values(?, ?, ?)";
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
	
	//Statement stmt = conn.createStatement();
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setString(1, uid);
	stmt.setString(2, upass);
	stmt.setString(3, uname);
	
	//int count = stmt.executeUpdate(sql);
	int count = stmt.executeUpdate();
	out.println(count);
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