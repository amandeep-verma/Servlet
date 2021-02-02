package com.adder;

// Servlet AddServlet makes a cookie, add cookie to the response. Sends the response with sendRedirect. Client from there calls
// the SqServlet with cookie

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		// getCookies() gives all the cookies. There can be multiple cookies. So we are using array of cookies
		Cookie[] cookies = req.getCookies();
		
		int k=0;
		
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		k = k*k;

		// getWriter() returns an object of PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("From SqServlet(calling servlet from servlet) using SendRedirect(cookies), the square of the sum of the given two number is \n"+k );

	}
}
