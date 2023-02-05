package myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Catch the username and passowrd passing from login form
		
		String username  = request.getParameter("username");
		String password  = request.getParameter("password");
		
		boolean isDone;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		//Validate the user
		isDone  = usersDBUtil.loginvalidate(username, password);
		
		if (isDone == true) {
			List<ticketDetails> tikdetails = usersDBUtil.Showticketdetails();//pass the staffmember details
			request.setAttribute("details1", tikdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("admin.jsp");//Redirect path 
			dis.forward(request, response);
			
		}else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Your username is wrong');");
			out.println("location = 'login.jsp'");
			out.println("</script>");
			
			
		}
			
}

}
