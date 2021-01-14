package com.adder;

// calling a servlet from present servlet

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		
		// getAttribute("k") here returns object type, we type cast it to integer
		int k = (int) req.getAttribute("k");
		k = k*k;
		
		// getWriter() returns an object of PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("From SqServlet(calling servlet from servlet), the square of the sum of the given two number is "+k );
		
		
		// To call a servlet from this servlet class, we have two methods
		// Req Dispatcher and Redirect
		
		
		
	}
}
