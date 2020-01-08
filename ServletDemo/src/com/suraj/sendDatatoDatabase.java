package com.suraj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/database")
public class sendDatatoDatabase extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException { 
		
		String name = request.getParameter("name");
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		
		Student student = new Student(name, rollNo);
		
		StudentDao dao = new StudentDao();
		dao.update(student);
		
		 PrintWriter out = response.getWriter();
		 out.println("Done.");
		
		
	}
}