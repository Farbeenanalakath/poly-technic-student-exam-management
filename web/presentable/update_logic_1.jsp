<%-- 
    Document   : update_logic
    Created on : Aug 16, 2017, 12:31:27 AM
    Author     : MY PC
--%>

<%@page import="polydetails.ExternalHandler"%>
<%@page import="polydetails.ExternalBean"%>
<%@page import="polydetails.PolyHandler"%>
<%@page import="polydetails.PolyBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%
try
{
	String ename;
        
	String iname;
       
	
        String specialize;
        
       
        int contactnumber;
        String emailid;
        int intResult=0;
	
	ename = request.getParameter("txtename");
        iname= request.getParameter("txtiname");
        specialize = request.getParameter("txtspecialize");   
        contactnumber= Integer.parseInt(request.getParameter("txtcontactno"));
        emailid = request.getParameter("txtemailid"); 
         
	
	ExternalBean s1 = new ExternalBean();
	s1.setename(ename);
	s1.setiname(iname);
	s1.setspecialize(specialize);
	s1.setcontactnumber(contactnumber);
        s1.setemailid(emailid);
	
	
	
	ExternalHandler sh1= new ExternalHandler();
	
	intResult = sh1.updateStudent(s1);
	if(intResult>0)
	{
	
	
	session.setAttribute("Message", "Student details updated successfully !");
	
	}
	else
	{
		session.setAttribute("Message", "Please Try again later !");
	}
	
	}
catch(Exception e)
{
System.out.println("update-logic1.jsp");
}
response.sendRedirect("externallogicview.jsp");
%>
    </body>
</html>

