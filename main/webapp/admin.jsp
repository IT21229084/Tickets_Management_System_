<!DOCTYPE html>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title>Admin_Dashboard</title>
    <link rel="stylesheet" href="style.css">
    
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    <link href='mycss.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>

  <div class="sidebar">
    <div class="logo-details">
     <img src="https://img.icons8.com/fluency/48/null/starred-ticket.png"/>
     <br>
      <span class="logo_name">E_tickets</span>
    </div>
      <ul class="nav-links">
        <li>
          <a href="#" class="active">
          <i class='bx bx-grid-alt' ></i>
            <span class="links_name">Dashboard</span>
          </a>
        </li>
         
        <li>
          <a href="show">
           <i class='bx bx-coin-stack' ></i>
            <span class="links_name">Manage Team</span>
          </a>
        </li>
        <li>
          <a href="addmember.jsp">
            <i class='bx bx-coin-stack' ></i>
            <span class="links_name">Add Members</span>
          </a>
        </li>
       
        
        <li class="log_out">
          <a href="#">
            <i class='bx bx-coin-stack' ></i>
            <span class="links_name">Log out</span>
          </a>
        </li>
      </ul>
  </div>
  <section class="home-section">
    <nav>
      <div class="sidebar-button">
        <i class='bx bx-menu sidebarBtn'></i>
        <span class="dashboard">Dashboard</span>
      </div>
      
      <div class="profile-details">
                
        <!--<img src="images/profile.jpg" alt="">-->
        <span class="admin_name">Malith_Iroshan</span>
        <i class='bx bx-chevron-down' ></i>
      </div>
    </nav>
     

    <div class="home-content">
      <div class="overview-boxes">
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Total Tickets</div>
            <div class="number">140</div>
            <div class="indicator">
              <i class='bx bx-up-arrow-alt'></i>
              <span class="text">In this month</span>
            </div>
          </div>
         
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Pending Tickets</div>
            <div class="number">22</div>
            <div class="indicator">
              <i class='bx bx-up-arrow-alt'></i>
              <span class="text">Up from yesterday</span>
            </div>
          </div>
          
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">closed Tickets</div>
            <div class="number">10</div>
            <div class="indicator">
              <i class='bx bx-up-arrow-alt'></i>
              <span class="text">In this week</span>
            </div>
          </div>
         
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">New coming</div>
            <div class="number">6</div>
            <div class="indicator">
              <i class='bx bx-down-arrow-alt down'></i>
              <span class="text">Next week</span>
            </div>
          </div>
          
        </div>
      </div>

      <div class="sales-boxes">
        <div class="recent-sales box">
          <div class="title">All Tickets</div>
          <div class="sales-details">
           
		          
          <table>
              <tr style = "margin:20px;">
             
            
             <th>Ticket_Id</th>
              <th>Header</th>
              <th>Description</th>
                <th>Closed_Reason</th>
                <th>Feedback</th>
                <th>Email</th>
               
               
            </tr>
            <c:forEach var = "ticket" items ="${details1}">
             <c:set var="id" value="${ticket.ticketid}"/>
	        <c:set var="header" value="${ticket.tHeader}"/>
	        <c:set var="des" value="${ticket.description}"/>
	         <c:set var="cl" value="${ticket.reason}"/>
	          <c:set var="feedback" value="${ticket.feedback}"/>
	          <c:set var="email" value="${ticket.email}"/>
	          
	      
            <ul class="details">
             
               <tr>
              
               <td>${ticket.ticketid}</td>
               <td>${ticket.tHeader}</td>
                <td>${ticket.description}</td>
                 <td>${ticket.reason}</td>
                 <td>${ticket.feedback}</td>
                 <td>${ticket.email}</td>
                 
              </tr>
  
            </ul>
           
          </c:forEach>
          </table>
          </div>
        
          
        </div>
     
      </div>
    </div>
  </section>

 
</body>
</html>

