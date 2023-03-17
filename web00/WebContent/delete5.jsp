<%@page import="multi.WebtoonDao"%>
<%@page import="multi.WebtoonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	WebtoonDao dao = new WebtoonDao();
String id = request.getParameter("id");
dao.delete(id);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>delete한 id :</td>
			<td><%=id %></td>
		</tr>
	</table>
</body>
</html>