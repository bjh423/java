<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${bag.id}<br> <!-- expression language = EL -->
<a href="${bag.name}">${bag.name}</a><br>
${bag.url}<br>
<img src="resources/img/${bag.img}" width=200px height=200px><br>
</body>
</html>