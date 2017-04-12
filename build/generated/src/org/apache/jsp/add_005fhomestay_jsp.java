package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fhomestay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\n");
      out.write("                <div class=\"col-sm-4 col-md-8\" id=\"homestay\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">My Homestay</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <form action=\"/Homestay\" method=\"POST\">\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\n");
      out.write("                                    <label for=\"homestayname\">Homestay Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestayname\" id=\"homestayNameIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"priceInDiv\">\n");
      out.write("                                    <label for=\"price\">Price</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"price\" id=\"priceIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"guestInDiv\">\n");
      out.write("                                    <label for=\"guest\">Guest</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"guest\" id=\"guestIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"addressInDiv\">\n");
      out.write("                                    <label for=\"address\">Homestay Address</label>\n");
      out.write("                                    <textarea class=\"form-control\" name=\"address\" id=\"addressIn\" rows=\"3\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"latitudeInDiv\">\n");
      out.write("                                    <label for=\"latitude\">Latitude</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"latitude\" id=\"latitudeIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"longtitudeInDiv\">\n");
      out.write("                                    <label for=\"longtitude\">Longtitude</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"longtitude\" id=\"longtitudeIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"addHomestayButton\">Add Homestay</button>\n");
      out.write("                                    <button class=\"btn btn-secondary btn-block\" id=\"addHomestayButton\">Cancel</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
