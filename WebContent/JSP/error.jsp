<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isErrorPage="true" %>
<html>
  <head>
    <title>Simple</title>
  </head>
  <body style="font-family:verdana;font-size:10pt;">
    <%@ include file="header.html" %>
    <p style="color=#FF0000"><b><%= exception.getMessage() %></b></p>
    <jsp:include page="footer.jsp"/>
  </body>
</html>       
header.jsp
<h3>Loan Calculator</h3>
footer.jsp
<%= new java.util.Date() %>