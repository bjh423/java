<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 : <%=session.getAttribute("user") %><br>
방문횟수 : <%=session.getAttribute("count")%><br>
</body>
</html>