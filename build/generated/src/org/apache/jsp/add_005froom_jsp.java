package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005froom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row justify-content-center mt-5\">\r\n");
      out.write("        <div class=\"col-sm-12 col-md-8\" id=\"homestay\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <h3 class=\"card-header\">My Room</h3>\r\n");
      out.write("                <div class=\"card-block\">\r\n");
      out.write("                    <form action=\"AddRoom\" method=\"get\">\r\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\r\n");
      out.write("                            <label for=\"homestayname\">ชื่อห้อง</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"room_name\" id=\"roomNameIn\" placeholder=\"\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"priceInDiv\">\r\n");
      out.write("                            <label for=\"price\">ราคาต่อคืน</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"room_price\" id=\"priceIn\" placeholder=\"\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"guestInDiv\">\r\n");
      out.write("                            <label for=\"guest\">จำนวนผู้เข้าพักสูงสุด</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"room_limit\" id=\"limitIn\" placeholder=\"\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <label for=\"facilities\"> สิ่งอำนวยความสะดวก </label>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"1\" > โทรทัศน์\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"23\" > โทรศัพท์บ้าน\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"26\" > ชุดโซฟา\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"6\" > ตู้เสื้อผ้า\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"27\" > โต๊ะเครื่องแป้ง\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"20\" > เตารีด\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"8\" > โคมไฟ\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"9\" > พัดลมตั้งโต๊ะ\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"10\" > พัดลมเพดาน\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"11\" > เครื่องปรับอากาศ\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"13\" > กาต้มน้ำร้อน\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"14\" > ไดร์เป่าผม\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"15\" > อินเทอร์เน็ต\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"16\" > คอมพิวเตอร์\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"19\" > ฝักบัว\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"18\" > เครื่องทำน้ำอุ่น\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"22\" > เตาอบไมโครเวฟ\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"2\" > ตู้เย็น\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"25\" > ครัว\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"21\" > ที่จอดรถ\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-check\">\r\n");
      out.write("                                    <label class=\"form-check-label\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"24\" > จักรยาน\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <label for=\"facilities\"> ประเภทเตียง :    </label>\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                            <label class=\"form-check-label\">\r\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox1\" value=\"28\"> เตียงเดี่ยว\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                            <label class=\"form-check-label\">\r\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox2\" value=\"29\"> เตียงคู่\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                            <label class=\"form-check-label\">\r\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"30\"> เตียง 2 ชั้น\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                            <label class=\"form-check-label\">\r\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"31\" > ฝูกนอน\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                            <label class=\"form-check-label\">\r\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"32\"> เต็นท์\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");
      out.write("                            <label class=\"form-check-label\">\r\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"\"> อื่นๆ\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col text-center\">\r\n");
      out.write("                            <label for=\"guest\">อัพโหลดรูปภาพ</label>\r\n");
      out.write("                            <div class=\"form-group has-feedback\">\r\n");
      out.write("                                <label class=\"custom-file\">\r\n");
      out.write("                                    <input type=\"file\" id=\"file\" class=\"custom-file-input\">\r\n");
      out.write("                                    <span class=\"custom-file-control\"></span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <small id=\"fileHelp\" class=\"form-text text-muted\">Upload .jpg, .png extensions only.</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"addHomestayButton\">Add Room</button>\r\n");
      out.write("                            <button class=\"btn btn-secondary btn-block\" id=\"addHomestayButton\">Cancel</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
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
