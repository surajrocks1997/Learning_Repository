package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.loginDao;

@WebServlet("/login")
public class Login extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		loginDao dao = new loginDao();
		
		try {
			if(dao.check(uname, password)) {
				session.setAttribute("uname", uname);
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("home.jsp");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
