<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String memberId = (String)session.getAttribute("MEMBERID");
	boolean login = memberId == null ? false : true;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인여부 검사</title>
</head>
<body>
<%	if (login) {  %>
		아이디 "<%= memberId %>"로 로그인 한 상태
		<input type="button" onclick="location.href='Logout.jsp'" value="로그아웃">
<%  } else { %>
		로그인하지 않은 상태
		<a href="loginForm.jsp">로그인</a>
<%  }  %>
	
</body>
</html>