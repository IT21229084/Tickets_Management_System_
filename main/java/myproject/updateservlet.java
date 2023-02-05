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
 * Servlet implementation class updateservlet
 */
@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Catch the passing values
		
		String id = request.getParameter("id1");
		String firstName = request.getParameter("name1");
		String LastName = request.getParameter("name2");
		String NIC  = request.getParameter("nic");
		String email    = request.getParameter("email");
		String num      = request.getParameter("no");
		String DOB = request.getParameter("dob");
		String gender = request.getParameter("g");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pws");

		boolean success ;
		//stored passed values to method
		success = usersDBUtil.updatestaff(id,firstName, LastName, NIC, email, num,DOB,gender,userName,password);//stored passed values to method
		
		//Database connection success and data insert success
		if (success == true) {
			
			List<Staffmember> st = usersDBUtil.ShowStaffmember();
			request.setAttribute("details", st)	;
			
			RequestDispatcher rs = request.getRequestDispatcher("staff.jsp");
			rs.forward(request, response);
			
		}else {
			
			
		
	}

	}
}