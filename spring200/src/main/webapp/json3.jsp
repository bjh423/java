<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
JSONObject json = new JSONObject();
json.put("today", "rain");
json.put("hu", 0);
json.put("tem", "15");
%>
<%=json.toJSONString()%>