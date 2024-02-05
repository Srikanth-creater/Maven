<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${label }" var="b" >
		${b } <br>
	</c:forEach>
	
	<c:set var="str" value="Srikanth is son of Sriramulu and Savithri"> </c:set>
	Length ${fn:length(str)}<br>
	<c:forEach items="${fn:split(str,' ') }" var="s">
		${s }<br>	
	</c:forEach>
	index: ${fn:indexOf(str,"a") }
	contains:${fn:contains(str,"Sri") }<br>
	<c:if test="${fn:contains(str,'and')}">
		and is there	
	</c:if>
	
</body>
</html>