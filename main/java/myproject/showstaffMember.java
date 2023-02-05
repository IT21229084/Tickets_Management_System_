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
 * Servlet implementation class showstaffMember
 */
@WebServlet(name = "showstaffMembers", urlPatterns = { "/showstaffMembers" })
public class showstaffMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username  = request.getParameter("username");
		String password  = request.getParameter("password");
		
		boolean isDone;
		
		
		
		isDone  = usersDBUtil.loginvalidate(username, password);
		
		if (isDone == true) {
			List<Staffmember> st = usersDBUtil.ShowStaffmember();
			request.setAttribute("details", st)	;
			
			
			RequestDispatcher dis = request.getRequestDispatcher("staff.jsp");
			dis.forward(request, response);
			
		}else {
		

			RequestDispatcher dis = request.getRequestDispatcher("unuser.jsp");
			dis.forward(request, response);		
			}
			

}
	}


