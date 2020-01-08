package com.suraj;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suraj.dao.StudentDao;
import com.suraj.model.Student;


@WebServlet("/getStudent")
public class GetStudent extends HttpServlet {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		StudentDao dao = new StudentDao();
		
		try {
			Student student = dao.getStudent(rollNo);	
			request.setAttribute("mydata", student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			 
			RequestDispatcher rd = request.getRequestDispatcher("showData.jsp");
			rd.forward(request, response);
		}
				
		
		
			
		
	}

}
