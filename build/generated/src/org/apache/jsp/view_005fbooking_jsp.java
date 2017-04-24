package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Homestay;

public final class view_005fbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row justify-content-center mt-5\">\n");
      out.write("        <div class=\"col-md-9\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3 class=\"card-header\">View Booking</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <table class=\"table table-bordered text-center\" style=\"background-color: #fff\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"text-center\">#</th>\n");
      out.write("                                <th class=\"text-center\">Homestay Name</th>\n");
      out.write("                                <th class=\"text-center\">Homestay License</th>\n");
      out.write("                                <th class=\"text-center\">Status</th>\n");
      out.write("                                <th class=\"text-center\">Control</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 ArrayList<Homestay> noHome = (ArrayList<Homestay>) request.getAttribute("noHome");
                                if (noHome != null) {
                                    for (Homestay home : noHome) {
                                        request.setAttribute("homestay_id", home.getHs_id());
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\" class=\"text-center\">");
      out.print(home.getHs_id());
      out.write("</th>\n");
      out.write("                                <td>");
      out.print(home.getHs_name());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(home.getHs_license());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
      }
                                    }
      out.write("\n");
      out.write("                            ");
 ArrayList<Homestay> yesHome = (ArrayList<Homestay>) request.getAttribute("yesHome");
                                        if (noHome != null) {
                                            for (Homestay home : yesHome) {
                                                request.setAttribute("homestay_id", home.getHs_id());
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"row\" class=\"text-center\">");
      out.print(home.getHs_id());
      out.write("</th>\n");
      out.write("                                <td>");
      out.print(home.getHs_name());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(home.getHs_license());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
      }
                                    }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>                  \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"signUpButton\">Save change</button>                        \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
