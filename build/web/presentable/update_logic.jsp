<%-- 
    Document   : update_logic
    Created on : Aug 16, 2017, 12:31:27 AM
    Author     : MY PC
--%>

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
	int tnumber;
        int polynumber;
        String polyname;
        
	String address;
        
	int contactnumber;
        String emailid;
        String principalname;
        String branch;
        int totalstaff;
        int totalstudents;
        int intResult=0;
	
	tnumber= Integer.parseInt(request.getParameter("txttno"));
        polynumber= Integer.parseInt(request.getParameter("txtpolyno"));
        polyname = request.getParameter("txtpolyname");
        address = request.getParameter("txtaddress");
        contactnumber= Integer.parseInt(request.getParameter("txtcontactno"));
        emailid = request.getParameter("txtemailid"); 
         principalname = request.getParameter("txtprincipalname");   
         branch = request.getParameter("txtbranch");
        totalstaff= Integer.parseInt(request.getParameter("txttotalstaff"));
        totalstudents=Integer.parseInt(request.getParameter("txttotalstudents"));
        
	
	PolyBean s1 = new PolyBean();
	s1.settnumber(tnumber);
	s1.setpolynumber(polynumber);
	s1.setpolyname(polyname);
	s1.setaddress(address);
	s1.setcontactnumber(contactnumber);
        s1.setemailid(emailid);
	s1.setprincipalname(principalname);
	s1.setbranch(branch);
	s1.settotalstaff(totalstaff);
        s1.settotalstudents(totalstudents);
	
	
	PolyHandler sh1= new PolyHandler();
	
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
System.out.println("update-logic.jsp");
}
response.sendRedirect("polydetailsview.jsp");
%>
    </body>
</html>

