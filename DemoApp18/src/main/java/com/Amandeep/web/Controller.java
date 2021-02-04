package com.Amandeep.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Amandeep.web.dao.AlienDao;
import com.Amandeep.web.model.Alien;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		AlienDao dao  = new AlienDao();
		Alien a1= dao.getAlien(aid);
		
		request.setAttribute("alien", a1);
		RequestDispatcher rd = request.getRequestDispatcher("ShowAlien.jsp");
		rd.forward(request, response);
	}

	

}
