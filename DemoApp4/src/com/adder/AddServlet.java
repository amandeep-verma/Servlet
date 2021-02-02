package com.adder;

/* simple servlet program which takes 2 numbers from user from webpage using HttpServletRequest and make the sum of those 2 number
 * and send it to another servlet using SendRedirect(Url ReWriting). Here we Rewrite the url and send it to the browser. Browser calls the SqServlet
 * by passing the k value from url which we rewrote.
 * SENDREDIRECT ALLOWS YOU TO TRANSFER THE REQUEST TO ANOTHER RESOURCE TO DIFFERENT DOMAIN BY SENDING THE REQUEST TO CLIENT OR BROWSER
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

		/* We can transfer data from one servlet to another servlet under sendRedirect using 3 ways-
		 * 1. Session  2. Cookies  3. Url ReWriting
		*/
		
		// Here we are using Url Rewriting
		// here we are sending k as in it would get sent in doGet request to browser which calls for another servlet.
		resp.sendRedirect("sq?k="+k);
		
	}
	

}
