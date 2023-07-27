package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/head.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");
      out.write("\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" />\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>BIG BETTER STRONGER</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"script.js\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</head>");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">BB<span>S</span></div>\n");
      out.write("            <div class=\"open\">\n");
      out.write("                <i class=\"bi-list\"></i>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"links\">\n");
      out.write("                <li><a href=\"Home.jsp\" class=\"active\">Home</a></li>\n");
      out.write("                <li><a href=\"User.jsp\" >User</a></li>\n");
      out.write("                <li><a href=\"Admin.jsp\" >Admin</a></li>\n");
      out.write("                <li><a href=\"userlogin.jsp\" >UserLogin</a></li>\n");
      out.write("                      <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("<!--                <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                <li><a href=\"Services.jsp\">Services</a></li>\n");
      out.write("                <li><a href=\"Trainers.jsp\">Trainers</a></li>\n");
      out.write("                <li><a href=\"Plans.jsp\">Plans</a></li>-->\n");
      out.write("                <!--<li><a href=\"Register.jsp\">Register</a></li>\n");
      out.write("                -->\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h1>Fitness gym</h1>\n");
      out.write("            <button class=\"btn\">Get Started</button>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("<footer>\n");
      out.write("    <h1>&copy For Support:Contact-7770833453</h1>\n");
      out.write("</footer> \n");
      out.write("</body>\n");
      out.write("\n");
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
