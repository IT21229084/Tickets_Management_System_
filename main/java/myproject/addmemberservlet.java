package myproject;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myproject.usersDBUtil;
import myproject.Staffmember;

/**
 * Servlet implementation class addmemberservlet
 */
@WebServlet("/addmemberservlet")
public class addmemberservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addmemberservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		
            //Catch values passing from addmember form		
		    
			String firstName = request.getParameter("name1");
			String LastName = request.getParameter("name2");
			String NIC  = request.getParameter("nic");
			String email    = request.getParameter("email");
			String num      = request.getParameter("no");
			String DOB = request.getParameter("dob");
			String gender = request.getParameter("g");
			String userName = request.getParameter("uname");
			String password = request.getParameter("pws");
			String role_id = request.getParameter("role");
			
			
			
			
			boolean success ;
			
			
			success = usersDBUtil.addmember(firstName, LastName, NIC, email, num,DOB,gender,userName,password,role_id);
			
			//Database connection success and data insert success
			if (success == true) {
				List<Staffmember> st = usersDBUtil.ShowStaffmember();//Stored Staffmember details to list
				request.setAttribute("details", st)	;
				
				
				RequestDispatcher rs = request.getRequestDispatcher("staff.jsp");//Redirect path
				rs.forward(request, response);
				
			}else {
				
				RequestDispatcher rs2 = request.getRequestDispatcher("unuser.jsp");
				rs2.forward(request, response);
			}
			
			
	}

}
