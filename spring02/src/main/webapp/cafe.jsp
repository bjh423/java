<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="resources/yes.png">
	<br>
	<%
		if (session.getAttribute("id") != null) {
	%>
	<a href="bbb"><button>공동구매 참여</button></a>
	<%
		} else {
	%>
	<a href="login"><button>로그인 페이지로</button></a>
	<%
		}
	%>
</body>
</html>