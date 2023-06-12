

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class navigate
 */
@WebServlet("/navigate")
public class navigate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public navigate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='red' style='text-align:center'>");
		out.println("<h1>You have reached doGet!</h1><br />");
		out.println("<p style='font-size:20px'>My name is [YOUR NAME] and I studied in Xiamen University Malaysia "
				+ "under the program of [YOUR PROGRAMME/DEPARTMENT].</p>"
				+ "<br /><br />");  
		out.println("<h3>Was that weird? Add your name and progamme/department here now!</h3>");
		out.println("<p>P.S. We don't check anything here.</p>");
		out.println("<form action=\"navigate\" method=\"post\">"
				+ "	<label>Your name: </label>\r\n"
				+ "	<input type=\"text\" id=\"name\" placeholder=\"Name\" name=\"NAME\">\r\n"
				+ "	<br>\r\n"
				+ "	<label>Programme/Department: </label>\r\n"
				+ "	<input type=\"text\" id=\"password\" placeholder=\"Programme/Department\" name=\"prog\">\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"submit\" id=\"submit\" value=\"Submit\">	\r\n"
				+ "\r\n"
				+ "</form>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("NAME");
		String programme = request.getParameter("prog");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='green' style='text-align:center'>");
		out.println("<h1>You have reached doPost!</h1><br />");  
		out.println("<p style='font-size:20px'>My name is "
				+ username
				+ " and I studied in Xiamen University Malaysia "
				+ "under the program of "
				+ programme
				+ ".</p>"); 
		out.println("</body></html>");
	}

}
