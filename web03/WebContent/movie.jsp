<%@page import="multi.MovieDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	MovieDao dao = new MovieDao();
	dao.insert(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>