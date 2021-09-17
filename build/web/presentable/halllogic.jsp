<%-- 
    Document   : halllogic
    Created on : Dec 15, 2017, 7:31:28 PM
    Author     : MY PC
--%>

<%@page import="polydetails.HallHandler"%>
<%@page import="polydetails.HallBean"%>
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
       String StrQuery;
	int hnumber;
        int totalstudents;
        int intResult;
        
	
	
	
	
	
        hnumber= Integer.parseInt(request.getParameter("txthallnumber"));
        
        totalstudents= Integer.parseInt(request.getParameter("txttotalstudents"));
        
         
        
	
        
	
	
	
	
	HallBean L1 = new HallBean();
	
        L1.sethnumber(hnumber);
        L1.settotalstudents(totalstudents);
       
         out.println("Logic Page Rechead");
	
	HallHandler L2=new HallHandler();
        intResult=L2.inserthalldetails(L1);
        
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
            
        <h1>Hello World!</h1>
    </body>
</html>
