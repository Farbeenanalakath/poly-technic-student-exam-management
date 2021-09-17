<%@page import="polydetails.PolyHandler"%>
<%@page import="java.sql.ResultSet"%>
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
    <form id="form1" name="form1" method="post" action="update_view.jsp">
        <%!
String strStudentID,strStudentName,strResult;
         
ResultSet rsData;
%>
        <%
PolyHandler lh1=new PolyHandler();
try
{
rsData=lh1.getid();

}
catch(Exception e)
{
System.out.println(e.getMessage());
}%>

    
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
  <div align="left"><span class="style1">UPDATE </span> </div>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  
    <label>
    <select name="sltPolyID" id="sltStudentID">
         <%
						   try
						        {
						        	if(rsData!=null)
						        	{
						        			while(rsData.next())
						        		{
						        				
						        				strStudentID= rsData.getString("poly_no");
						        								        		
						        	
						        			%>
                                                                                                          <option ><%=strStudentID %></option>
 <%
                       
						        		} 
        		 
        }
       }
        catch(Exception e)
        {
        	
         	System.out.println("[update_view.jsp ]"+e.getMessage());
        }
        %>
    </select>
    </label>
    <label>
    <input type="submit" name="Submit" value="UPDATE" />
    </label>
  
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
      </ul>
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