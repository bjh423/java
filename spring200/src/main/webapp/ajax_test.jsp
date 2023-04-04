<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.min.js"></script>
<!-- <script type="text/javascript" src="js/cors.js"></script> -->
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "list2",
			success : function(x) {
				$('#result').append(x)

			}
		})
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "bbsupdate",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function(x) {
					$('#result').append(x)
				}
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url : "bbsdelete",
				data : {
					no : $('#no2').val(),
				},
				success : function() {
					document.location.reload()
				}
			})
		})
		$('#b3').click(function() {
			$.ajax({
				//37.645025 127.081866
				crossOrigin:true,
				url : "https://api.openweathermap.org/data/2.5/weather?q=seoul&units=metric&lang=kr&appid=b02860389edb2782121289cb2552bb73",
				dataType : 'json',
				success : function(x) {
					console.log(x);
					$('#result').html(
					"기준 도시 : " + x.name + "<br>"+
					"기준 위치 : 경도 " + x.coord.lon + " 위도 " + x.coord.lat + "<br>" +
					"날씨 : " + x.weather[0].description + "<br>" +
					"풍속 : " + x.wind.speed + "<br>"
					)
				}
			})
		})
	})
</script>
<style>
td {
	text-align: center;
}
</style>
</head>
<body>
	<table>
		<tr>
			<td>수정할 no :</td>
			<td><input id="no"></td>
		</tr>
		<tr>
			<td>content :</td>
			<td><input id="content"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="b1">bbs수정</button>
			</td>
		</tr>
		<tr>
			<td>삭제할 no :</td>
			<td><input id="no2"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="b2">bbs삭제</button>
			</td>
		</tr>
		<tr>
			<td colspan="2"><br>
				<button id="b3">날씨정보</button></td>
		</tr>
	</table>
	<br>
	<div id="result"></div>
</body>
</html>