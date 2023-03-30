<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 전송
	<%
		session.setAttribute("count", 100);
	%>
	<br><a href="page04.jsp">page04</a>
</body>
</html>