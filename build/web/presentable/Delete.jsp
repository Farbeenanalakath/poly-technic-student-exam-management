<%-- 
    Document   : Delete
    Created on : Aug 16, 2017, 11:25:27 PM
    Author     : MY PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
             import ="java.sql.*,polydetails.*"%>%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <%!
int intResult=0;
                  int polyID;
                  
%>
<%
PolyHandler Ph1=new PolyHandler();
try
{
	polyID =Integer.parseInt(request.getParameter("sltPolyID"));
	intResult=Ph1.deletePolyDetails(polyID);




if(intResult>0)
{


session.setAttribute("Message", "poly details deleted successfully !");

}
else
{
	session.setAttribute("Message", "Please Try again later !");
}


}
catch(Exception e)
{
System.out.println("Delete.jsp");
}
response.sendRedirect("message.jsp");
     			%>
          
    </body>
</html>
