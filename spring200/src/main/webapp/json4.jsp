<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
JSONObject yes = new JSONObject();
yes.put("high", 20);
yes.put("low", 0);
yes.put("end", 10);

JSONObject tod = new JSONObject();
tod.put("high", 30);
tod.put("low", 10);
tod.put("end", 20);

JSONArray array = new JSONArray();
array.add(yes);
array.add(tod);

%><%=array.toJSONString()%>