<%@page import="java.util.ArrayList"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--client(브라우저)가 보낸 데이터를 받아야 함 == 자바 -->
<!--브라우저가 보낸 데이터를 받을 때 사용하는 부품 -->
<%
	BbsDao dao = new BbsDao();
ArrayList<BbsVO> list = dao.list();
%>
<!-- 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가있음  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			<td>no</td>
			<td>title</td>
			<td>content</td>
			<td>writer</td>
		</tr>

		<%
			for (BbsVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getNo()%></td>
			<td><a href="http://localhost:8888/web00/one2.jsp?no=<%=bag2.getNo()%>">
					<%=bag2.getTitle()%>
			</a></td>

			<td><%=bag2.getContent()%></td>
			<td><%=bag2.getWriter()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>