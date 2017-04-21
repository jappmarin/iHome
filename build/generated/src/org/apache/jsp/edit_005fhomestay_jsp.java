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

      out.write('\n');
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\n");
      out.write("                <div class=\"col-sm-12 col-md-8\" id=\"homestay\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">My Homestay</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <form action=\"EditHomestay\" method=\"POST\">\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\n");
      out.write("                                    <label for=\"homestayname\">ชื่อโฮมสเตย์</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestayname\" id=\"homestayNameIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"describeInDiv\">\n");
      out.write("                                    <label for=\"describe\">รายละเอียดโฮมสเตย์</label>\n");
      out.write("                                    <textarea class=\"form-control\" id=\"describeIn\" rows=\"2\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"licenseInDiv\">\n");
      out.write("                                    <label for=\"license\">เลขที่ใบอนุญาตของโฮมสเตย์</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"licenseIn\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"addressInDiv\">\n");
      out.write("                                    <label for=\"addresse\">ที่อยู่</label>\n");
      out.write("                                    <textarea class=\"form-control\" id=\"addressIn\" rows=\"2\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"districtInDiv\">\n");
      out.write("                                    <label for=\"district\">อำเภอ</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"district\" id=\"districtIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"provinceInDiv\">\n");
      out.write("                                    <label for=\"province\">จังหวัด</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"province\" id=\"provinceIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"zipInDiv\">\n");
      out.write("                                    <label for=\"zip\">รหัสไปรษณีย์</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"zip\" id=\"zipIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <fieldset class=\"form-group\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>ภูมิภาค</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"northIn\" value=\"North\" checked>\n");
      out.write("                                            ภาคเหนือ\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"nothEastIn\" value=\"NorthEast\">\n");
      out.write("                                            ภาคตะวันออกเฉียงเหนือ\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"westIn\" value=\"West\">\n");
      out.write("                                            ภาคตะวันตก\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"centralIn\" value=\"Central\">\n");
      out.write("                                            ภาคกลาง\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"eastIn\" value=\"East\">\n");
      out.write("                                            ภาคตะวันออก\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"optionsRadios\" id=\"southIn\" value=\"South\">\n");
      out.write("                                            ภาคใต้\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                                <label for=\"guest\">อัพโหลดรูปภาพ</label>\n");
      out.write("                                <div class=\"form-group has-feedback\">\n");
      out.write("                                    <label class=\"custom-file\">\n");
      out.write("                                        <input type=\"file\" id=\"file\" class=\"custom-file-input\">\n");
      out.write("                                        <span class=\"custom-file-control\"></span>\n");
      out.write("                                    </label>\n");
      out.write("                                    <small id=\"fileHelp\" class=\"form-text text-muted\">Upload .jpg, .png extensions only.</small>\n");
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
