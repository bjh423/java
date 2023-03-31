<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	text-align: center;
}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Title</td>
			<td>Cartoonist</td>
			<td>Star</td>
			<td>Img</td>
		</tr>
		<c:forEach items="${bag}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.title}</td>
				<td>${item.cartoonist}</td>
				<td>${item.star}</td>
				<td><img src="resources/img/${item.img}"></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>