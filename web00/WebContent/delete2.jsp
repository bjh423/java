<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--client(브라우저)가 보낸 데이터를 받아야 함 == 자바 -->
    <!--브라우저가 보낸 데이터를 받을 때 사용하는 부품 -->
    <%
    //코드 넣는 부분
    //HttpServletRequest request = new HttpServletRequest();
   	//tomcat은 미리 request를 만들어서 내장시켜놓음
   	String no = request.getParameter("no");
    %>
    <!-- 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가있음  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background: lime;}
</style>
</head>
<body>
회원탈퇴 요청됨
<hr color="red">
탈퇴할 id : <%=no %><br>
</body>
</html>