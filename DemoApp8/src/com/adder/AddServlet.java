package com.adder;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
// Annotations
// We can replace the xml content using  WebServlet by just giving the url name as parameter as shown below.
@WebServlet("/add")
public class AddServlet extends HttpServlet {

	// HttpServletRequest and HttpServletResponse  are both interface, Tomcat does the implementation and returns its object to us, 
	// so we can use them.
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		// req.getParameter("num1") returns string here so we use method to change it to integer
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		/* We can transfer data from one servlet to another servlet under sendRedirect using 3 ways-
		 * 1. Session  2. Cookies  3. Url ReWriting
		*/
		
		// Here we are using Cookies
		// Cookie constructor takes 2 object name and value. Both are String types, so we convert int k to string.
		Cookie cookie = new Cookie("k", k+"");
		
		// resp.addCookie takes cookie parameter and sends it to the client. Client from there takes this cookie.
		resp.addCookie(cookie);
		
		// Client sends the req to SqServlet with the cookie
		resp.sendRedirect("sq");
	}
	

}
