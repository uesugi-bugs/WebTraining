<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<%
Person person= (Person) session.getAttribute("person");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" href="/joytas6/css/main.css">
</head>
<body>
<h1>お問い合わせフォーム</h1>
<p class="normalP">以下の内容でよろしいですか？</p>
<table>
<tr><th>お名前</th><td><input type="text" name="name" value="<%=person.getName() %>"></td></tr>
<tr><th>メールアドレス</th><td><input type="text" name="email" value="<%=person.getEmail() %>"></td></tr>
<tr><th>お問い合わせ内容</th><td><textarea name="memo"><%=person.getMemo() %></textarea></td></tr>
</table>
<div id="btBox">
<a href="/joytas6/contact?mode=back" class="button2">戻る</a>
<a href="/joytas6/contact?mode=send" class="button2">送信</a>
</div>

</body>
</html>