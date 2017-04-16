package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Homestay;

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
      out.write('\n');
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write('\n');
 Homestay homestay = (Homestay) request.getAttribute("homestay");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row justify-content-center mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-12 col-md-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Customer Information</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <form action=\"Booking\" method=\"POST\">\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"firstNameInDiv\">\n");
      out.write("                                            <label for=\"firstname\">First Name</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"firstNameIn\" placeholder=\"John\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"lastNameInDiv\">\n");
      out.write("                                            <label for=\"firstname\">Last Name</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"lastNameIn\" placeholder=\"English\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"emailInDiv\">\n");
      out.write("                                            <label for=\"username\">Email</label>\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"email\" id=\"emailIn\" placeholder=\"john@english.com\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"phneInDiv\">\n");
      out.write("                                            <label for=\"phone\">Phone Number</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phoneIn\" placeholder=\"094-546-467\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                                        </div>  \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 col-md-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Booking Information</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col\">\n");
      out.write("                                    <form action=\"\" method=\"POST\">\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"homestayNameInDivInDiv\">\n");
      out.write("                                            <label for=\"homestayName\">Homestay Name</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"homestayname\" id=\"homestayNameIn\" placeholder=\"\" value=\"");
      out.print(homestay.getHs_name());
      out.write("\" required disabled>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"checkinInDiv\">\n");
      out.write("                                            <label for=\"checkin\">Check-in</label>\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" name=\"checkin\" id=\"checkinIn\" placeholder=\"\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"checkoutInDiv\">\n");
      out.write("                                            <label for=\"checkout\">Check-out</label>\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" name=\"checkout\" id=\"checkoutIn\" placeholder=\"\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group has-feedback\" id=\"priceInDiv\">\n");
      out.write("                                            <label for=\"price\">Price Total</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"price\" id=\"priceIn\" placeholder=\"\" value=\"");
      out.print(homestay.getHs_price());
      out.write("\" disabled>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"text-center\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"confirmButton\">Confirm Booking</button>\n");
      out.write("                                            <a class=\"btn btn-secondary btn-block\" href=\"detail.jsp\" id=\"cancelButton\">Cancel</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
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
