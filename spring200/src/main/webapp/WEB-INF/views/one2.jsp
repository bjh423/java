<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
	<a href="bbs.jsp">처음페이지로</a>
	<a href="list2">게시물 전체 목록페이지</a>
	<hr color="red">

	게시물검색 처리 요청이 완료되었습니다.
	<br> ${bag.no}, ${bag.title}, ${bag.content}, ${bag.writer}
	<br>
	<hr>
	댓글달기 <input id="reply"> <button id="b1">댓글달기</button><br>
	<hr>
	<c:forEach items="${list}" var="var">
	- ${var.no},${var.bbsno},${var.writer} : ${var.content} <br>
	</c:forEach>
</body>
</html>