package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_005fprint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-5\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Booking Number - #00001</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <p class=\"card-text\">Booking Number : <small class=\"text-muted\">00001</small></p>\n");
      out.write("                            <p class=\"card-text\">Pincode : <small class=\"text-muted\">1234</small></p>\n");
      out.write("                            <p class=\"card-text\">Name : <small class=\"text-muted\">Teerawut Kitbunjerdjarud</small></p>\n");
      out.write("                            <p class=\"card-text\">Phone Number : <small class=\"text-muted\">055-555-555</small></p>\n");
      out.write("                            <p class=\"card-text\">Email : <small class=\"text-muted\">example@example.com</small></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-7\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Booking Detail</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <p class=\"card-text\">Homestay Name : <small class=\"text-muted\">Example 1</small></p>\n");
      out.write("                            <p class=\"card-text\">Booking Detail : <small class=\"text-muted\">2 nights, 1 Room, 2 People</small></p>\n");
      out.write("                            <p class=\"card-text\">Checkin : <small class=\"text-muted\">31/03/2017</small></p>\n");
      out.write("                            <p class=\"card-text\">Checkout : <small class=\"text-muted\">02/04/2017</small></p>\n");
      out.write("                            <p class=\"card-text\">Room Price : <small class=\"text-muted\">3000 THB</small></p>\n");
      out.write("                            <p class=\"card-text\">Contact : <small class=\"text-muted\">012-345-678</small></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row mt-4\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div id=\"map\" style=\"height:400px\"></div>\n");
      out.write("                    <script>\n");
      out.write("                        function initMap() {\n");
      out.write("                            var uluru = {lat: 13.730994, lng: 100.781260};\n");
      out.write("                            var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("                                zoom: 17,\n");
      out.write("                                center: uluru\n");
      out.write("                            });\n");
      out.write("                            var marker = new google.maps.Marker({\n");
      out.write("                                position: uluru,\n");
      out.write("                                map: map\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\n");
      out.write("                <div class=\"col-1\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary btn-lg\">Print</button>\n");
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
