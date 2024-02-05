<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"  %>
<%@ include file ="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
</head>
<body bgcolor="blue">
			<%! int s=3; %>
	<%
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int l=i+j;
		out.println("Addition: "+l);
		pageContext.setAttribute("user", "Srikanth",PageContext.SESSION_SCOPE);
	%>
	
	Expression output<%= s %>
	<a href="header.jsp">Header</a>
	
</body>
</html>