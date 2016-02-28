package com.j2ee.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Simple servlet used to test server.
 *  <P>
 *  Taken from Core Servlets and JavaServer Pages 2nd Edition
 *  from Prentice Hall and Sun Microsystems Press,
 *  http://www.coreservlets.com/.
 *  &copy; 2003 Marty Hall; may be freely used or adapted.
 */

public class HelloHttpServlet extends HttpServlet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
	
    response.setContentType("text/html");
    
    PrintWriter out = response.getWriter();
    
    String docType ="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " + "Transitional//EN\">\n";
    out.println("THIS IS THE FIRST SERVLET PROGRM ON GENERIC SERVLET");
    out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>Hello HTTP</TITLE></HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>Hello Wonderful Team..!!</H1>\n" +
                "</BODY></HTML>");
  }
}