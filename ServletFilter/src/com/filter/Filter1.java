package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/addStudent")
public class Filter1 implements Filter {

    public Filter1() {
        // TODO Auto-generated constructor stub
    }
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request1 = (HttpServletRequest)request;
		PrintWriter out = response.getWriter();
		
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		if(rollNo>0)
		{
			chain.doFilter(request, response);
		}
		else
			out.println("Invalid Input!!!!, Roll number must be a positive number");
			
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
