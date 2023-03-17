<%@page import="multi.WebtoonDao"%>
<%@page import="multi.WebtoonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.WebtoonVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />
<%
	WebtoonDao dao = new WebtoonDao();
dao.insert(bag);
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
			<td>insert할 id :</td>
			<td><%=bag.getId()%></td>
		</tr>
		<tr>
			<td>insert할 title :</td>
			<td><%=bag.getTitle()%></td>
		</tr>
		<tr>
			<td>insert할 cartoonist :</td>
			<td><%=bag.getCartoonist()%></td>
		</tr>
		<tr>
			<td>insert할 star :</td>
			<td><%=bag.getStar()%></td>
		</tr>
		<tr>
			<td>insert할 img :</td>
			<td><%=bag.getImg()%></td>
		</tr>
	</table>
</body>
</html>