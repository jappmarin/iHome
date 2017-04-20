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

      out.write("\n");
      out.write("\n");
      out.write("\n");
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write("\n");
      out.write("        <div class=\"container mt-5\">   \n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"card mt-2\">\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <form action=\"Search\" method=\"POST\">\n");
      out.write("                                <h5 class=\"card-title\">Search results for:</h5>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <input class=\"form-control\" type=\"search\" value=\"eg. Bangkok, Chaingmai\" id=\"example-search-input\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                <h6 class=\"card-title\">ภูมิภาค</h6>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                        <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                        <span class=\"custom-control-description\">ภาคเหนือ</span>\n");
      out.write("                                    </label>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                        <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                        <span class=\"custom-control-description\">ภาคกลาง</span>\n");
      out.write("                                    </label>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                        <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                        <span class=\"custom-control-description\">ภาคตะวันออก</span>\n");
      out.write("                                    </label>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                        <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                        <span class=\"custom-control-description\">ภาคตะวันออกเฉียงเหนือ</span>\n");
      out.write("                                    </label>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                        <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                        <span class=\"custom-control-description\">ภาคตะวันตก</span>\n");
      out.write("                                    </label>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                    <label class=\"custom-control custom-checkbox\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                                        <span class=\"custom-control-indicator\"></span>\n");
      out.write("                                        <span class=\"custom-control-description\">ภาคใต้</span>\n");
      out.write("                                    </label>\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                <h6 class=\"card-title\">Price</h6>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                <div class=\"form-group row mx-auto align-items-center\">\n");
      out.write("                                    Lowest Price\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <input class=\"form-control\" type=\"number\" value=\"400\" id=\"lowestPriceIn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row mx-auto align-items-center\">\n");
      out.write("                                    Highest Price\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <input class=\"form-control\" type=\"number\" value=\"2000\" id=\"highestPriceIn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                <h6 class=\"card-title\">Date</h6>\n");
      out.write("                                <p class=\"card-text\">\n");
      out.write("                                <div class=\"form-group row mx-auto align-items-center\">\n");
      out.write("                                    Check in\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" value=\"\" id=\"checkinIn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row mx-auto align-items-center\">\n");
      out.write("                                    Check out\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <input class=\"form-control\" type=\"date\" value=\"\" id=\"checkoutIn\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                </p>\n");
      out.write("                                <hr>\n");
      out.write("                                \n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    ");
 ArrayList<Homestay> allHome = (ArrayList<Homestay>) request.getAttribute("allHome");
                        if (allHome != null) {
                            for (Homestay home : allHome) {
      out.write("\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <div class=\"card text-center mt-2\">\n");
      out.write("                                        <img class=\"card-img-top\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/asset/img/logo.png\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <h4 class=\"card-title\">");
      out.print(home.getHs_name());
      out.write("</h4>\n");
      out.write("                                            <p class=\"card-text\">");
      out.print(home.getHs_desc());
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-footer\">\n");
      out.write("                                            <a class=\"btn btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SITE_URL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ViewHomestay/?id=");
      out.print(home.getHs_id());
      out.write("\">See more</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                    ");
      }
                        }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/footer.jsp", out, false);
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
