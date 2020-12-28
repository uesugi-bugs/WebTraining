<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcom New World</title>
</head>
<body>
<h1>あなたの名前を教えてください</h1>
<form action="/SelfIntroduction/Create" method="post">
名前:<input type="text" name="name"><br>
<input type="submit" value="作成">
</form>
</body>
</html>