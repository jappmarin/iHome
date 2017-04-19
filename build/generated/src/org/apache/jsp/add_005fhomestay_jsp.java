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
      out.write("                            <form action=\"AddHomestay\" method=\"POST\">\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\r\n");
      out.write("                                    <label for=\"homestayname\">ชื่อโฮมสเตย์</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestayname\" id=\"homestayNameIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"describeInDiv\">\r\n");
      out.write("                                    <label for=\"describe\">รายละเอียดโฮมสเตย์</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" id=\"describeIn\" rows=\"2\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"priceInDiv\">\r\n");
      out.write("                                    <label for=\"price\">ราคาต่อคืน</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"price\" id=\"priceIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"guestInDiv\">\r\n");
      out.write("                                    <label for=\"guest\">จำนวนผู้เข้าพัก</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"guest\" id=\"guestIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"addressInDiv\">\r\n");
      out.write("                                    <label for=\"addresse\">ที่อยู่</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" id=\"addressIn\" rows=\"2\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"districtInDiv\">\r\n");
      out.write("                                    <label for=\"district\">อำเภอ</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"district\" id=\"districtIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"provinceInDiv\">\r\n");
      out.write("                                    <label for=\"province\">จังหวัด</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"province\" id=\"provinceIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"zipInDiv\">\r\n");
      out.write("                                    <label for=\"zip\">รหัสไปรษณีย์</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"zip\" id=\"zipIn\" placeholder=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <fieldset class=\"form-group\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>ภูมิภาค</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"northIn\" value=\"North\" checked>\r\n");
      out.write("                                            ภาคเหนือ\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"nothEastIn\" value=\"NorthEast\">\r\n");
      out.write("                                            ภาคตะวันออกเฉียงเหนือ\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"westIn\" value=\"West\">\r\n");
      out.write("                                            ภาคตะวันตก\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"centralIn\" value=\"Central\">\r\n");
      out.write("                                            ภาคกลาง\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"eastIn\" value=\"East\">\r\n");
      out.write("                                            ภาคตะวันออก\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\r\n");
      out.write("                                        <label class=\"form-check-label\">\r\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"southIn\" value=\"South\">\r\n");
      out.write("                                            ภาคใต้\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                                <label for=\"guest\">อัพโหลดรูปภาพ</label>\r\n");
      out.write("                                <div class=\"form-group has-feedback\">\r\n");
      out.write("                                    <label class=\"custom-file\">\r\n");
      out.write("                                        <input type=\"file\" id=\"file\" class=\"custom-file-input\">\r\n");
      out.write("                                        <span class=\"custom-file-control\"></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <small id=\"fileHelp\" class=\"form-text text-muted\">Upload .jpg, .png extensions only.</small>\r\n");
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
      out.write("                                    <button class=\"btn btn-secondary btn-block\" id=\"addHomestayButton\">Cancel</button>\r\n");
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
