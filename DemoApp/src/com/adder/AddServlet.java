package com.adder;
/* simple servlet program which takes 2 numbers from user from webpage using HttpServletRequest and returns 
 * the output to the webpage using HttpServletResponse.
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet{
	
	// service method belongs to servlet life cycle
	// tomcat creates the object of HttpServletRequest and HttpServletResponse 
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		
		// getWriter() returns an object of PrintWriter
		PrintWriter out = resp.getWriter();
		
		out.println("the sum is "+k);
	}
}
