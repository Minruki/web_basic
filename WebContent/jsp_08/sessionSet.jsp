<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
	session.setAttribute("name","Session Test!"); 
	session.setAttribute("id", "Session ID");
%>
<script>
location.href="sessionTest.jsp";
</script>
