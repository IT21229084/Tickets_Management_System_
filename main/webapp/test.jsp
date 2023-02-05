
<%@page import="java.util.ArrayList"%>
<%@page import="myproject.Staffmember"%>
<%@page import="java.util.List"%>
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
	List<Staffmember> list = (ArrayList<Staffmember>)request.getAttribute("list");
	%>









 <%
 
 for(int i=0;i<list.size();i++){
	 Staffmember d = list.get(i);
 
 
 
	 String id = d.getSid();
     String firstname = d.getFirstName();
     String lastname = d.getLastName();
     String nic = d.getNIC();
     String email = d.getEmail();
     String dob = d.getDOB();
     String gender = d.getGender();
     String uname = d.getUserName();
     String psw = d.getPassword();
     String rid = d.getRId();
   
	
	
	%>
	
	
	

	 <%=id %>
	 <%=firstname %>
	<%= dob %>
	<%= email %>
	<%= lastname %>
	<%= gender %> 
	<%=id%>
	<%= uname %>
	<%=nic%> 
	<%= psw %> 
	<%= rid %>
	
	
	
	
	
	
	  
	<% }%>
	
	
	
	
	
	
	

 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>