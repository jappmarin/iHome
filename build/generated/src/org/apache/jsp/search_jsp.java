package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Homestay;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\r\n");
      out.write("<div class=\"container mt-5\">   \r\n");
      out.write("    <div class=\"row justify-content-center\">\r\n");
      out.write("        <div class=\"col-sm-3\">\r\n");
      out.write("            <div class=\"card mt-2\">\r\n");
      out.write("                <div class=\"card-block\">\r\n");
      out.write("                    <form action=\"Search\" method=\"GET\">\r\n");
      out.write("                        <h5 class=\"card-title\">Search results for:</h5>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                        <div class=\"form-group row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"search\" name=\"search\" value=\"");
      out.print(request.getParameter("search"));
      out.write("\" id=\"search\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <h6 class=\"card-title\">ภูมิภาค</h6>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" name=\"region\" value=\"N\">\r\n");
      out.write("                                <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                <span class=\"custom-control-description\">ภาคเหนือ</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" name=\"region\" value=\"C\">\r\n");
      out.write("                                <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                <span class=\"custom-control-description\">ภาคกลาง</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            <label class=\"custom-control custom-checkbox\" >\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" name=\"region\" value=\"E\">\r\n");
      out.write("                                <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                <span class=\"custom-control-description\">ภาคตะวันออก</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            <label class=\"custom-control custom-checkbox\" >\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" name=\"region\" value=\"NE\">\r\n");
      out.write("                                <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                <span class=\"custom-control-description\">ภาคตะวันออกเฉียงเหนือ</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" name=\"region\" value=\"W\">\r\n");
      out.write("                                <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                <span class=\"custom-control-description\">ภาคตะวันตก</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"custom-control-input\" name=\"region\" value=\"S\">\r\n");
      out.write("                                <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                <span class=\"custom-control-description\">ภาคใต้</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <h6 class=\"card-title\">Price</h6>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                        <div class=\"form-group row mx-auto align-items-center\">\r\n");
      out.write("                            Lowest Price\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"number\" name=\"min_price\" value=\"");
      out.print(request.getParameter("min_price"));
      out.write("\" id=\"lowestPriceIn\" placeholder=\"200\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group row mx-auto align-items-center\">\r\n");
      out.write("                            Highest Price\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"number\" name=\"max_price\" value=\"");
      out.print(request.getParameter("max_price"));
      out.write("\" id=\"highestPriceIn\" placeholder=\"1500\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <h6 class=\"card-title\">Date</h6>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                        <div class=\"form-group row mx-auto align-items-center\">\r\n");
      out.write("                            Check in\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"date\" name=\"c_in\" value=\"");
      out.print( request.getParameter("c_in"));
      out.write("\" id=\"checkinIn\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group row mx-auto align-items-center\">\r\n");
      out.write("                            Check out\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <input class=\"form-control\" type=\"date\" name=\"c_out\" value=\"");
      out.print( request.getParameter("c_in"));
      out.write("\" id=\"checkoutIn\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <hr>\r\n");
      out.write("\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-block\">Search</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9\">\r\n");
      out.write("            <div class=\"row\">               \r\n");
      out.write("                ");
 ArrayList<Homestay> allHome = (ArrayList<Homestay>) request.getAttribute("allHome");
                    if (allHome != null) {
                        for (Homestay home : allHome) {
                            request.setAttribute("homestay_id", home.getHs_id());
      out.write("\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <div class=\"card text-center mt-2\">\r\n");
      out.write("                        <img class=\"card-img-top\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/asset/img/logo.png\">\r\n");
      out.write("                        <div class=\"card-block\">\r\n");
      out.write("                            <h4 class=\"card-title\">");
      out.print(home.getHs_name());
      out.write("</h4>\r\n");
      out.write("                            <p class=\"card-text\">");
      out.print(home.getHs_desc());
      out.write("</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-footer\">\r\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ViewHomestay/?id=");
      out.print(home.getHs_id());
      out.write("\" >See more</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      }
                    }
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
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
