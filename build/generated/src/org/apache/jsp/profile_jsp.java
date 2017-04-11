package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container mt-5 mb-3\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <h3 class=\"card-header\">Profile</h3>\n");
      out.write("            <div class=\"card-block\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                  <img src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15b150638a9%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15b150638a9%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2275.5%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"...\" class=\"rounded img-thumbnail mx-auto d-block\">\n");
      out.write("                  <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                    <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Name:</td>\n");
      out.write("                        <td>Teerawut Kitbunjerdjarud</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Join date:</td>\n");
      out.write("                        <td>20/03/2017</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Date of Birth</td>\n");
      out.write("                        <td>08/11/1996</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td>Male</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Home Address</td>\n");
      out.write("                        <td>Bangkok, Thailand</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>\n");
      out.write("                          <a href=\"mailto:t.Kitbunjerdjarud@gmail.com\">t.Kitbunjerdjarud@gmail.com</a>\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Phone Number</td>\n");
      out.write("                        <td>094-546-4678 (Mobile)\n");
      out.write("                        </td>\n");
      out.write("                      </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("                  <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">Edit Profile</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container mt-5 mb-5\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("          <p class=\"lead\">If you are host you will see all option below.</p>\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <h3 class=\"card-header\">Owned Homestay</h3>\n");
      out.write("            <div class=\"card-block\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                  <img src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15b150638a9%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15b150638a9%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2275.5%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"...\" class=\"rounded img-thumbnail mx-auto d-block\">\n");
      out.write("                  <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                    <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Homestay Name:</td>\n");
      out.write("                        <td>Example 1</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Join date:</td>\n");
      out.write("                        <td>01/12/2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td>Bangkok, Thailand</td>\n");
      out.write("                      </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("                  <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">Edit Homestay</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"list-group list-group-flush\">\n");
      out.write("              <li class=\"list-group-item\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                  <img src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15b150638a9%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15b150638a9%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2275.5%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"...\" class=\"rounded img-thumbnail mx-auto d-block\">\n");
      out.write("                  <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                    <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Homestay Name:</td>\n");
      out.write("                        <td>Example 2</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Join date:</td>\n");
      out.write("                        <td>01/12/2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td>Bangkok, Thailand</td>\n");
      out.write("                      </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("                  <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">Edit Homestay</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-group-item\">\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                  <img src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15b150638a9%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15b150638a9%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2275.5%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"...\" class=\"rounded img-thumbnail mx-auto d-block\">\n");
      out.write("                  <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                    <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Homestay Name:</td>\n");
      out.write("                        <td>Example 3</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Join date:</td>\n");
      out.write("                        <td>01/12/2016</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td>Bangkok, Thailand</td>\n");
      out.write("                      </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("                  <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">Edit Homestay</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container mt-5 mb-5\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <div class=\"col-sm-8\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <h3 class=\"card-header\">Add Homestay</h3>\n");
      out.write("            <div class=\"card-block\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                  <a href=\"#\" class=\"btn btn-primary btn-lg\">Add Homestay</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  ");
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
