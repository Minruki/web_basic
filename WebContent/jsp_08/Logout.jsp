<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.invalidate();
%>
<html>
<head><title>로그아웃</title></head>
<body>
	로그아웃하였습니다.<br>
	<a href="sessionLoginCheck.jsp">로그인 체크</a>
	<a href="loginForm.jsp">로그인</a>
</body>
</html>
