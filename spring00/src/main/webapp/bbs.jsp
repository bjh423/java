<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시글 작성 화면</h3>
<hr>
<form action="insert2.multi" method="get">
no : <input name="no" value="123"><br>
title : <input name="title" value=qwe><br>
content : <input name="content" value="qwert"><br>
writer : <input name="writer" value="park"><br>
<button type="submit">버튼</button>
</form>

<h3>게시글 수정 화면</h3>
<hr>
<form action="update2.multi" method="get">
no : <input name="no" value="123"><br>
writer : <input name="content" value="change content"><br>
<button type="submit">버튼</button>
</form>

<h3>게시글 삭제 화면</h3>
<hr>
<form action="delete2.multi" method="get">
no : <input name="no" value="123"><br>
<button type="submit">버튼</button>
</form>

<h3>게시글 검색 화면</h3>
<hr>
<form action="one2.multi" method="get">
no : <input name="no" value="123"><br>
<button type="submit">버튼</button>
</form>

<h3>게시글전체 검색 화면</h3>
<hr>
<form action="list2.multi" method="get">
<button type="submit">버튼</button>
</form>

</body>
</html>