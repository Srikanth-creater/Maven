<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	
	<%
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome ${username}<br>
	<a href="video.jsp">Video Page</a>
	<form action="Logout">
		<button>Logout</button>
	</form>
</body>
</html>