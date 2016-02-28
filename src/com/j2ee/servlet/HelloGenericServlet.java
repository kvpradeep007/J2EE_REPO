/**
 * 
 */
package com.j2ee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class HelloGenericServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " + "Transitional//EN\">\n";
		PrintWriter out=res.getWriter();
		out.println("This is first servlet program on GenericServlet");
		out.println(docType +
	                "<HTML>\n" +
	                "<HEAD><TITLE>Hello GENERIC</TITLE></HEAD>\n" +
	                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
	                "<H1>This is first servlet program on GenericServlet..!!</H1>\n" +
	                "</BODY></HTML>");
	}
}
