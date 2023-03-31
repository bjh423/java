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
	background: white;
	color: black;
}
</style>
</head>
<body>
	회원검색 요청이 완료되었습니다
	<table border="1">
		<tr>
			<td class="qw">Id</td>
			<td class="qw">Name</td>
			<td class="qw">Url</td>
			<td class="qw">Image</td>
		</tr>
		<c:forEach items="${bag}" var="bag">
			<tr>
				<td class="er">${bag.id}</td>
				<td class="er">${bag.name}</td>
				<td class="er"><a href="${bag.url}"></a></td>
				<td class="er"><img alt="img/${bag.url}" src="${bag.img}" width=100px height="100px"></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>