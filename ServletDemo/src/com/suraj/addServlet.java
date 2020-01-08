package com.suraj;

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
public class addServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;

		Cookie cookie = new Cookie("result", k + "");
		response.addCookie(cookie);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("result", k);
		
		response.sendRedirect("square"); 
		
//		request.setAttribute("result", k);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("square");
//		rd.forward(request, response);
		
		
	}
	
}
