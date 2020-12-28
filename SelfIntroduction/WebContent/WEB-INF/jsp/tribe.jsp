<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Hero"%>
<%
Hero hero = (Hero) request.getAttribute("hero");
String name = hero.getName();
String job = hero.getJob();
int[] vals = hero.getVals();
String[] palam = hero.getPalam();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>種族選択</title>
</head>
<body>
<h2><%=name %>の職業が<%=job %>に決定しました</h2>
<p><%=job %>のボーナスが適用されました!</p>
[<% for(int i=0;i<palam.length;i++){ %>
	<%= palam[i] %>:
	<%= vals[i] %>
<%} %>]
<p>種族を選択してください</p>
<form action="/SelfIntroduction/TribeCheck" method="post">
<label><input type="radio" name="tribe" value="人間">人間</label><br>
<label><input type="radio" name="tribe" value="ハイエルフ">ハイエルフ</label><br>
<label><input type="radio" name="tribe" value="トロル">トロル</label><br>
<label><input type="radio" name="tribe" value="ノーム">ノーム</label><br>
<input type="submit" value="選択">

<input type="hidden" name="name" value="<%=name %>">
<input type="hidden" name="job" value="<%=job %>">
<input type="hidden" name="hp" value="<%=vals[0] %>">
<input type="hidden" name="mp" value="<%=vals[1] %>">
<input type="hidden" name="power" value="<%=vals[2] %>">
<input type="hidden" name="tech" value="<%=vals[3] %>">
<input type="hidden" name="speed" value="<%=vals[4] %>">
</form>

</body>
</html>