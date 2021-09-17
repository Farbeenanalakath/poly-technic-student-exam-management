<%-- 
    Document   : newjsp
    Created on : Aug 10, 2017, 3:05:43 AM
    Author     : MY PC
--%>

<%@page import="javafx.scene.control.Alert"%>
<%@page import="polydetails.LoginHandler"%>
<%@page import="polydetails.LoginBean"%>
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
        String username;
        String password;
        int intResult;
        
	
	
	
	
	
        username= request.getParameter("txtusername");
        password = request.getParameter("txtpassword");
       
        
	
        LoginBean L1 = new LoginBean();

        L1.setusername(username);
        L1.setpassword(password);
        
        
	
	LoginHandler L2=new LoginHandler();
        intResult=L2.insertLogindetails(L1);
        
if(intResult>0)
{


session.setAttribute("Message", "poly details saved successfully !");

}
else
{
	session.setAttribute("Message", "Please Try again later !");
}

}
catch(Exception e)
{
System.out.println("Invalid input:"+e.getMessage());
}
            response.sendRedirect("index.jsp");
%>
            
            
           
        <h1>Hai guyzz</h1>
    </body>
</html>
