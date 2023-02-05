<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 
    <!----======== CSS ======== -->
   <link rel="stylesheet" href="addcss.css">
     
    <!----===== Iconscout CSS ===== -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
     
    <!----===== Iconscout CSS ===== -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


     <%
	 String id = request.getParameter("id");
     String firstname = request.getParameter("firstname");
     String lastname = request.getParameter("lastname"); 
     String nic = request.getParameter("nic");
     String email = request.getParameter("email");
     String dob = request.getParameter("dob");
     String gender = request.getParameter("gender");
     String uname = request.getParameter("uname");
     String psw = request.getParameter("psw");
     String rid = request.getParameter("rid"); 
	%>
	
	<div class="container">
        <header>Add New staffmember</header>

        <form action="deleteservlet" method = "post">
            <div class="form first">
                <div class="details personal">
                   

                    
                    <div class="fields">
                         <div class="input-field">
                            <label>Identity Number</label>
                            <input type="text" name = "id1" value =  <%=id %> readonly >
                        </div>
                        <div class="input-field">
                            <label>FirstName</label>
                            <input type="text" name = "name1" value =  <%=firstname %> readonly >
                        </div>
                       
                        <div class="input-field">
                            <label>Date of Birth</label>
                            <input type="text" name = "dob" value = <%= dob %> readonly>
                        </div>

                        <div class="input-field">
                            <label>Email</label>
                            <input type="text"  name = "email" value = <%= email %> readonly>
                        </div>

                        <div class="input-field">
                            <label>lastName</label>
                            <input type="text" name = "name2" value =  <%= lastname %> readonly>
                        </div>

                        <div class="input-field">
                            <label>Gender</label>
                            <input type="text" name = "g"value = <%= gender %> readonly>
                        </div>

                        <div class="input-field">
                            <label>NIC</label>
                            <input type="text"  name = "nic" value =<%=nic%> readonly>
                        </div>
                    </div>
                </div>

                
                    
                        <div class="fields">
                        <div class="input-field">
                            <label>UserName</label>
                            <input type="text" name="uname" value = <%= uname %> readonly>
                        </div>

                        <div class="input-field">
                            <label>Phone Number</label>
                            <input type="number" name = "no" value =<%=id%> readonly>
                        </div>

                        <div class="input-field">
                            <label>Password</label>
                            <input type="text" name = "pws" value = <%= psw %> readonly>
                        </div>

                        <div class="input-field">
                            <label>Role_ID</label>
                            <input type="text"  name = "role" value = <%= rid %> readonly>
                        </div>
                                    
                    </div>

                    <button class="nextBtn">
                        <span class="btnText">Delete</span>
                        <i class="uil uil-navigator"></i>
                    </button>   
                   <a href = "admin.jsp"> <div class="backBtn">
                            <i class="uil uil-navigator"></i>
                            <span class="btnText">Home</span>
                        </div></a>
                   
                              
            </div>
             
        </form>
         
                
    </div>
	
	
</body>
</html>