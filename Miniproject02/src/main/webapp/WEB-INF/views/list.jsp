<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	관리자 페이지 - 회원목록<br><br>
	<c:forEach items="${list}" var="vo">
${vo.id}
${vo.pw}
${vo.name}
${vo.tel}
<br>
</c:forEach>
</body>
</html>