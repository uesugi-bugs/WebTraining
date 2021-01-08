<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Hero"%>
<%
Hero hero = (Hero) request.getAttribute("hero");
String name = hero.getName();
String job = hero.getJob();
String tribe = hero.getTribe();
int[] vals = hero.getVals();
String[] palam = hero.getPalam();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<body>
<h2><%=name %>の種族が<%=tribe %>に決定しました!</h2>
<p><%=tribe %>のボーナスが適用されました!</p>
[<% for(int i=0;i<palam.length;i++){ %>
	<%= palam[i] %>:
	<%= vals[i] %>
<%} %><br>
<a href="/SelfIntroduction/Create">もう一度、作り直す？</a>
</body>
</html>