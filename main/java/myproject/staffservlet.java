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
 * Servlet implementation class staffservlet
 */
@WebServlet("/staffservlet")
public class staffservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showstaffdetails showstaffdetails = null;
		showstaffdetails = new showstaffdetails();
		List<Staffmember> list =showstaffdetails.getData();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("test.jsp");
		dispatcher.forward(request, response);
	}


}
