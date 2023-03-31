<%@page import="com.multi.mvc01.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	MemberVO bag = (MemberVO) request.getAttribute("bag");
	String id = bag.getId();
	session.setAttribute("id",id); %>
	<%=id%>님
	로그인 성공
	<br>
	<a href="bbs.jsp">처음페이지로</a>
	<br>
</body>
</html>