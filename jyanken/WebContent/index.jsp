<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"
%>
<%
Map<Integer,String> hands = new HashMap<>();
hands.put(0,"images/gu.png");
hands.put(1,"images/choki.png");
hands.put(2,"images/pa.png");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
<title>じゃんけんぽん</title>
</head>
<body>
	<form>
  	 <label><input type="radio" name="hand" value="0">ぐー</label><br>
  	  <label><input type="radio" name="hand" value="1">ちょき</label><br>
  	  <label><input type="radio" name="hand" value="2">ぱー</label><br>
  	  <button type="submit" name="btn" value="1">ショウブ</button>
	</form>
	<div>
		<%if(request.getParameter("hand") != null){ %>
			<% int hand = Integer.parseInt(request.getParameter("hand")); %>
			<img src=<%=hands.get(hand) %>>
			<% int rand = new Random().nextInt(3);%>
			<img src=<%=hands.get(rand) %>>
	</div>
			<%if(hand == rand){ %>
				<p>あいこです!</p>
			<%}else if(hand == 0 && rand == 1 || hand == 1 && rand == 2 || hand == 2 && rand == 0){ %>
				<p>アナタの勝ちです!</p>
			<%}else{ %>
				<p>アナタの負けです...</p>
		<%} %>
<%} %>
</body>
</html>