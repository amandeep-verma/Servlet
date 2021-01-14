package com.adder;

/* simple servlet program which takes 2 numbers from user from webpage using HttpServletRequest and returns 
 * the output to the webpage using HttpServletResponse.
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	// service method belongs to servlet life cycle
	// tomcat creates the object of HttpServletRequest and HttpServletResponse
	// service method works with both get and post request
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		// req.getParameter("num1") returns string here so we use method to change it to integer
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		// setAttribute() sets "k" key to value of k and associate it with the calling object
		req.setAttribute("k", k);

		// RequestDispatcher is an interface. To get its object we use getRequestDispatcher() by passing the url as parameter
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		// forward() forwards the req and resp to the rd object(In our case another servlet)
		rd.forward(req, resp);
	}
	

}
