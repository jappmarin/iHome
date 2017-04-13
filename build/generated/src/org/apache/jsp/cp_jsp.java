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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Control Panel</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>ID_HOMESTAY</th>\n");
      out.write("                                                <th>HOMESTAY_NAME</th>\n");
      out.write("                                                <th>HOMESTAY_DETAIL</th>\n");
      out.write("                                                <th>STATUS</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"row\">1</th>\n");
      out.write("                                                <td>Example 1</td>\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal1\">\n");
      out.write("                                                        View Detail\n");
      out.write("                                                    </button></td>\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-success\">Approve</button></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"row\">2</th>\n");
      out.write("                                                <td>Example 2</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal2\">\n");
      out.write("                                                        View Detail\n");
      out.write("                                                    </button>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-success\">Approve</button></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th scope=\"row\">3</th>\n");
      out.write("                                                <td>Example 3</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal3\">\n");
      out.write("                                                        View Detail\n");
      out.write("                                                    </button>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td><button type=\"button\" class=\"btn btn-warning\">Pending</button>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/modal.jsp", out, false);
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
