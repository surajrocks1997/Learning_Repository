package com.suraj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class squareServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int k=0;
		Cookie cookies[] = request.getCookies();
		
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("result"))
				k = Integer.parseInt(cookie.getValue());
		}
		
		k=k*k;
		
		PrintWriter out = response.getWriter();
		out.println("Result is :" + k);
		
		
	}
	
}
