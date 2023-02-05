<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add member</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
       
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <!----======== CSS ======== -->
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="addcss.css">
     
    <!----===== Iconscout CSS ===== -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

</head>
<body>


 <div class="container">
        <header>Add New staffmember</header>

        <form action="addmemberservlet" method = "post">
            <div class="form first">
                <div class="details personal">
                   

                    <div class="fields">
                        <div class="input-field">
                            <label>FirstName</label>
                            <input type="text" name = "name1" placeholder="Enter your firstname" required>
                        </div>
                       
                        <div class="input-field">
                            <label>Date of Birth</label>
                            <input type="date" name = "dob" placeholder="Enter birth date" required>
                        </div>

                        <div class="input-field">
                            <label>Email</label>
                            <input type="text"  name = "email" placeholder="Enter your email" required>
                        </div>

                        <div class="input-field">
                            <label>lastName</label>
                            <input type="text" name = "name2" placeholder="Enter your lastName" required>
                        </div>

                        <div class="input-field">
                            <label>Gender</label>
                            <input type="text" name = "g" placeholder="Enter M/F" required>
                        </div>

                        <div class="input-field">
                            <label>NIC</label>
                            <input type="text"  name = "nic" placeholder="Enter your NIC NO" required>
                        </div>
                    </div>
                </div>

                
                    
                        <div class="fields">
                        <div class="input-field">
                            <label>UserName</label>
                            <input type="text" name="uname" placeholder="Enter your userName" required>
                        </div>

                        <div class="input-field">
                            <label>Phone Number</label>
                            <input type="number" name = "no" placeholder="Enter your number" required>
                        </div>

                        <div class="input-field">
                            <label>Password</label>
                            <input type="text" name = "pws" placeholder="Enter password" required>
                        </div>

                        <div class="input-field">
                            <label>Role_ID</label>
                            <input type="text"  name = "role" placeholder="Enter Role_ID" required>
                        </div>
                                    
                    </div>

                    <button class="nextBtn">
                        <span class="btnText">Create</span>
                        <i class="uil uil-navigator"></i>
                    </button>   
                  
                   
              
                
            </div>
             

        </form>
         
                    
    </div>
    
</body>
</html>