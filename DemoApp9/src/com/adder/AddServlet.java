package com.adder;
// JSP
//In server we can write html in java
// But in this project, in add.jsp we are writing java in html which is JSP.

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

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	// HttpServletRequest and HttpServletResponse  are both interface, Tomcat does the implementation and returns its object to us, 
	// so we can use them.
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		
		// The code below can be uncommented, it is just to check if our jsp works.
/*
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		PrintWriter out = resp.getWriter();
		out.println("<html><head></head><body bgcolor='cyan'>");
		out.println("Output: "+k);
		out.println("</body></html>");
*/
	}
	

}
