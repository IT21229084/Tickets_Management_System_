package myproject;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import myproject.DBconnect;

public class usersDBUtil {
	
	// Create a connection beetween Mysql server and passed valued to servlet classes
	
	//Declare connection classes
	public static boolean isDone;
    private static java.sql.Connection con;
	private static Statement st;
	private static ResultSet rs;
	
	
	//Create a login validation part
	public static boolean loginvalidate(String username,String password) {
		
		
		try {
			//Create connection
			con =  DBconnect.getconnection();
			st  = con.createStatement();
			String sql = "select * from Staffmember where userName = '"+username+"'and password = '"+password+"' ";
			 rs = st.executeQuery(sql);
			
			if (rs.next()) {
				isDone = true;
				
			}else {
				isDone = false;
			}		
			
		}catch(Exception e) {
			
				e.printStackTrace();
				System.out.println("Connection is failed");
		}
		
		return isDone;
	}
	
	
	
	//Display the all the ticket detials in the database method 
	public static List<ticketDetails> Showticketdetails(){
		
		ArrayList <ticketDetails> t1 = new ArrayList<>();
		
		try {
			//Create connection
			con = DBconnect.getconnection();
			st  =con.createStatement();
			String sql = "select * from ticketdetail ";
			rs = st.executeQuery(sql);
			
			//get all data from table
			
			while (rs.next()){
				
				int id = rs.getInt(1);
				String header = rs.getString(2);
				String Descrption = rs.getString(3);
				String Reason = rs.getString(4);
				String Feedback = rs.getNString(5);
				String email = rs.getString(6);
				
				
				ticketDetails t2 = new ticketDetails(id,header,Descrption,Reason,Feedback,email);
				t1.add(t2);
				
			}
				
		}catch(Exception e){

			e.printStackTrace();
			System.out.println("Connection is failed");
	}
		
		return t1;
		
	}
	
	
	//Staffmember registration
public static boolean addmember(String firstName, String lastName, String nIC, String email, String telNo, String dOB,
		String gender, String userName, String password, String role_id) {
		
		boolean success = false;
		
	try {
		//Create connection
		   con = DBconnect.getconnection();
		   st = con.createStatement();
	    	String qr = "insert into staffmember values('0','"+firstName+"','"+lastName+"','"+nIC+"','"+email+"','"+telNo+"','"+dOB+"','"+gender+"','"+userName+"','"+password+"','"+role_id+"')";
			int rs  = st.executeUpdate(qr);//This statement returns o or 1
			
			//check statement work or not
			if (rs>0) {
				success = true;
			}else {
			    success = false;
			}
			
		}catch(Exception e) {

			e.printStackTrace();
			System.out.println("Connection is failed");
		}
			
		return success;
		
	}


//Display the All the staffmember details
public static List<Staffmember> ShowStaffmember(){
	
	ArrayList <Staffmember> t1 = new ArrayList<>();
	
	try {
		
		con = DBconnect.getconnection();
		st  =con.createStatement();
		String sql = "select * from staffmember ";
		rs = st.executeQuery(sql);//This statement returns o or 1
		
		//get all data from table
		
		while (rs.next()){
			
			String id = rs.getString(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			String NIC = rs.getString(4);
			String Email = rs.getString(5);
			String TelNo = rs.getString(6);
			String DOB = rs.getString(7);
			String Gender = rs.getString(8);
			String userName = rs.getString(9);
			String password = rs.getString(10);
			String RId = rs.getString(11);
							
			
			Staffmember t2 = new Staffmember(id,firstName,lastName,NIC,Email,TelNo,DOB,Gender,userName,password,RId);
			t1.add(t2);//All data add to the arraylist
			
		}
			
	}catch(Exception e){

		e.printStackTrace();
		System.out.println("Connection is failed");
}
	
	return t1;
	
}
	
  //Delete the staffmember from the sysytem
	public static boolean removecustomer(String id) {
		
		boolean isdone = false;
		
		try {
			

			con = DBconnect.getconnection();
			st  =con.createStatement();
			String sql = "delete from staffmember where S_id = '"+id+"' ";
			int rs = st.executeUpdate(sql);//This statement returns o or 1
			
			
			if (rs>0) {
				isdone  = true;
			}
			else {
				isdone = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error oocured");
		}

		return isdone;
	}
	
	
	//Update the staffmember details
public static boolean updatestaff(String id1,String firstName, String lastName, String nIC, String email, String telNo, String dOB,
		String gender, String userName, String password) {
    	
    	try {
    		
    		con = DBconnect.getconnection();
    		st = con.createStatement();
    		String sql = "update staffmember set FirstName='"+firstName+"',LastName='"+lastName+"',Email='"+email+"',GENDER='"+gender+"',UserName='"+userName+"',NIC='"+nIC+"',TelNo='"+telNo+"',DOB='"+dOB+"',password='"+password+"'"
    				+ "where S_id='"+id1+"'";
    		int rs = st.executeUpdate(sql); //This statement returns o or 1
    		
    		if(rs > 0) {
    			isDone = true;
    		}
    		else {
    			isDone = false;
    		}
    		
    	}
    	catch(Exception e) {

			e.printStackTrace();
			System.out.println("Connection is failed");
    	}
    	
    	return isDone;
    }
	
	
	
	
	
	
	
	
	
	

}
