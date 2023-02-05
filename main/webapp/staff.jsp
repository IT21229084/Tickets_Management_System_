<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>


    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    <link href='showstaff.css' rel='stylesheet'>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h2>View StaffMember Details</h2>
 
        <div class="container">
	<table>
		<thead>
			<tr>
				 <th>SID</th>
                 <th>firstname</th>
                  <th>lastname</th>
                  <th>NIC</th>
                  <th>Email</th>
                  <th>DOB</th>
                  <th>Gender</th>
                  <th>username</th>
                  <th>password</th>
                  <th>RID</th>
				  <th colspan="2">Action</th>
               
			</tr>
			 <c:forEach var = "staff" items ="${details}">
             <c:set var="id" value="${staff.sid}"/>
	        <c:set var="firstname" value="${staff.firstName}"/>
	        <c:set var="lastname" value="${staff.lastName}"/>
	         <c:set var="nic" value="${staff.NIC}"/> 
	              <c:set var="email" value="${staff.email}"/> 
	                                           
	            <c:set var="dob" value="${staff.DOB}"/>
	            <c:set var="gender" value="${staff.gender}"/>
	                
	              <c:set var="uname" value="${staff.userName}"/>
	              <c:set var="psw" value="${staff.password}"/>
	              <c:set var="rid" value="${staff.RId}"/>
                    
                  
	               <c:url value="user.jsp" var="cusdelete">
		           <c:param name="id" value="${id}"/>
		            <c:param name="firstname" value="${firstname}"/>
		             <c:param name="lastname" value="${lastname}"/>
		             <c:param name="nic" value="${nic}"/>
		             <c:param name="email" value="${email}"/>
		              <c:param name="dob" value="${dob}"/>
		               <c:param name="gender" value="${gender}"/>
		                <c:param name="uname" value="${uname}"/>
		                 <c:param name="psw" value="${psw}"/>
		                  <c:param name="rid" value="${rid}"/>
		                  
		           </c:url>
			<tr>
			<td>${staff.sid}</td>
            <td>${staff.firstName}</td>
            <td>${staff.lastName}</td>
            <td>${staff.NIC}</td>
            <td>${staff.email}</td>
            
            
          
            <td>${staff.DOB}</td>
            <td>${staff.gender}</td>
            <td>${staff.userName}</td>
            <td>${staff.password}</td>
            <td>${staff.RId}</td>
            <td><a href ="${ cusdelete}">delete</a>
            
            
                <c:url value="updatestaff.jsp" var="cusupdate">
		           <c:param name="id" value="${id}"/>
		            <c:param name="firstname" value="${firstname}"/>
		             <c:param name="lastname" value="${lastname}"/>
		             <c:param name="nic" value="${nic}"/>
		             <c:param name="email" value="${email}"/>
		              <c:param name="dob" value="${dob}"/>
		               <c:param name="gender" value="${gender}"/>
		               <c:param name="uname" value="${uname}"/>
		                 <c:param name="psw" value="${psw}"/>
		                  <c:param name="rid" value="${rid}"/>
		                  
		          </c:url>
			
           
            </td>
             <td><a href ="${ cusupdate}">Update</a>
           
            </td>
              </tr>
  
		</c:forEach>
	</table>
</div>  





</body>
</html>