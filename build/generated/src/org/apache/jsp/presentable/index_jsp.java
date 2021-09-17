package org.apache.jsp.presentable;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<!--\r\n");
      out.write("Template Name: Presentable\r\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\r\n");
      out.write("Author URI: http://www.os-templates.com/\r\n");
      out.write("Licence: Free to use under our free template licence terms\r\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Presentable</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/jquery.innerfade.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("<div class=\"wrapper col1\">\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("      <h1><a href=\"index.html\">P</a><a href=\"index.html\">OLY STUDENT EXAM MANAGEMENT </a></h1>\r\n");
      out.write("      <p>BE TECHNICAL</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"search\">\r\n");
      out.write("      <form action=\"#\" method=\"post\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("          <legend>Site Search</legend>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"topnav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"last\"><a href=\"#\">Time Table </a></li>\r\n");
      out.write("        <li><a href=\"login_1.jsp\">ViewIn</a>\r\n");
      out.write("         \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"login_1.jsp\">LogIn</a></li>\r\n");
      out.write("        <li><a href=\"polydetails.jsp\">JoIn</a></li>\r\n");
      out.write("\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("        <li class=\"active\"></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br class=\"clear\" />\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ####################################################################################################### -->\r\n");
      out.write("<div class=\"wrapper col2\">\r\n");
      out.write("  <div id=\"intro\">\r\n");
      out.write("    <div class=\"fl_left\">\r\n");
      out.write("      <h1>Polytechnics in Kerala</h1>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("          <h2>About</h2>\r\n");
      out.write("          <p>* Diploma admission in kerala is faciliated by the department of technical education. </p>\r\n");
      out.write("          <p>* Admission is conducted for total 43 government polytechnic 06 government aided polytechnic and 10 self financing polytechnic in the state. </p>\r\n");
      out.write("          <p>* DTE kerala identifies 29 diploma programmes into two seperate streams diploma in engineering/Technology and diploma in commercial practice management </p>\r\n");
      out.write("          <p class=\"readmore\"><a href=\"#\"></a></p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"last\">\r\n");
      out.write("          <h2>&nbsp;</h2>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"last\">* All diploma programmers are of six semesters spanning a period of 3 year.</li>\r\n");
      out.write("        <li class=\"last\"></li>\r\n");
      out.write("        <li class=\"last\">*All semesters contain more than eight subjects</li>\r\n");
      out.write("        <li class=\"last\"></li>\r\n");
      out.write("        <li class=\"last\">*This software perticularly for the polytechnic colleges to  arrange students seating, external and time table management </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("    <img src=\"images/demo/slide-1.jpg\" alt=\"slide-1\" width=\"445\" height=\"321\" /><br class=\"clear\" />\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ####################################################################################################### -->\r\n");
      out.write("<div class=\"wrapper col3\">\r\n");
      out.write("  <div id=\"container\">\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ####################################################################################################### -->\r\n");
      out.write("<div class=\"wrapper col4\">\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("    <div class=\"footbox\">\r\n");
      out.write("      <h2>Credits</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\">Developed by </a></li>\r\n");
      out.write("        <li>Divya V</li>\r\n");
      out.write("        <li>Farbeena N</li>\r\n");
      out.write("        <li>Jijisha k   </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footbox\">\r\n");
      out.write("      <h2>Notification</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\">Time table scheme 2015 </a></li>\r\n");
      out.write("        <li>seating arrangement </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"#\"></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    s<br class=\"clear\" />\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ####################################################################################################### -->\r\n");
      out.write("<div class=\"wrapper col5\">\r\n");
      out.write("  <div id=\"copyright\">\r\n");
      out.write("    \r\n");
      out.write("    <p class=\"fl_right\">AKNM GPTC THIRURANGADI </p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
