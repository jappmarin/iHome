package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row justify-content-center mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Customer Information</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">First Name:</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"First name\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Last Name:</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Last name\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Identity Number or Passport Number:</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Identity Number or Passport Number\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Date of Birth</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"date\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Email</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Email address\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Phone Number</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Phone number\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>                \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Homestay Book</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">ชื่อโฮมสเตย์</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <p>Example 1</p>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Check-in</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"date\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Last name\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Check-out</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"date\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Identity Number or Passport Number\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">จำนวนผู้เข้าพัก</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <input type=\"date\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Last name\">\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"align-middle\">Total Price</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <p class=\"align-middle\">500 Bath</p>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col\">\n");
      out.write("                                            <a class=\"btn btn-primary\" href=\"booking_confirm.html\">Confirm</a>\n");
      out.write("                                            <a class=\"btn btn-secondary\"  href=\"detail.html\">Cancel</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/modal.jsp", out, false);
      out.write('\n');
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
