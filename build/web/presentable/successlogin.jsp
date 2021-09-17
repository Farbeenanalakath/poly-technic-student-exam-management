<%-- 
    Document   : newjsp
    Created on : Aug 10, 2017, 3:05:43 AM
    Author     : MY PC
--%>

<%@page import="polydetails.LoginHandler"%>
<%@page import="polydetails.LoginBean"%>
<%@page import="java.sql.*"%>
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
        <%!
        
        String username;
        
	
        String password;
       ResultSet rsData;
        
        %>
        <%
            try
{
        
	
	
	
	
	
	
        username = request.getParameter("txttno");
        password = request.getParameter("txtpolyno");
        
	
        System.out.println("The username in logic page:"+username);
	
	
	
	
	
	
	LoginHandler L2=new LoginHandler();
        rsData=L2.success(username,password);
        
if(rsData!=null)
{
    if(rsData.next())

{


response.sendRedirect("Menu Setting.jsp");

}
else 
{
	
response.sendRedirect("invalidlogin.jsp");
}

}
}
catch(Exception e)
{
System.out.println("Invalid input:"+e.getMessage());
}
         
%>
            
            
            
           
       
    </body>
</html>
