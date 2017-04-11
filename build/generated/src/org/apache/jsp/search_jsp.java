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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-block\">\n");
      out.write("              <h5 class=\"card-title\">Search within results</h5>\n");
      out.write("              <hr>\n");
      out.write("              <h6 class=\"card-title\">Search results for:</h6>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                  <div class=\"col-12\">\n");
      out.write("                    <input class=\"form-control\" type=\"search\" value=\"eg. Bangkok, Chaingmai\" id=\"example-search-input\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </p>\n");
      out.write("              <hr>\n");
      out.write("              <h6 class=\"card-title\">Accommodation type</h6>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                  <span class=\"custom-control-indicator\"></span>\n");
      out.write("                  <span class=\"custom-control-description\">Resort</span>\n");
      out.write("                </label>\n");
      out.write("              </p>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                  <span class=\"custom-control-indicator\"></span>\n");
      out.write("                  <span class=\"custom-control-description\">Hotel</span>\n");
      out.write("                </label>\n");
      out.write("              </p>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                  <span class=\"custom-control-indicator\"></span>\n");
      out.write("                  <span class=\"custom-control-description\">Guest House / Bed & Breakfast</span>\n");
      out.write("                </label>\n");
      out.write("              </p>\n");
      out.write("              <hr>\n");
      out.write("              <h6 class=\"card-title\">Accommodation type</h6>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <div class=\"form-group row mx-auto align-items-center\">\n");
      out.write("                  Lowest Price\n");
      out.write("                  <div class=\"col-6\">\n");
      out.write("                    <input class=\"form-control\" type=\"number\" value=\"400\" id=\"example-number-input\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row mx-auto align-items-center\">\n");
      out.write("                  Highest Price\n");
      out.write("                  <div class=\"col-6\">\n");
      out.write("                    <input class=\"form-control\" type=\"number\" value=\"2000\" id=\"example-number-input\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </p>\n");
      out.write("              <hr>\n");
      out.write("              <h6 class=\"card-title\">Facilities</h6>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                  <span class=\"custom-control-indicator\"></span>\n");
      out.write("                  <span class=\"custom-control-description\">Swimming Pool</span>\n");
      out.write("                </label>\n");
      out.write("              </p>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                  <span class=\"custom-control-indicator\"></span>\n");
      out.write("                  <span class=\"custom-control-description\">Internet</span>\n");
      out.write("                </label>\n");
      out.write("              </p>\n");
      out.write("              <p class=\"card-text\">\n");
      out.write("                <label class=\"custom-control custom-checkbox\">\n");
      out.write("                  <input type=\"checkbox\" class=\"custom-control-input\">\n");
      out.write("                  <span class=\"custom-control-indicator\"></span>\n");
      out.write("                  <span class=\"custom-control-description\">Gym/Fitness</span>\n");
      out.write("                </label>\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-9\">\n");
      out.write("          <div class=\"card-deck\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/236/236936/236936_14050218100019292572.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 1</h4>\n");
      out.write("                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/119/1199/1199_16093010480047158993.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 2</h4>\n");
      out.write("                <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/109/1094465/1094465_16010514010038880241.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 3</h4>\n");
      out.write("                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-deck mt-3\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/774/774294/774294_15071611540032427146.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 4</h4>\n");
      out.write("                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/448/44889/44889_15030710020025890183.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 5</h4>\n");
      out.write("                <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/285/285508/285508_16052510510042698002.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 6</h4>\n");
      out.write("                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-deck mt-3\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/845/84514/84514_15081710300034393543.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 7</h4>\n");
      out.write("                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/489/48928/48928_17011716190050362291.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 8</h4>\n");
      out.write("                <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("              <img class=\"card-img-top w-100\" src=\"https://pix6.agoda.net/hotelImages/449/44909/44909_14010914590018034736.jpg?s=500x500&ar=1x1&p=true\" alt=\"Card image cap\">\n");
      out.write("              <div class=\"card-block\">\n");
      out.write("                <h4 class=\"card-title\">Example 9</h4>\n");
      out.write("                <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"card-footer\">\n");
      out.write("                <small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row mt-3 mx-auto\">\n");
      out.write("          <nav aria-label=\"Page navigation example\">\n");
      out.write("            <ul class=\"pagination\">\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("                  <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("                  <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("              <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("              <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("              <li class=\"page-item\">\n");
      out.write("                <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("                  <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("                  <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
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
