<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.min.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=e387f72b408cbc94e6dc6900a187f5bc"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	
</script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(
				function() {
					$.ajax({
						url : "jsonResponse3",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(
									"<table border=1><tr><td>id</td><td>pw</td><td>name</td><td>tel</td></tr>"
											+ "<tr><td>" + id + "</td><td>"
											+ pw + "</td><td>" + name
											+ "</td><td>" + tel
											+ "</td></tr></table>")
						}
					})
				})
		$('#b2').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "jsonResponse4",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(
									"<ul><li>" + id + "</li><li>" + pw
											+ "</li><li>" + name + "</li><li>"
											+ tel + "</li></ul>")
						}
					})
				})
		$('#b3').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "jsonResponse4",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(
									"<table border=1><tr><td>id</td><td>pw</td><td>name</td><td>tel</td></tr>"
											+ "<tr><td>" + id + "</td><td>"
											+ pw + "</td><td>" + name
											+ "</td><td>" + tel
											+ "</td></tr></table>")
						}
					})
				})

		//
		$('#b4')
				.click(
						function() {
							$('#result').empty()
							$
									.ajax({
										url : "jsonResponse5",
										dataType : "json",
										success : function(json) {
											name = json.id
											loc = json.pw
											lon = json.name
											var mapContainer = document
													.getElementById('result'), // 지도를 표시할 div 
											mapOption = {
												center : new kakao.maps.LatLng(
														loc, lon), // 지도의 중심좌표
												level : 3
											// 지도의 확대 레벨
											};

											var map = new kakao.maps.Map(
													mapContainer, mapOption);

											// 마커가 표시될 위치입니다 
											var markerPosition = new kakao.maps.LatLng(
													loc, lon);

											// 마커를 생성합니다
											var marker = new kakao.maps.Marker(
													{
														position : markerPosition
													});

											// 마커가 지도 위에 표시되도록 설정합니다
											marker.setMap(map);

											var iwContent = '<div id="qwe" style="padding:5px; text-align: center;"><a>'
													+ name + '</a></div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
											iwPosition = new kakao.maps.LatLng(
													loc, lon); //인포윈도우 표시 위치입니다

											// 인포윈도우를 생성합니다
											var infowindow = new kakao.maps.InfoWindow(
													{
														position : iwPosition,
														content : iwContent
													});

											// 마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다
											infowindow.open(map, marker);
										}
									})
						})
		$('#b5')
				.click(
						function() {
							$
									.ajax({
										url : "jsonResponse6",
										dataType : "json",
										success : function(json) {
											q1 = json.q1
											q2 = json.q2
											q3 = json.q3
											q4 = json.q4
											google.charts.load("current", {
												packages : [ "corechart" ]
											});
											google.charts
													.setOnLoadCallback(drawChart);
											function drawChart() {
												var data = google.visualization
														.arrayToDataTable([
																[ '항목', '비율' ],
																[ '1번항목', q1 ],
																[ '2번항목', q2 ],
																[ '3번항목', q3 ],
																[ '4번항목', q4 ] ]);

												var options = {
													title : '도넛차트',
													pieHole : 0,
												};

												var chart = new google.visualization.PieChart(
														document
																.getElementById('result'));
												chart.draw(data, options);
											}
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
	<button id="b1">MemberVO json 테이블</button>
	<button id="b2">empty()하고 MemberVO json 리스트</button>
	<button id="b3">empty()하고 MemberVO json 테이블</button>
	<br>
	<button id="b4">카카오맵에 json데이터 넣어서 지도표시</button>
	<br>
	<button id="b5">구글차트에 json데이터 넣어서 차트표시</button>
	<div id="result" style="width: 1000px; height: 1000px;"></div>
</body>
</html>