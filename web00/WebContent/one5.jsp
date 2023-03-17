<%@page import="multi.WebtoonDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="multi.WebtoonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	WebtoonDao dao = new WebtoonDao();
String id = request.getParameter("id");
WebtoonVO bag = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>one page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<table class="table table-dark table-striped">
		<tr>
			<td>id</td>
			<td><%=bag.getId()%></td>
		</tr>
		<tr>
			<td>title</td>
			<td><%=bag.getTitle()%></td>
		</tr>
		<tr>
			<td>cartoonist</td>
			<td><%=bag.getCartoonist()%></td>
		</tr>
		<tr>
			<td>star</td>
			<td><%=bag.getStar()%></td>
		</tr>
		<tr>
			<td>img</td>
			<td><img src="img/<%=bag.getId()%>.png"></a></td>
		</tr>
	</table>
</body>
</html>