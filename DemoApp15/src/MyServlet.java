import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 Welcome page is home.jsp
 Filters - Filters are the servlet program which are wrote so as the request from the client first go through filter and then to servlet.
 We can have multiple servlet to handle the situtation. For a request to go to server it would first have to pass through filter, if we have one.
 We can have same filter for multiple servlet and many filter for one servlet together.
 
 We have 2 filters in this project IDFilter And NameFilter
 */
@WebServlet("/addAlien")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		int aid = Integer.parseInt(req.getParameter("aid"));
		
		String name = req.getParameter("aname");
		
		out.println("welcome "+ name);
	}
	
}
