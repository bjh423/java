<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "movie",
				data : {
					title : $("#title").val(),
					cost : $("#cost").val()
				},
				success : function(x) {
					alert("성공")
					$("#result").append(x + "<br>")
				},
				error : function() {
					alert("실패")
				}
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url : "fruit",
				success : function(x) {
					alert("fruit 성공")
					$("#result").append(x + "<br>")
				},
				error : function() {
					alert("실패")
				}
			})
		})
		$('#b3').click(function() {
			$.ajax({
				url : "tour",
				success : function(x) {
					alert("tour 성공")
					$("#result").append(x + "<br>")
				},
				error : function() {
					alert("실패")
				}
			})
		})
	})
</script>
</head>
<body>
	영화제목 :
	<input id="title">
	<br> 영화관람료 :
	<input id="cost">
	<br>
	<input id="b1" type="button" value="영화 관람 확인"><br>
	<input id="b2" type="button" value="과일 목록"><br>
	<input id="b3" type="button" value="여행 목록"><br>
	<div id="result"></div>
</body>
</html>