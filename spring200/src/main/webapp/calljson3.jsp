<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "one22",
				data : {
					no : 1
				},
				dataType : "json",
				success : function(json) {
					no = json.no
					content = json.content
					$('#result').append(no + " / " + content + " " + "<br>")
				}
			})
		})
		$('#b11').click(function() {
			$.ajax({
				url : "list55",
				dataType : "json",
				success : function(json) {
					no1 = json[1].no
					content1 = json[1].content
					$('#result').append(no + " / " + content + " " + "<br>")
				}
			})
		})
	})
</script>
<style type="text/css">
td {
	text-align: center
}
</style>
</head>
<body>
	<button id="b1">bbs json 텍스트로 받아오기</button>
	<button id="b11">bbs json 테이블로 받아오기</button>
	<button id="b111">bbs jsonArray 받아오기</button>
	<button id="b2">jsonArray 받아오기</button>
	<button id="b3">json 받아오기</button>
	<button id="b4">jsonArray 받아오기</button>
	<hr>
	<div id="result"></div>
</body>
</html>