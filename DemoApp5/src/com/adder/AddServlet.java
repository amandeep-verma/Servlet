package com.adder;

/* simple servlet program which takes 2 numbers from user from webpage using HttpServletRequest and make the sum of those 2 number
 * and send it to another servlet using SendRedirect(Session).
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		// Here we are using Session 
		// To maintain the data throughout session we can use session. We can send request to multiple servlets by this.
		// We get object HttpSession interface by req.getSession() to get hold on it.
		HttpSession session = req.getSession();
		
		// setting the attributes. The session stays as long as we close it.
		session.setAttribute("k", k);
		
		// resp.sendRedirect takes the parameter of url to map from xml. 
		resp.sendRedirect("sq");
		
		
	}
	

}
