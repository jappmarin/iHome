package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Homestay;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row justify-content-center mt-5\">\r\n");
      out.write("        <div class=\"col-md-9\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <h3 class=\"card-header\">Control Panel</h3>\r\n");
      out.write("                <div class=\"card-block\">\r\n");
      out.write("                    <table class=\"table table-bordered text-center\" style=\"background-color: #fff\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th class=\"text-center\">#</th>\r\n");
      out.write("                                <th class=\"text-center\">Homestay Name</th>\r\n");
      out.write("                                <th class=\"text-center\">Homestay License</th>\r\n");
      out.write("                                <th class=\"text-center\">Status</th>\r\n");
      out.write("                                <th class=\"text-center\">Control</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
 ArrayList<Homestay> checkHome = (ArrayList<Homestay>) request.getAttribute("checkHome");
                                if (checkHome != null) {
                                    for (Homestay home : checkHome) {
                                        request.setAttribute("homestay_id", home.getHs_id());
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th scope=\"row\" class=\"text-center\">");
      out.print(home.getHs_id());
      out.write("</th>\r\n");
      out.write("                                <td>");
      out.print(home.getHs_name());
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(home.getHs_license());
      out.write("</td>\r\n");
      out.write("                                <td><button type=\"button\" class=\"btn btn-success\">Success</button></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"form-check\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"checkbox\" class=\"form-check-input\">\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
      }
                                }
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"signUpButton\">Save change</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
