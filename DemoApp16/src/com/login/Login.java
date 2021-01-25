package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*
V-32
Login Using servlet.
We start with landing page login.jsp, where we take userid and password from the user. From there we take we take the request 
to Login.java. Here we compare the userid and password. If they are wrong we sendRedirect to login.jsp. If the username and 
password matches, WE make a session and add the attribute username to it and sendRedirect to welcomejsp.
Welcome.jsp page firstly checks if the session has attribute uname or not, if not sends the userback to login page. If yes gives 
further hyperlink for videos.jsp page and aboutus.jsp page. 
Along with that there is a logout page hyperlink clicking on which calls the servlet Logout.java. Logout.java removes the attribute
username and invalidate the data(unbind the data) and sendRedirect to login page.
Maintaining Session and checking them on each page after login make sure user is logged in to access the pages.
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("id");
		String password = request.getParameter("password");

		if (uname.equals("amandeep") && password.equals("learning")) {
			// Setting attribute username
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
