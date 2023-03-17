<%@page import="multi.WebtoonDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="multi.WebtoonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	WebtoonDao dao = new WebtoonDao();
ArrayList<WebtoonVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%
		if (list.size() == 0) {
	%>
	<h3>검색 결과가 없습니다</h3>
	<%
		} else {
	%>
	<table class="table table-dark table-striped">
		<tr>
			<td>id</td>
			<td>title</td>
			<td>cartoonist</td>
			<td>star</td>
			<td>img</td>
		</tr>
		<%
			for (WebtoonVO bag : list) {
		%>
		<tr>
			<td><%=bag.getId() %></td>
			<td><a href="one5.jsp?id=<%=bag.getId()%>"><%=bag.getTitle() %></a></td>
			<td><%=bag.getCartoonist() %></td>
			<td><%=bag.getStar() %></td>
			<td><%=bag.getImg() %></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		}
	%>
</body>
</html>