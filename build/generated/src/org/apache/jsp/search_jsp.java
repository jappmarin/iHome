package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"container mt-5\">   \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-3\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <div class=\"card-block\">\r\n");
      out.write("                            <h5 class=\"card-title\">Search within results</h5>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <h6 class=\"card-title\">Search results for:</h6>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                            <div class=\"form-group row\">\r\n");
      out.write("                                <div class=\"col-12\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"search\" value=\"eg. Bangkok, Chaingmai\" id=\"example-search-input\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <h6 class=\"card-title\">Accommodation type</h6>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\">\r\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                    <span class=\"custom-control-description\">Resort</span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\">\r\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                    <span class=\"custom-control-description\">Hotel</span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\">\r\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                    <span class=\"custom-control-description\">Guest House / Bed & Breakfast</span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <h6 class=\"card-title\">Accommodation type</h6>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                            <div class=\"form-group row mx-auto align-items-center\">\r\n");
      out.write("                                Lowest Price\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" value=\"400\" id=\"example-number-input\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group row mx-auto align-items-center\">\r\n");
      out.write("                                Highest Price\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"number\" value=\"2000\" id=\"example-number-input\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <h6 class=\"card-title\">Facilities</h6>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\">\r\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                    <span class=\"custom-control-description\">Swimming Pool</span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\">\r\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                    <span class=\"custom-control-description\">Internet</span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"card-text\">\r\n");
      out.write("                                <label class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                    <input type=\"checkbox\" class=\"custom-control-input\">\r\n");
      out.write("                                    <span class=\"custom-control-indicator\"></span>\r\n");
      out.write("                                    <span class=\"custom-control-description\">Gym/Fitness</span>\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-9\">\r\n");
      out.write("                    <div class=\"card-deck\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/236/236936/236936_14050218100019292572.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 1</h4>\r\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/119/1199/1199_16093010480047158993.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 2</h4>\r\n");
      out.write("                                <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/109/1094465/1094465_16010514010038880241.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 3</h4>\r\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-deck mt-3\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/774/774294/774294_15071611540032427146.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 4</h4>\r\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/448/44889/44889_15030710020025890183.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 5</h4>\r\n");
      out.write("                                <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/285/285508/285508_16052510510042698002.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 6</h4>\r\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-deck mt-3\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/845/84514/84514_15081710300034393543.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 7</h4>\r\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/489/48928/48928_17011716190050362291.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 8</h4>\r\n");
      out.write("                                <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/449/44909/44909_14010914590018034736.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\r\n");
      out.write("                            <div class=\"card-block\">\r\n");
      out.write("                                <h4 class=\"card-title\">Example 9</h4>\r\n");
      out.write("                                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer\">\r\n");
      out.write("                                <a class=\"btn btn-primary\" href=\"#\" role=\"button\">See detail</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row justify-content-center mt-3\">\r\n");
      out.write("                <nav aria-label=\"Page navigation example\">\r\n");
      out.write("                    <ul class=\"pagination\">\r\n");
      out.write("                        <li class=\"page-item\">\r\n");
      out.write("                            <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                                <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                        <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                        <li class=\"page-item\">\r\n");
      out.write("                            <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                                <span class=\"sr-only\">Next</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
