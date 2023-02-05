package myproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	private static String url = "jdbc:mysql://localhost:3306/db1";
	private static String username = "root";
	private static String Password = "3541";
	private static Connection con;
	
	
	public static Connection getconnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,Password);
			
			
			
		}catch(Exception e) {
			
			System.out.println("Database connection is not Sucessfull");
			
		}
		
		
		
		return con;
	}

}
