<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //MVC방법론 버전1 -> MVC1
    //넘어오는 값 받기
    //controller(자바)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    //dao에 데이터 줘서 insert 요청
    //DAO
    //Model(자바)
    
    //결과에 html화해서 클라이언트에 전송
    //View(html)
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입 id: <%=id%><br>
가입 pw: <%=pw%><br>
가입 name: <%=name%><br>
가입 tel: <%=tel%><br>
</body>
</html>