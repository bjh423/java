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
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 30
				},
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list7",
				data : {
					memid : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list8",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b6').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list9",
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
	})
</script>
</head>
<body>
	<button id="b1">bbs리스트 가져오기</button>
	<button id="b2">bbs번호 1번 reply리스트 가져오기</button>
	<button id="b3">bbs번호 30번 reply리스트 가지고 오기</button>
	<button id="b4">member id가 apple인사람의 정보 가지고 오기</button>
	<button id="b5">bbsno가 1인 게시물의 상세정보</button>
	<button id="b6">member의 모든 리스트</button>
	<hr>
	<div id="result" style="background-color: cyan"></div>
</body>
</html>