<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//스크립트릿
JSONObject json = new JSONObject();
json.put("name", "hong");
json.put("age", 100);
json.put("id", "apple");

JSONObject json2 = new JSONObject();
json2.put("name", "hong");
json2.put("age", 100);
json2.put("id", "apple");

JSONObject json3 = new JSONObject();
json3.put("name", "hong");
json3.put("age", 100);
json3.put("id", "apple");

JSONArray array = new JSONArray();
array.add(json);
array.add(json2);
array.add(json3);

%><%=array.toJSONString()%>