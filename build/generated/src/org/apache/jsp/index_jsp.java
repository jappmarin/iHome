package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div class=\"row hidden-sm-down mx-auto\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069509-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069512-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069501-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069506-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row justify-content-center mx-auto\">\n");
      out.write("                <div class=\"col-sm-2 hidden-sm-down\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069503-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1104979-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8 align-self-center\">\n");
      out.write("                    <div class=\"card mt-2 mb-2\">\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"row justify-content-center\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <h2 class=\"text-center\">Where would you like to stay?</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"row justify-content-center\">\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"search\" aria-describedby=\"search\" placeholder=\"eg. Samut Prakan, Bangkok, Chaingmai\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row justify-content-center\">\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("                                    <a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">Search</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2 hidden-sm-down\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069158-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069499-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row hidden-sm-down mx-auto\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069514-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069507-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069498-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <img src=\"https://www.ownerdirect.com/images/1069547-full.jpg\" alt=\"...\" class=\"mt-2 mb-2 w-100\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modal-signup\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modal-signup\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form id=\"form-signup\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\">Sign Up</h5>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Username:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"username-signup\" placeholder=\"Username\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Password:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"password\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"pasword-signup\" placeholder=\"Password\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Confirm Password:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"password\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"confirmpassword-signup\" placeholder=\"Confirm password\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">First Name:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"fname-signup\" placeholder=\"First name\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Last Name:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"lname-signup\" placeholder=\"Last name\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Identity Number:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"idnumber-signup\" placeholder=\"ID Number or Passport ID\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Date of Birth</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"date\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"birth-signup\" placeholder=\"\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Gender</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" id=\"gender-signup\">\n");
      out.write("                                                    <option selected>Choose...</option>\n");
      out.write("                                                    <option value=\"male\">Male</option>\n");
      out.write("                                                    <option value=\"female\">Female</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Home Address</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <textarea class=\"form-control\" id=\"exampleTextarea\" rows=\"3\"></textarea>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Email</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"email-signup\" placeholder=\"Email address\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"align-middle\">Phone Number</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"phone-signup\" placeholder=\"Phone number\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary\">Confirm</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modal-login\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modal-login\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form class=\"form-signin\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h5 class=\"modal-title\">Login</h5>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <label for=\"Email\" class=\"sr-only\">Email</label>\n");
      out.write("                                <input type=\"email\" id=\"email-login\" class=\"form-control\" placeholder=\"Email address\" required autofocus=\"\">\n");
      out.write("                                <label for=\"Password\" class=\"sr-only\">Password</label>\n");
      out.write("                                <input type=\"password\" id=\"password-login\" class=\"form-control\" placeholder=\"Password\" required autofocus=\"\">\n");
      out.write("                            </div>                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
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
