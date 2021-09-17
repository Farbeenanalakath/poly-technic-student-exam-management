<%-- 
    Document   : externallogic
    Created on : Dec 14, 2017, 1:22:20 PM
    Author     : MY PC
--%>

<%@page import="polydetails.ExternalHandler"%>
<%@page import="polydetails.ExternalBean"%>
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
	String ename;
        
	String iname;
       
	
        String specialize;
        
       
        int contactnumber;
        String emailid;
        int intResult;
        
	
	
	
	
	
        
        ename = request.getParameter("txtename");
        iname= request.getParameter("txtiname");
        specialize = request.getParameter("txtspecialize");   
        contactnumber= Integer.parseInt(request.getParameter("txtcontactno"));
        emailid = request.getParameter("txtemailid"); 
         
        
	
        
	
	
	
	
	ExternalBean L1 = new ExternalBean();
	
        L1.setename(ename);
        L1.setiname(iname);
        L1.setspecialize(specialize);
        L1.setcontactnumber(contactnumber);
         L1.setemailid(emailid);
         out.println("Logic Page Rechead");
	
	ExternalHandler L2=new ExternalHandler();
        intResult=L2.externaldetails(L1);
        
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
