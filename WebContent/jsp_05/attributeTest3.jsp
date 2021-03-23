<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>영역과 속성 테스트</h2>
	<table border="1">
		<tr>
			<td colspan="2">Application 영역에 저장된 내용들</td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=application.getAttribute("name")%></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=application.getAttribute("id")%></td>
		</tr>
	</table>
	<br>
	<table border="1">
		<tr>
			<td colspan="2">Session 영역에 저장된 내용들</td>
		</tr>
<%
		Enumeration<String> e = session.getAttributeNames();
		while(e.hasMoreElements()){
			String attriName = e.nextElement();
			String attrValue = (String)session.getAttribute(attriName);
		
%>
		<tr>
			<td><%=attriName %></td>
			<td><%=attrValue %></td>
		</tr>
<%
		}
%>
	</table>
</body>
</html>