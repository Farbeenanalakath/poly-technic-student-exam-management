<%-- 
    Document   : newjsp
    Created on : Aug 10, 2017, 3:05:43 AM
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
        int intResult;
        
	
	
	
	
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
        
	
        
	
	
	
	
	PolyBean L1 = new PolyBean();
	L1.settnumber(tnumber);
	L1.setpolynumber(polynumber);
        L1.setpolyname(polyname);
        L1.setaddress(address);
        L1.setcontactnumber(contactnumber);
         L1.setemailid(emailid);
          L1.setprincipalname(principalname);
           L1.setbranch(branch);
            L1.settotalstaff(totalstaff);
             L1.settotalstudents(totalstudents);
        
	
	PolyHandler L2=new PolyHandler();
        intResult=L2.insertpolydetails(L1);
        
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
            response.sendRedirect("loginn.jsp");
%>
            
            
            
           
        <h1>Hai guyzz</h1>
    </body>
</html>
