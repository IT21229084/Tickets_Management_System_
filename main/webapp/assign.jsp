<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <%
	 String id = request.getParameter("id");
     String id1 = request.getParameter("id1");
     
	%>
	
	<h1><%=id %></h1>
	<h1><%=id1 %></h1>

</body>
</html>