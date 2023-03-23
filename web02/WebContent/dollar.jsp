<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String dollar = request.getParameter("dollar");
double dollar2 = Double.parseDouble(dollar);
double won = 0.00078;
double result = dollar2 / won;
%>
<%=result%>