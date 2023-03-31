<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td{
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
		<tr>
			<td>${bag.id}</td>
			<td>${bag.title}</td>
			<td>${bag.cartoonist}</td>
			<td>${bag.star}</td>
			<td><img alt="resources/img/${bag.img}" src="resources/img/${bag.img}"></td>
		</tr>
	</table>
</body>
</html>