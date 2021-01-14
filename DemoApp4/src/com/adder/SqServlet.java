package com.adder;

// Servlet AddServlet sends the request url to browser and browser calls the Servlet SqServlet

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		int k = Integer.parseInt(req.getParameter("k"));
		
		k = k*k;
		
		// getWriter() returns an object of PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("From SqServlet(calling servlet from servlet) using SendRedirect(Url- Rewriting), the square of the sum of the given two number is \n"+k );
		
	}
}
