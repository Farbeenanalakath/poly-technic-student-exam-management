<%@page import="java.sql.ResultSet"%>
<%@page import="polydetails.PolyHandler"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--
Template Name: Presentable
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Presentable</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
<script type="text/javascript" src="layout/scripts/jquery.min.js"></script>
<script type="text/javascript" src="layout/scripts/jquery.innerfade.js"></script>
<style type="text/css">
<!--
.style1 {font-size: x-large}
-->
</style>
<link href="layout/styles/tables.css" rel="stylesheet" type="text/css" />
</head>
<body id="top">
    <form id="form1" name="form1" method="post" action= "update_logic.jsp">
          <%!
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
        ResultSet rsData;
%>
<%
PolyHandler L1=new PolyHandler();
try
{
    tnumber = Integer.parseInt(request.getParameter("sltPolyID"));
    rsData=L1.getvalues(tnumber);

}
catch(Exception e)
{
System.out.println(e.getMessage());
}


try
     {
     	if(rsData!=null)
     	{
     		if(rsData.next())
     		{
     				
     			   tnumber= rsData.getInt("T_no");
        polynumber= rsData.getInt("poly_no");
        polyname = rsData.getString("poly");
        address = rsData.getString("address");
        contactnumber= rsData.getInt("contact_no");
        emailid = rsData.getString("e_mailid"); 
         principalname = rsData.getString("principal");   
         branch = rsData.getString("branch");
        totalstaff= rsData.getInt("total_staff");
        totalstudents=rsData.getInt("total_student");
        
     				
     		}
		} 
		 

}
catch(Exception e)
{

System.out.println("[update_view.jsp ]"+e.getMessage());
}
     			%>
    
<div class="wrapper col1">
    
  <div id="header">
    <div id="logo">
      <h1><a href="index.html">P</a><a href="index.html">OLY STUDENT EXAM MANAGEMENT </a></h1>
      <p>BE TECHNICAL</p>
    </div>
    <div id="search">
     
        <fieldset>
          <legend>Site Search</legend>
        </fieldset>
      
    </div>
    <div id="topnav">
      <ul>
        <li class="last"><a href="#">Time Table </a></li>
        <li><a href="view1.jsp">ViewIn</a>
        
        </li>
        <li><a href="login_1.jsp">LogIn</a></li>
        <li><a href="polydetails.jsp">JoIn</a></li>
        <li class="active"><a href="index.jsp">Home</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <p>&nbsp;</p>
  <div align="center"><span class="style1">UPDATE VIEW </span>
  </div>
  <p>&nbsp;</p>
  <table width="95%" height="401" border="0">
    <tr>
      <td width="28%">T No </td>
      <td width="72%">
        <label>
          <input type="text" name="txttno" value="<%=tnumber%>" />
          </label>
           </td>
    </tr>
    <tr>
      <td>Poly Number</td>
      <td><input type="text" name="txtpolyno" value="<%=polynumber%>" /></td>
    </tr>
    <tr>
      <td>Poly Name </td>
      <td><input type="text" name="txtpolyname" value="<%=polyname%>"/></td>
    </tr>
    <tr>
      <td>Address</td>
      <td><input type="text" name="txtaddress" value="<%=address%>" /></td>
    </tr>
    <tr>
      <td height="42">Contact Number </td>
      <td><input type="text" name="txtcontactno" value="<%=contactnumber%>"/></td>
    </tr>
    <tr>
      <td>E mail Id </td>
      <td><input type="text" name="txtemailid" value="<%=emailid%>"/></td>
    </tr>
    <tr>
      <td>Principal Name </td>
      <td><input type="text" name="txtprincipalname" value="<%=principalname%>"/></td>
    </tr>
    <tr>
      <td>No Of Branches </td>
      <td><input type="text" name="txtbranch" value="<%=branch%>"/></td>
    </tr>
    <tr>
      <td>Total Staff </td>
      <td><input type="text" name="txttotalstaff" value="<%=totalstaff%>"/></td>
    </tr>
    <tr>
      <td>Total Students </td>
      <td><input type="text" name="txttotalstudents" value="<%=totalstudents%>"/></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>
        <label>
          <input type="submit" name="Submit" value="UPDATE" />
          </label>
      
      </td>
    </tr>
  </table>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3"></div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
  <div id="footer">
    <div class="footbox">
      <h2>Credits</h2>
      <ul>
        <li><a href="#">Developed by </a></li>
        <li>Divya V</li>
        <li>Farbeena N</li>
        <li>Jijisha k   </li>
      </ul>
    </div>
    <div class="footbox">
      <h2>Notification</h2>
      <ul>
        <li><a href="#">Time table scheme 2015 </a></li>
        <li>seating arrangement </li>
      </ul>S
      <ul>
        <li><a href="#"></a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col5">
  <div id="copyright">
    
    <p class="fl_right">AKNM GPTC THIRURANGADI </p>
  </div>
</div>
    </form>
</body>
</html>