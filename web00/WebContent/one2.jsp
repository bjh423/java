<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--client(브라우저)가 보낸 데이터를 받아야 함 == 자바 -->
<!--브라우저가 보낸 데이터를 받을 때 사용하는 부품 -->
<%
	//코드 넣는 부분
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜놓음
String no = request.getParameter("no");
BbsDao dao = new BbsDao();
BbsVO bag2 = dao.one(Integer.parseInt(no));
%>
<!-- 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가있음  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%=bag2.getNo()%>번 게시글 검색 요청됨
	<hr color="red">
	<table class="table table-dark table-striped">
		<tr>
			<td>검색한 제목 :</td>
			<td><%=bag2.getTitle()%></td>
		</tr>
		<tr>
			<td>검색한 내용 :</td>
			<td><%=bag2.getContent()%></td>
		</tr>
		<tr>
			<td>검색한 글쓴이 :</td>
			<td><%=bag2.getWriter()%></td>
		</tr>
	</table>
</body>
</html>