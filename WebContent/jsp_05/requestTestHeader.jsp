<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 정보 예제</title>
<style type="text/css">
h1 {
	text-align: center;
}

table {
	margin: auto;
	width: 400px;
	border: 1px solid red;
}

table>th {
	width: 300px;
}
</style>
</head>
<body>
	<h1>헤더 정보 예제</h1>
	<table border="1">
		<tr>
			<td>헤더 이름</td>
			<td>헤더 값</td>
		</tr>
		<%
			Enumeration<String> e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String headerName = e.nextElement();
		%>

		<tr>
			<td><%=headerName%></td>
			<td><%=request.getHeader(headerName)%></td>
		</tr>
		<%
			}
		%>
	</table>

	<hr>

	<h1>쿠키, URL/URI, 요청 방식에 관련된 정보 예제</h1>

	<table border='1'>
		<%
			Cookie[] cookie = request.getCookies();
		%>
		<tr>
			<th>쿠키정보</th>

			<%
				if (cookie == null) {
			%>
			<th>쿠키가 존재하지 않습니다.</th>
			<%
				} else {
			for (int i = 0; i < cookie.length; i++) {
			%>
			<td><%=cookie[i].getName()%>(<%=cookie[i].getValue()%>)&nbsp;&nbsp;</td>
			<%
				}
			}
			%>
		</tr>
		<tr>
			<td>서버 도메인명</td>
			<td><%=request.getServerName()%></td>
		<tr>
			<td>서버 포트번호</td>
			<td><%=request.getServerPort()%></td>
		<tr>
			<td>요청 URL</td>
			<td><%=request.getRequestURL()%></td>
		<tr>
			<td>요청 URI</td>
			<td><%=request.getRequestURI()%></td>
		<tr>
			<td>요청 쿼리</td>
			<td><%=request.getQueryString()%></td>
		<tr>
			<td>클라이언트 호스트명</td>
			<td><%=request.getRemoteHost()%>
		<tr>
			<td>클라이언트 IP주소</td>
			<td><%=request.getRemoteAddr()%></td>
		<tr>
			<td>프로토콜</td>
			<td><%=request.getProtocol()%></td>
		<tr>
			<td>요청방식</td>
			<td><%=request.getMethod()%></td>
		<tr>
			<td>컨텍스트 경로</td>
			<td><%=request.getContextPath()%></td>
			</tr>
	</table>

</body>
</html>