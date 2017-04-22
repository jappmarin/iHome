package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\r\n");
      out.write("                <div class=\"col-sm-12 col-md-8\" id=\"profile\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <h3 class=\"card-header\">My Profile</h3>\r\n");
      out.write("                        <div class=\"card-block\">\r\n");
      out.write("                            <form action=\"EditProfile\" method=\"POST\">\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"usernameInDiv\">\r\n");
      out.write("                                    <label for=\"username\">Username</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"username\" id=\"usernameIn\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required disabled>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"firstNameInDiv\">\r\n");
      out.write("                                    <label for=\"firstname\">First Name</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"firstNameIn\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"lastNameInDiv\">\r\n");
      out.write("                                    <label for=\"lastname\">Last Name</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"lastNameIn\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"emailInDiv\">\r\n");
      out.write("                                    <label for=\"email\">Email</label>\r\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" name=\"email\" id=\"emailIn\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"phoneInDiv\">\r\n");
      out.write("                                    <label for=\"phone\">Phone Number</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phoneIn\" placeholder=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"passwordInDiv\">\r\n");
      out.write("                                    <label for=\"password\">Re-enter your Password</label>\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"re_enPass\" id=\"passwordIn\" placeholder=\"\" value=\"\" required>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Save changes</button>\r\n");
      out.write("                                <a href=\"profile.jsp\" class=\"btn btn-secondary btn-block\">Cancel</a>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
