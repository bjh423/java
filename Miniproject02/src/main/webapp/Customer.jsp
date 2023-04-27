<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body>
<h3>회원 정보 관리 페이지입니다. </h3>
<hr>
<% if(session.getAttribute("id") == null){ %>
<h3>로그인 화면</h3>
<% if(session.getAttribute("pwcheck") != null){if(session.getAttribute("pwcheck").equals("0")){%> 존재하지 않는 아이디거나, 비밀번호가 다릅니다 <% }}%>
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr>
<%}else{ %><button onclick="location.href='logout'">로그아웃</button><% } %>

<h3>회원가입 화면입니다. </h3>
<hr>
<form action="insert" method="get">
	id : <input name="id" value="samsung"> <button disabled="disabled">중복검사(현재 동작x)</button> <br>
	pw : <input name="pw" value="1234"><br>
	name : <input name="name" value="junho"><br>
	nickname : <input name="nick" value="bang"> <button disabled="disabled">중복검사(현재 동작x)</button> <br>
	tel : <input name="tel" value="011"><br>
	address : <input name="address" value="10101010">(우편번호 검색 api)<br>
	birth : <input name="birth" value="9704231"> (생년월일 + 뒷부분 첫번째까지) <br>
	
	<button type="submit">서버로 전송</button>
</form>
<hr>

<h3>회원 검색</h3>
<hr>
<form action="one" method="get">
	id : <input name="id"><br>
	<button type="submit">검색</button>
</form>
<hr>

<h3>회원 정보 수정</h3>
<hr>
<form action="update" method="get">
	id : <input name="id" value="id"><button disabled="disabled">중복검사(현재 동작x)</button> <br>
	pw : <input name="pw" value="1234"><br>
	pw check : <input name="pw1" value="1234"><br>
	name : <input name="name" value="junho"><br>
	nickname : <input name="nick" value="bang"> <button disabled="disabled">중복검사(현재 동작x)</button> <br>
	tel : <input name="tel" value="011"><br>
	address : <input name="address" value="10101010">(우편번호 검색 api)<br>
	<button type="submit">수정</button>
</form>
<hr>

<h3>회원탈퇴 화면입니다. </h3>
<hr>
<form action="delete" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">탈퇴</button>
</form>
<hr>


<a href="list">모든 회원정보 검색</a>
<a href="list"><button type="button">list</button></a>

</body>
</html>