package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-sm-12\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <h3 class=\"card-header\">Control Panel</h3>\r\n");
      out.write("                        <div class=\"card-block\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-12\">\r\n");
      out.write("                                    <table class=\"table\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>ID_HOMESTAY</th>\r\n");
      out.write("                                                <th>HOMESTAY_NAME</th>\r\n");
      out.write("                                                <th>HOMESTAY_DETAIL</th>\r\n");
      out.write("                                                <th>STATUS</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"row\">1</th>\r\n");
      out.write("                                                <td>Example 1</td>\r\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal1\">\r\n");
      out.write("                                                        View Detail\r\n");
      out.write("                                                    </button></td>\r\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-success\">Approve</button></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"row\">2</th>\r\n");
      out.write("                                                <td>Example 2</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal2\">\r\n");
      out.write("                                                        View Detail\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-success\">Approve</button></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"row\">3</th>\r\n");
      out.write("                                                <td>Example 3</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal3\">\r\n");
      out.write("                                                        View Detail\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-warning\">Pending</button>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
