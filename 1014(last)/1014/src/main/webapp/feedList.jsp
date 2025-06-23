<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>

<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from feed");
	
	String str = "<table align = center>";
	str = str + "<tr><th colspan = 3> 피드 리스트 </th></tr>";
	while(rs.next()){
		str+="<tr><td colspan = 10> <hr> </td></tr>";
		str+="<tr>";
		str+="<td>" + rs.getString("no") + "<td>";
		str+="<td>" + rs.getString("id") + "<td>";
		str+="<td>" + rs.getString("content") + "<td>";
		str+="<td>" + rs.getString("ts") + "<td>";
		str+= "</tr>";
	}
	str += "</table>";
	out.print(str);
	rs.close(); stmt.close(); conn.close();
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