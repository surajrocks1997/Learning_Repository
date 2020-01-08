package com.suraj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextparam")
public class contextParamEx extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		ServletContext context = request.getServletContext();
		String str = context.getInitParameter("name");
		
		ServletConfig config = getServletConfig();
		String str1 =  config.getInitParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println(str);
		out.println(str1);
	}
	

}
