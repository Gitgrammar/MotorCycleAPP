<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Motorcycle" %>
<% Motorcycle motorcycle=(Motorcycle)request.getAttribute("motorcycle"); %>
<% String input =request.getParameter("type");
String path="";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>適性バイク診断</title>
</head>
<body>
<h3>適性バイク診断の結果</h3>
<h3>あなたに最適なバイクは</h3>

<h1><%= motorcycle.getResulted() %></h1>
<img src="images/<%=motorcycle.getResulted() %>.jpeg"><br>
<a href="/motorcycleapp/mcyclecheck">戻る</a>


</body>
</html>