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
		// 쿠키 생성(저장할 정보 1개 = 쿠키 1개)
	Cookie c1 = new Cookie("name", "홍길동");
	Cookie c2 = new Cookie("age", "100");
	// 쿠키를 브라우저로 전송
	response.addCookie(c1);
	response.addCookie(c2);
	%>
	<br>
	
	<a href="쿠키리스트.jsp">쿠키 가져오기</a>
</body>
</html>