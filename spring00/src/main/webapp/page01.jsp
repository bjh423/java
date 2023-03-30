<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키 전송
<%
Cookie c1 = new Cookie("category","운동");
Cookie c2 = new Cookie("sort","축구");
response.addCookie(c1);
response.addCookie(c2);
%>
<a href="page02.jsp">page02</a>
</body>
</html>