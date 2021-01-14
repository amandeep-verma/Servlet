package com.adder;

// Servlet AddServlet makes a session and hold the value and calls SqServlet.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		// Making the object of interface HttpSession;
		HttpSession session = req.getSession();
		
		// We get the value of attribute and we have to type cast it.
		int k =  (int) session.getAttribute("k");
		
		// We can remove attribute by following from session, and then we cannot fetch the value after that.
		//session.removeAttribute("k");
		
		k = k*k;

		// getWriter() returns an object of PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("From SqServlet(calling servlet from servlet) using SendRedirect(session), the square of the sum of the given two number is \n"+k );
		
	}
}
