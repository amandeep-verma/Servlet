package com.adder;

/* simple servlet program which takes 2 numbers from user from webpage using HttpServletRequest and make the sum of those 2 number
 * and send it to another servlet using RequestDispatcher object. Using req.getRequestDispatcher("sq") , we get the RequestDispatcher
 * object of the SqServlet and from there we forward request and response using forward method.
 * REQUEST DISPATCHER INTERFACE ALLOWS YOU TO SEND THE REQUEST TO ANOTHER RESOURCE WITHIN SAME SERVER
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	// HttpServletRequest and HttpServletResponse  are both interface, Tomcat does the implementation and returns its object to us, 
	// so we can use them.
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
