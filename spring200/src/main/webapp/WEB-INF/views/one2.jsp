<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			content=$('#reply').val()
			writer="apple" //세션 잡았을경우 $(id)
			$.ajax({
				url : "insert4",
				data : {
					bbsno:${bag.no},
					content:content,
					writer:writer
				},
				success : function() {
					alert("성공")
					$('#result').append("- " + content + " : " + writer + "<br>")
					$('#reply').val('')
				}

			})
		})
	})
</script>
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
	댓글달기
	<input id="reply">
	<button id="b1">댓글달기</button>
	<br>
	<hr>
	<div id="result">
		<c:forEach items="${list}" var="var">
	- ${var.writer} : ${var.content} <br>
		</c:forEach>
	</div>
</body>
</html>