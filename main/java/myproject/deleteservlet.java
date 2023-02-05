package myproject;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteservlet
 */
@WebServlet("/deleteservlet")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		
		//Catch values passing from delete page	
		String id = request.getParameter("id1");
		
		boolean isdone;
		 
		isdone = usersDBUtil.removecustomer(id);
		
		//Check the values are same find the  similar id
		
	  if (isdone == true) {
		  
		  List<Staffmember> st = usersDBUtil.ShowStaffmember();// stored staffmember details
			request.setAttribute("details", st)	;
			 
		  RequestDispatcher dis = request.getRequestDispatcher("staff.jsp");
			dis.forward(request, response);
			
	  }
	  else {
		  RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
			 
	  }
		
	}

}
