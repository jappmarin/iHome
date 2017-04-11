package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <h3 class=\"card-header\">Shuswap: Blind Bay</h3>\r\n");
      out.write("                <div class=\"card-block\">\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                                <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                                    <div class=\"carousel-item active\">\r\n");
      out.write("                                        <img class=\"d-block w-100 h-100 rounded\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg\" alt=\"First slide\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"carousel-item\">\r\n");
      out.write("                                        <img class=\"d-block w-100 h-100 rounded\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983992-full.jpg\" alt=\"Second slide\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"carousel-item\">\r\n");
      out.write("                                        <img class=\"d-block w-100 h-100 rounded\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983990-full.jpg\" alt=\"Third slide\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                    <span class=\"sr-only\">Next</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-block\">\r\n");
      out.write("                                    <h4 class=\"card-title\">Homestay Detail</h4>\r\n");
      out.write("                                    <p class=\"card-text\">There are 7 beds (3 queen beds, 1 double lower bunk, 1 double upper bunk, 1 single foamie (child size) and 1 double bed). The base rate (before extra person rates are added) is for 8 occupants.</p>\r\n");
      out.write("                                    <a class=\"btn btn-primary btn-lg\" href=\"#\">Booking</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row mt-4 mb-4\">\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <div id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading1\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse1\" aria-expanded=\"false\" aria-controls=\"collapse1\">\r\n");
      out.write("                                                Parking\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse1\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading1\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>4 Outdoor/Open parking stalls with unlimited clearance</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading2\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\" aria-expanded=\"false\" aria-controls=\"collapse2\">\r\n");
      out.write("                                                Heating & Air Conditioning\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse2\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading2\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>Central Air Heating</li>\r\n");
      out.write("                                                <li>Air Conditioning: 1 Portable Unit</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading3\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse3\" aria-expanded=\"false\" aria-controls=\"collapse3\">\r\n");
      out.write("                                                Bedroom\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse3\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading3\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>Queen Bed</li>\r\n");
      out.write("                                                <li>Closet</li>\r\n");
      out.write("                                                <li>Alarm Clock</li>\r\n");
      out.write("                                                <li>Vanity</li>\r\n");
      out.write("                                                <li>Ceiling Fan</li>\r\n");
      out.write("                                                <li>Table Lamp</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading4\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse4\" aria-expanded=\"false\" aria-controls=\"collapse4\">\r\n");
      out.write("                                                Bathroom\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse4\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading4\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>Bathtub</li>\r\n");
      out.write("                                                <li>Regular Stall Shower</li>\r\n");
      out.write("                                                <li>Sink</li>\r\n");
      out.write("                                                <li>Toilet</li>\r\n");
      out.write("                                                <li>owels (matching)</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading5\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse5\" aria-expanded=\"false\" aria-controls=\"collapse5\">\r\n");
      out.write("                                                Kitchen\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse5\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading5\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>Large Fridge with Freezer (including ice maker)</li>\r\n");
      out.write("                                                <li>Coffee Maker</li>\r\n");
      out.write("                                                <li>Dishwasher</li>\r\n");
      out.write("                                                <li>Kettle</li>\r\n");
      out.write("                                                <li>Microwave</li>\r\n");
      out.write("                                                <li>Range Oven</li>\r\n");
      out.write("                                                <li>Toaster</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading6\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse6\" aria-expanded=\"false\" aria-controls=\"collapse6\">\r\n");
      out.write("                                                Outdoor\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse6\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading6\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>Propane BBQ private to this property.</li>\r\n");
      out.write("                                                <li>Patio Table</li>\r\n");
      out.write("                                                <li>2 Chaise Lounges</li>\r\n");
      out.write("                                                <li>Wrap Around Deck</li>\r\n");
      out.write("                                                <li>Dock</li>\r\n");
      out.write("                                                <li>Grass/Lawn</li>\r\n");
      out.write("                                                <li>Picnic Table</li>\r\n");
      out.write("                                                <li>Sun Umbrella</li>\r\n");
      out.write("                                                <li>Swing Set</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading7\">\r\n");
      out.write("                                        <h5 class=\"mb-0\">\r\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse7\" aria-expanded=\"false\" aria-controls=\"collapse7\">\r\n");
      out.write("                                                Other\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"collapse7\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading7\">\r\n");
      out.write("                                        <div class=\"card-block\">\r\n");
      out.write("                                            <ul>\r\n");
      out.write("                                                <li>The internet connection is provided.</li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
