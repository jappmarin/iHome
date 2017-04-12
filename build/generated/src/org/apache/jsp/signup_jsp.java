package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\n");
      out.write("                <div class=\"col-sm-4\" id=\"signup\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">Sign Up</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <form action=\"/Signup\" method=\"POST\">\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"firstNameInDiv\">\n");
      out.write("                                    <label for=\"firstname\">First Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"firstNameIn\" placeholder=\"John\" required=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"lastNameInDiv\">\n");
      out.write("                                    <label for=\"lastname\">Last Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"lastNameIn\" placeholder=\"English\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"usernameInDiv\">\n");
      out.write("                                    <label for=\"username\">Username</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"username\" id=\"usernameIn\" placeholder=\"johnenglish\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"emailInDiv\">\n");
      out.write("                                    <label for=\"email\">Email</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" name=\"email\" id=\"emailIn\" placeholder=\"john@english.com\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"passInDiv\">\n");
      out.write("                                    <label for=\"password\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"password\" id=\"passIn\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group has-feedback\" id=\"confirmPassInDiv\">\n");
      out.write("                                    <label for=\"confirmPass\">Confirm Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"confirmPass\" id=\"confirmPassIn\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-block\" id=\"signUpButton\">Sign Up</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <p>Already a member? <a href=\"signin.jsp\" class=\"btn btn-secondary btn-sm\">Sign In</a></p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
