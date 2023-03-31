<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="resources/yes.png" width=200px height=200px>
	<br>

	<%
		if (session.getAttribute("id") != null) {
	%>
	<form action="aaa">
		댓글 : <input name="reply">
		<button>댓글달기</button>
	</form>
	<%
		}
	%>
</body>
</html>