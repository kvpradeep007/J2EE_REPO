package com.j2ee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class GetParameter extends HttpServlet  
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
 
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
 
		int result=Integer.parseInt(n1)+Integer.parseInt(n2);		
		pw.println("Sum of two numbers " +result);
		pw.close();
 
	}
 
}