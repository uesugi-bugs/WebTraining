<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String sunny = (String)request.getAttribute("wether");
String fortune = (String)request.getAttribute("ft");
int comfortIndex = (Integer)request.getAttribute("ci");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>フォワードのサンプル</h1>
<p><%=sunny %></p>
<p><%=fortune %></p>
<p><%=comfortIndex %></p>
</body>
</html>