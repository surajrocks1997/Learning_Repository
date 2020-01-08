package com.suraj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sendData")
public class sendingDatatoJSP extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		
		Student s = new Student("Suraj", 11);
		session.setAttribute("name", s.name);
		session.setAttribute("rollNo", s.rollNo);
		
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
	
		session.setAttribute("fName", firstName);
		session.setAttribute("lName", lastName);
		
		response.sendRedirect("recievingDatafromServlet.jsp");

	}
}
