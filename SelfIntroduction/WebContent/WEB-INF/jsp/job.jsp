<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Hero"%>
<%
Hero hero = (Hero) request.getAttribute("Hero");
String name = hero.getName();
int[] vals = hero.getVals();
String[] palam = hero.getPalam();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>職業設定</title>
</head>
<body>
<h2>この世に<%=name %>が誕生しました。</h2>
<p>初期ステータスが決定しました。</p>
[<% for(int i=0;i<palam.length;i++){ %>
	<%= palam[i] %>:
	<%= vals[i] %>
<%} %>]
<p>職業を選択してください</p>
<form action="/SelfIntroduction/JobCheck" method="post">
<label><input type="radio" name="job" value="戦士">戦士</label><br>
<label><input type="radio" name="job" value="盗賊">盗賊</label><br>
<label><input type="radio" name="job" value="僧侶">僧侶</label><br>
<label><input type="radio" name="job" value="魔術師">魔術師</label><br>

<input type="hidden" name="name" value="<%=name %>">
<input type="hidden" name="hp" value="<%=vals[0] %>">
<input type="hidden" name="mp" value="<%=vals[1] %>">
<input type="hidden" name="power" value="<%=vals[2] %>">
<input type="hidden" name="tech" value="<%=vals[3] %>">
<input type="hidden" name="speed" value="<%=vals[4] %>">
<input type="submit" value="選択">

</form>
</body>
</html>