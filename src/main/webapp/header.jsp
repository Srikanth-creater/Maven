<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//Object s=pageContext.getAttribute("user",PageContext.SESSION_SCOPE);
		//String r=s.toString();
		///out.print(s);
		////////////////////////////////////////////////////////////exception example////////////////
		int k=1/0;
		
	%>
	<%=7+5%>
</body>
</html>