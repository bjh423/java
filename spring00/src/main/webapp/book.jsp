<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


insert
<form action="insert3.multi" method="get">
북마크명 : <input name="name" value="lee"><br>
URL: : <input name="url" value="http://www.naver.com"><br>
이미지 : <input name="img" value="yes.png"><br>
<button type="submit">버튼</button>
</form>
<br>

하나
<form action="one3.multi" method="get">
ID : <input name="id" value="1"><br>
<button type="submit">버튼</button>
</form>
<br>

전체
<form action="list3.multi" method="get">
<button type="submit">버튼</button>
</form>

</body>
</html>