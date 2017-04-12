package org.apache.jsp;

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
<<<<<<< HEAD
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row justify-content-center mt-5\">\r\n");
      out.write("        <div class=\"col-sm-6\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-block\">\r\n");
      out.write("                    <div class=\"row justify-content-center mt-5 mb-4\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <h2 class=\"text-center\">Where would you like to stay?</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"search\" aria-describedby=\"search\" placeholder=\"eg. Samut Prakan, Bangkok, Chaingmai\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row justify-content-center mt-2 mb-5\">\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <a class=\"btn btn-primary btn-lg\" href=\"search.html\">Search</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
=======
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row justify-content-center mt-5\">\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <div class=\"row justify-content-center mt-5 mb-4\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <h2 class=\"text-center\">Where would you like to stay?</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"search\" aria-describedby=\"search\" placeholder=\"eg. Samut Prakan, Bangkok, Chaingmai\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row justify-content-center mt-2 mb-5\">\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <a class=\"btn btn-primary btn-lg\" href=\"search.html\">Search</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
>>>>>>> origin/master
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/modal.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/footer.jsp", out, false);
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
