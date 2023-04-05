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
	$('#b1').click(
			function() {
				$.ajax({
					url : "json.jsp",
					success : function(json) {
						age1 = json.age
						name1 = json.name
						id1 = json.id
						$('#result').append(
								age1 + " " + name1 + " " + id1 + "<br>")
					}
				})
			})
	$('#b2').click(
			function() {
				$.ajax({
					url : "json2.jsp",
					success : function(json) {
						age1 = json[1].age
						name1 = json[1].name
						id1 = json[1].id
						$('#result').append(
								age1 + " " + name1 + " " + id1 + "<br>")
					}
				})
			})
	$('#b3').click(
			function() {
				$.ajax({
					url : "json3.jsp",
					success : function(json) {
						today = json.today
						temp = json.temp
						hu = json.hu
						$('#result').append(
								today + " " + temp + " " + hu + "<br>")
						if (today == 'rain') {
							$('#result').append(
									"<img src=resources/img/rain.png><br>")
						} else if (today == 'sun') {
							$('#result').append(
									"<img src=resources/img/sun.png><br>")
						}
					}
				})
			})
	$('#b4').click(
			function() {
				$.ajax({
					url : "json4.jsp",
					success : function(json) {
						high1 = json[0].high
						low1 = json[0].low
						end1 = json[0].end

						high2 = json[1].high
						low2 = json[1].low
						end2 = json[1].end
						$('#result').append(
								"어제 주가: " + high1 + " " + low1 + " " + end1
										+ "<br>")
						$('#result').append(
								"오늘 주가: " + high2 + " " + low2 + " " + end2
										+ "<br>")
					}
				})
			})
})
</script>
</head>
<body>
	<button id="b1">컨트롤러에서 json 받아오기</button>
	<button id="b2">컨트롤러에서 jsonArray 받아오기</button>
	<button id="b3">json 받아오기</button>
	<button id="b4">jsonArray 받아오기</button>
	<hr>
	<div id="result"></div>
</body>
</html>