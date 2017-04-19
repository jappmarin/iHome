package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fhomestay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\r\n");
      out.write("                <div class=\"col-sm-12 col-md-8\" id=\"homestay\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <h3 class=\"card-header\">My Homestay</h3>\r\n");
      out.write("                        <div class=\"card-block\">\r\n");
      out.write("                            <form action=\"EditHomestay\" method=\"POST\">\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\r\n");
      out.write("                                    <label for=\"homestayname\">Homestay Name</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestayname\" id=\"homestayNameIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"detailInDiv\">\r\n");
      out.write("                                    <label for=\"detail\">Homestay Detail</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" name=\"detail\" id=\"detailIn\" rows=\"3\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"priceInDiv\">\r\n");
      out.write("                                    <label for=\"price\">Price</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"price\" id=\"priceIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"guestInDiv\">\r\n");
      out.write("                                    <label for=\"guest\">Guest</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"guest\" id=\"guestIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"addressInDiv\">\r\n");
      out.write("                                    <label for=\"address\">Homestay Address</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" name=\"address\" id=\"addressIn\" rows=\"3\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"addressInDiv\">\r\n");
      out.write("                                    <label for=\"art-file\">Upload Picture</label>\r\n");
      out.write("                                    <input type=\"file\" id=\"art-file\" name=\"picture\">\r\n");
      out.write("                                    <p class=\"help-block\">Upload .jpg, .png extensions only.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"latitudeInDiv\">\r\n");
      out.write("                                    <label for=\"latitude\">Latitude</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"latitude\" id=\"latitudeIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"longtitudeInDiv\">\r\n");
      out.write("                                    <label for=\"longtitude\">Longtitude</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"longtitude\" id=\"longtitudeIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-center\">\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"addHomestayButton\">Add Homestay</button>\r\n");
      out.write("                                    <button class=\"btn btn-secondary btn-block\" id=\"cancelAddHomestayButton\">Cancel</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
