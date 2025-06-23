<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.util.*" %>
<%@ page import = "dao.*" %>
    
<%
	FeedDAO dao = new FeedDAO();
	ArrayList<FeedObj> feeds = dao.getList();

	String str = "<table align = center>";
	str = str + "<tr><th colspan = 3> 글 목록 </th></tr>";
	
	for(FeedObj feed : feeds){
		str+="<tr><td colspan = 10> <hr> </td></tr>";
		str+="<tr>";
		str+="<td>" + feed.getId() + "<td>";
		str+="<td>" + feed.getContent() + "<td>";
		str+="<td>" + feed.getTs() + "<td>";
		str+= "</tr>";
	}
	str += "</table>";
	out.print(str);
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