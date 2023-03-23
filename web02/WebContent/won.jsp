<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String won = request.getParameter("won");
double won2 = Double.parseDouble(won);
double dollar = 1283.94;
double result = won2 / dollar;
double result2 = Math.round(result*100)/(double)100;
%>
<%=result2%>