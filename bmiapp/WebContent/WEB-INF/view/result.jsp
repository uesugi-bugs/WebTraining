<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<body>
<h1>結果発表</h1>
<p>
身長:${health.height}<br>
体重:${health.weight}<br>
BMI:${health.bmi}<br>
体型:${health.bodyType}<br>
</p>
<a href="/bmiapp/Main">戻る</a>
</body>
</html>