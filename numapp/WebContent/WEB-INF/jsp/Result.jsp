<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Bean" %>
<%
Bean bean = (Bean) request.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<body>
<p>
元の文字列:<%=bean.getNum() %><br>
要素数:<%=bean.getEre() %><br>
最大値:<%=bean.getMax() %><br>
最小値:<%=bean.getMin() %><br>
合計:<%=bean.getSum() %><br>
</p>
<a href="/numapp/Main">戻る</a>
</body>
</html>