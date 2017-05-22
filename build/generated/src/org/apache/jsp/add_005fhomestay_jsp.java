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

      out.write('\n');
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center my-3\">\n");
      out.write("                <div class=\"col-sm-12 col-md-8\" id=\"homestay\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">My Homestay</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <form action=\"AddHomestay\" method=\"GET\">\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\n");
      out.write("                                    <label for=\"homestayname\">ชื่อโฮมสเตย์</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestay_name\" value=\"\" id=\"homestayNameIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"describeInDiv\">\n");
      out.write("                                    <label for=\"describe\">รายละเอียดโฮมสเตย์</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"describeIn\" rows=\"2\" name=\"homestay_desc\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"licenseInDiv\">\n");
      out.write("                                    <label for=\"license\">เลขที่ใบอนุญาตของโฮมสเตย์</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"licenseIn\" name=\"homestay_license\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"addressInDiv\">\n");
      out.write("                                    <label for=\"addresse\">ที่อยู่</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"addressIn\" rows=\"2\" name=\"homestay_address\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"districtInDiv\">\n");
      out.write("                                    <label for=\"district\">อำเภอ</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestay_district\" value=\"\" id=\"districtIn\" placeholder=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"provinceInDiv\">\n");
      out.write("                                    <label for=\"province\">จังหวัด</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"homestay_province\" id=\"provinceIn\" placeholder=\"\" required>\n");
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
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"homestay_region\" id=\"northIn\" value=\"N\" checked>\n");
      out.write("                                            ภาคเหนือ\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"homestay_region\" id=\"nothEastIn\" value=\"NE\">\n");
      out.write("                                            ภาคตะวันออกเฉียงเหนือ\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"homestay_region\" id=\"westIn\" value=\"W\">\n");
      out.write("                                            ภาคตะวันตก\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"homestay_region\" id=\"centralIn\" value=\"C\">\n");
      out.write("                                            ภาคกลาง\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"homestay_region\" id=\"eastIn\" value=\"E\">\n");
      out.write("                                            ภาคตะวันออก\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check form-check-inline\">\n");
      out.write("                                        <label class=\"form-check-label\">\n");
      out.write("                                            <input type=\"radio\" class=\"form-check-input\" name=\"homestay_region\" id=\"southIn\" value=\"S\">\n");
      out.write("                                            ภาคใต้\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"zipInDiv\">\n");
      out.write("                                    <label for=\"nearplace\">สถานที่ท่องเที่ยวใกล้เคียง</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nearplace1\" id=\"near1\" value=\"\" placeholder=\"\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nearplace2\" id=\"near2\" value=\"\" placeholder=\"\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nearplace3\" id=\"near3\" value=\"\" placeholder=\"\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nearplace4\" id=\"near4\" value=\"\" placeholder=\"\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nearplace5\" id=\"near5\" value=\"\" placeholder=\"\">\n");
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
