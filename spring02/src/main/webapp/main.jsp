<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	
</script>
<body>
	<%
		if (session.getAttribute("id") == null) {
	%>

	<form action="login" method="get">
		id : <input name="id" value="qwe"><br> pw : <input
			name="pw" value="qwe"><br>
		<button type=submit>로그인</button>
	</form>

	<%
		} else {
	%>
	<%=session.getAttribute("id")%>님 반갑습니다<br>
	<form action="logout">
		<button type="submit">로그아웃</button>
	</form>
	<%
		}
	%>
	<br>
	<a href="news.jsp"><button>뉴스</button></a>
	<a href="cafe.jsp"><button>카페</button></a>


</body>
</html>