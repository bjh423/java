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
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(
									id + " " + pw + " " + name + " " + tel
											+ "<br>")
						}
					})
				})
		$('#b11').click(
				function() {
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							table = "<table><tr><td>항목명</td></tr>"
									+ "<tr><td>아이디</td><td>" + id
									+ "</td></tr>" + "<tr><td>패스워드</td><td>"
									+ pw + "<td></tr>" + "<tr><td>이름</td><td>"
									+ name + "<td></tr>"
									+ "<tr><td>전화번호</td><td>" + tel
									+ "<td></tr>"
							$('#result').append(table)
						}
					})
				})
		$('#b111')
				.click(
						function() {
							$
									.ajax({
										url : "json1",
										dataType : "json",
										success : function(json) {
											id = json.id
											pw = json.pw
											name = json.name
											tel = json.tel
											table = "<table><tr><td colspan=2  style='text-align: center'>항목명</td></tr>"
													+ "<tr><td>아이디</td><td>"
													+ id
													+ "</td></tr>"
													+ "<tr><td>패스워드</td><td>"
													+ pw
													+ "<td></tr>"
													+ "<tr><td>이름</td><td>"
													+ name
													+ "<td></tr>"
													+ "<tr><td>전화번호</td><td>"
													+ tel + "<td></tr>"
											$('#result').append(table)
										}
									})
						})
		$('#b2').click(
				function() {
					$.ajax({
						url : "json2",
						dataType : "json",
						success : function(json) {
							id1 = json[1].id
							name1 = json[1].name
							$('#result').append(
									"json배열 중 2번째 것>> " + name1 + " " + id1
											+ "<br>")

						}
					})
				})
		$('#b3').click(
				function() {
					$.ajax({
						url : "json3",
						dataType : "json",
						success : function(json) {
							no = json.no
							ti = json.title
							co = json.content
							wr = json.writer
							$('#result').append(
									"no : " + no + " / title : " + ti
											+ " / content : " + co + " / writer : "
											+ wr + "<br>")

						}
					})
				})
		$('#b4').click(
				function() {
					$.ajax({
						url : "json4",
						dataType : "json",
						success : function(json) {
							no = json[0].no
							ti = json[0].title
							co = json[0].content
							wr = json[0].writer
							no1 = json[1].no
							ti1 = json[1].title
							co1 = json[1].content
							wr1 = json[1].writer
							$('#result').append(
									no + ", " + ti + ", " + co + ", " + wr
											+ "<br>" + no1 + ", " + ti1 + ", "
											+ co1 + ", " + wr1 + "<br>")
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
	<button id="b1">json 받아오기</button>
	<button id="b11">json 받아오기</button>
	<button id="b111">json 받아오기</button>
	<button id="b2">jsonArray 받아오기</button>
	<button id="b3">json 받아오기</button>
	<button id="b4">jsonArray 받아오기</button>
	<hr>
	<div id="result"></div>
</body>
</html>