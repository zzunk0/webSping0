<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href = "/webapp/aLink?num=100&name=김길동">a태그 링크 걸기</a>
<a href = "/webapp/view1">a태그 링크 걸기</a>
<p>
	폼데이터 전송<br>
	<form method="post" action="/webapp/formData">
		이름 : <input type="text" name="name"/><br/>
		번호 : <input type="text" name="num"/><br/>
		연락처 : <input type="text" name="tel"/><br/>
		<input type="submit" value="전송"/>
	</form>
</p>
<img src="/webapp/resources/car1.jpg">
<img src="/webapp/imgList/car3.jpg">
</body>
</html>
