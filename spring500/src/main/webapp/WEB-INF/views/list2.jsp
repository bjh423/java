<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: cyan;
}

td {
	width: 70px;
	align-content: center;
}

.qw {
	background-color: gray;
	color: white;
}

.er {
	background: blue;
	color: white;
}
</style>
</head>
<body>
	회원검색 요청이 완료되었습니다
	<table border="1">
		<tr>
			<td class="qw">Id</td>
			<td class="qw">Pw</td>
			<td class="qw">Content</td>
			<td class="qw">Writer</td>
		</tr>
		<c:forEach items="${list}" var="bag">
			<tr>
				<td class="er">${bag.no}</td>
				<td class="er"><a href="one2.multi?no=${bag.no}">${bag.title}</a></td>
				<td class="er">${bag.content}</td>
				<td class="er">${bag.writer}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>