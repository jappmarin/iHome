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

      out.write('\n');
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row justify-content-center my-3\">\n");
      out.write("        <div class=\"col-sm-12 col-md-8\" id=\"homestay\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3 class=\"card-header\">My Room</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <form action=\"AddRoom\" method=\"get\">\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"homestayIdDiv\">\n");
      out.write("                            <label for=\"homestayId\">Homestay ID</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"homestay_id\" id=\"homestayIdIn\" value=\"123\" disabled>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"homestayNameInDiv\">\n");
      out.write("                            <label for=\"homestayname\">ชื่อห้อง</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"room_name\" id=\"roomNameIn\" placeholder=\"\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"priceInDiv\">\n");
      out.write("                            <label for=\"price\">ราคาต่อคืน</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"room_price\" id=\"priceIn\" placeholder=\"\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group has-feedback\" id=\"guestInDiv\">\n");
      out.write("                            <label for=\"guest\">จำนวนผู้เข้าพักสูงสุด</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"room_limit\" id=\"limitIn\" placeholder=\"\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"facilities\"> สิ่งอำนวยความสะดวก </label>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"1\" > โทรทัศน์\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"23\" > โทรศัพท์บ้าน\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"26\" > ชุดโซฟา\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"6\" > ตู้เสื้อผ้า\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"27\" > โต๊ะเครื่องแป้ง\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"20\" > เตารีด\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"8\" > โคมไฟ\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"9\" > พัดลมตั้งโต๊ะ\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"10\" > พัดลมเพดาน\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"11\" > เครื่องปรับอากาศ\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"13\" > กาต้มน้ำร้อน\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"14\" > ไดร์เป่าผม\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"15\" > อินเทอร์เน็ต\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"16\" > คอมพิวเตอร์\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"19\" > ฝักบัว\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"18\" > เครื่องทำน้ำอุ่น\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"22\" > เตาอบไมโครเวฟ\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"2\" > ตู้เย็น\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"25\" > ครัว\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"21\" > ที่จอดรถ\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <label class=\"form-check-label\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" name=\"facilities\" id=\"tvIn\" value=\"24\" > จักรยาน\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"facilities\"> ประเภทเตียง :    </label>\n");
      out.write("                        <div class=\"form-check form-check-inline\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox1\" value=\"28\"> เตียงเดี่ยว\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check form-check-inline\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox2\" value=\"29\"> เตียงคู่\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check form-check-inline\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"30\"> เตียง 2 ชั้น\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check form-check-inline\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"31\" > ฟูกนอน\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check form-check-inline\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"32\"> เต็นท์\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check form-check-inline\">\n");
      out.write("                            <label class=\"form-check-label\">\n");
      out.write("                                <input class=\"form-check-input\" type=\"checkbox\" name=\"facilities\" id=\"inlineCheckbox3\" value=\"\"> อื่นๆ\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col text-center\">\n");
      out.write("                            <label for=\"guest\">อัพโหลดรูปภาพ</label>\n");
      out.write("                            <div class=\"form-group has-feedback\">\n");
      out.write("                                <label class=\"custom-file\">\n");
      out.write("                                    <input type=\"file\" id=\"file\" class=\"custom-file-input\">\n");
      out.write("                                    <span class=\"custom-file-control\"></span>\n");
      out.write("                                </label>\n");
      out.write("                                <small id=\"fileHelp\" class=\"form-text text-muted\">Upload .jpg, .png extensions only.</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"addHomestayButton\">Add Room</button>\n");
      out.write("                            <button class=\"btn btn-secondary btn-block\" id=\"addHomestayButton\">Cancel</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
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
