package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.Review;
import model.Comment;
import java.util.ArrayList;
import model.Homestay;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write('\n');
      out.write('\n');
 Homestay homestay = (Homestay) request.getAttribute("homestay");
      out.write("\n");
      out.write("<div class=\"container my-2\">\n");
      out.write("    <div class=\"col-sm-8\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3 class=\"card-header\">");
      out.print(homestay.getHs_name());
      out.write("</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <img class=\"d-block\" style=\"height: 100%; width: 100%;\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-block\">\n");
      out.write("                                    <h4 class=\"card-title\">Homestay Detail</h4>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(homestay.getHs_desc());
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row justify-content-center my-2\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3 class=\"card-header\">ห้อง A ของ ");
      out.print(homestay.getHs_name());
      out.write("</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <img class=\"d-block\" style=\"height: 100%; width: 100%;\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-block\">\n");
      out.write("                                    <h4 class=\"card-title\">รายละเอียดห้องพัก</h4>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(homestay.getHs_desc());
      out.write("</p>\n");
      out.write("                                    <h4 class=\"card-title\">ราคาต่อคืน</h4>\n");
      out.write("                                    <p class=\"card-text\">100 บาท</p>\n");
      out.write("                                    <h4 class=\"card-title\">จำนวนผู้เข้าพัก</h4>\n");
      out.write("                                    <div class=\"form-inline\">\n");
      out.write("                                        <button class=\"btn btn-primary btn-sm mr-2 ml-2 mb-3\" onclick=\"removeGuest();\">-</button>\n");
      out.write("                                        <input class=\"form-control mr-2 ml-2 mb-3\" style=\"width: 45px;\" type=\"text\" id=\"guest\" name=\"guest\" value=\"1\">\n");
      out.write("                                        <button class=\"btn btn-primary btn-sm mr-2 ml-2 mb-3    \" onclick=\"addGuest();\">+</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <script>\n");
      out.write("                                        var i = 1;\n");
      out.write("                                        function addGuest() {\n");
      out.write("                                            if (i >= 1 & i < 10) {\n");
      out.write("                                                i++;\n");
      out.write("                                                document.getElementById(\"guest\").value = i;\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
      out.write("                                        function removeGuest() {\n");
      out.write("                                            if (i > 1 & i <= 10) {\n");
      out.write("                                                i--;\n");
      out.write("                                                document.getElementById(\"guest\").value = i;\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
      out.write("                                    </script>\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Booking/?id=\" class=\"btn btn-primary btn-lg\">Booking</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row justify-content-center my-2\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3 class=\"card-header\">ห้อง B ของ ");
      out.print(homestay.getHs_name());
      out.write("</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <img class=\"d-block\" style=\"height: 100%; width: 100%;\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-block\">\n");
      out.write("                                    <h4 class=\"card-title\">รายละเอียดห้องพัก</h4>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(homestay.getHs_desc());
      out.write("</p>\n");
      out.write("                                    <h4 class=\"card-title\">ราคาต่อคืน</h4>\n");
      out.write("                                    <p class=\"card-text\">100 บาท</p>\n");
      out.write("                                    <h4 class=\"card-title\">จำนวนผู้เข้าพัก</h4>\n");
      out.write("                                    <div class=\"form-inline\">\n");
      out.write("                                        <button class=\"btn btn-primary btn-sm mr-2 ml-2 mb-3\" onclick=\"removeGuest2();\">-</button>\n");
      out.write("                                        <input class=\"form-control mr-2 ml-2 mb-3\" style=\"width: 45px;\" type=\"text\" id=\"guest2\" name=\"guest\" value=\"1\">\n");
      out.write("                                        <button class=\"btn btn-primary btn-sm mr-2 ml-2 mb-3    \" onclick=\"addGuest2();\">+</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <script>\n");
      out.write("                                        var i2 = 1;\n");
      out.write("                                        function addGuest2() {\n");
      out.write("                                            if (i2 >= 1 & i2 < 10) {\n");
      out.write("                                                i2++;\n");
      out.write("                                                document.getElementById(\"guest2\").value = i2;\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
      out.write("                                        function removeGuest2() {\n");
      out.write("                                            if (i2 > 1 & i2 <= 10) {\n");
      out.write("                                                i2--;\n");
      out.write("                                                document.getElementById(\"guest2\").value = i2;\n");
      out.write("                                            }\n");
      out.write("                                        }\n");
      out.write("                                    </script>\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Booking/?id=\" class=\"btn btn-primary btn-lg\">Booking</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"card mt-3 mb-3\">\n");
      out.write("                <h3 class=\"card-header\">Comment</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        ");
 if (request.getAttribute("allComment") != null) { 
      out.write("\n");
      out.write("                        ");
 ArrayList<Comment> allComment = (ArrayList<Comment>) request.getAttribute("allComment");
                        for (model.Comment comment : allComment) {
      out.write("\n");
      out.write("                        <li class=\"media\">\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5 class=\"mt-0 mb-1\">");
      out.print(comment.getFirstname());
      out.write(' ');
      out.print(comment.getLastname());
      out.write("</h5>\n");
      out.write("                                <p>");
      out.print(comment.getText());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <hr>\n");
      out.write("                        ");
 }
                        }
      out.write("\n");
      out.write("                        <li class=\"media\">\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Review/?&id=");
      out.print(homestay.getHs_id());
      out.write("\" method=\"POST\">\n");
      out.write("                                    <textarea name=\"comment\" rows=\"3\" style=\"width: 100%; margin-top: 10px; margin-bottom: 10px;\"></textarea>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success btn-lg\">Comment</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
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
