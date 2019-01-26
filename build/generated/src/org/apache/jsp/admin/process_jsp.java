package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class process_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>RP-Getaways</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"icon\" href=\"../imgs/logo/beach.png\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            h2, h3, h4, h5 {\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("                color: grey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p, h1 {\n");
      out.write("                color: grey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #main-slider {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 90%;\n");
      out.write("                top: 0%;\n");
      out.write("                margin-top: 0%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .figure {\n");
      out.write("                margin-right: 24px; \n");
      out.write("                margin-top: 30px;\n");
      out.write("                height: 250px;\n");
      out.write("                width: 250px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #main_jumbotron {\n");
      out.write("                position: absolute;\n");
      out.write("                margin: auto;\n");
      out.write("                margin-left: 29%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sticky-top\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                        <img src=\"../imgs/logo/beach.png\" style=\"width: 50px; height: 50px;\"> RP-Getaways</a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("                            aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"rooms-ppl/PPL_crown_villas_active.html\">Rooms</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-top: 50px;\n");
      out.write("             margin-bottom: 80px;\">\n");
      out.write("            <h2 style=\"color: grey; text-align: center;\">Reservation Form</h2>\n");
      out.write("            <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"main/FormServlet\" name=\"reservationForm\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                        <label for=\"validationCustom01\">First name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"name\" \n");
      out.write("                               id=\"validationCustom01\" placeholder=\"First Name\" required>\n");
      out.write("                        <div class=\"valid-feedback\">\n");
      out.write("                            Looks good!\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                        <label for=\"validationCustom02\">Last name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"last\" \n");
      out.write("                               id=\"validationCustom02\" placeholder=\"Last Name\" required>\n");
      out.write("                        <div class=\"valid-feedback\">\n");
      out.write("                            Looks good!\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                        <label for=\"inputEmail4\">Email</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"email\" \n");
      out.write("                               id=\"inputEmail4\" placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                        <label for=\"validationCustom03\">City (Optional)</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"city\"  \n");
      out.write("                               id=\"validationCustom03\" placeholder=\"City\">\n");
      out.write("                        <div class=\"invalid-feedback\">\n");
      out.write("                            Please provide a valid city.\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                        <label for=\"validationCustom04\">State (Optional)</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"state\"  \n");
      out.write("                               id=\"validationCustom04\" placeholder=\"State\">\n");
      out.write("                        <div class=\"invalid-feedback\">\n");
      out.write("                            Please provide a valid state.\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                        <label for=\"validationCustom05\">Zip (Optional)</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"zip\" \n");
      out.write("                               id=\"validationCustom05\" placeholder=\"Zip\">\n");
      out.write("                        <div class=\"invalid-feedback\">\n");
      out.write("                            Please provide a valid zip.\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"FormControlSelect1\">Select your area of interest:</label>\n");
      out.write("                    <select class=\"form-control\" id=\"FormControlSelect1\" name=\"areaOfInterest\">\n");
      out.write("                        <option>Select One</option>\n");
      out.write("                        <option>Puerto Plata</option>\n");
      out.write("                        <option>Punta Cana</option>\n");
      out.write("                        <option>Mexico</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                        <label for=\"validationCustom06\">Select start date:</label>\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"validationCustom06\" name=\"start\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                        <label for=\"validationCustom07\">Select end date:</label>\n");
      out.write("                        <input type=\"date\" class=\"form-control\" id=\"validationCustom07\" name=\"end\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 mb-3\">\n");
      out.write("                        <label for=\"FormControlSelect2\">Total amount of guests:</label>\n");
      out.write("                        <select class=\"form-control\" id=\"FormControlSelect2\" name=\"totalGuests\">\n");
      out.write("                            <option>1</option>\n");
      out.write("                            <option>2</option>\n");
      out.write("                            <option>3</option>\n");
      out.write("                            <option>4</option>\n");
      out.write("                            <option>5</option>\n");
      out.write("                            <option>6</option>\n");
      out.write("                            <option>7</option>\n");
      out.write("                            <option>8</option>\n");
      out.write("                            <option>9</option>\n");
      out.write("                            <option>10</option>\n");
      out.write("                            <option>11</option>\n");
      out.write("                            <option>12</option>\n");
      out.write("                            <option>13</option>\n");
      out.write("                            <option>14</option>\n");
      out.write("                            <option>15</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"validationCustom08\">Description</label>\n");
      out.write("                    <textarea class=\"form-control\" name=\"description\"\n");
      out.write("                              id=\"validationCustom06\" rows=\"3\" required></textarea>\n");
      out.write("                </div>\n");
      out.write("                <p>Click \"Submit\" to confirm reservation and request payment.</p>\n");
      out.write("                <input class=\"btn btn-primary\" type=\"submit\" name=\"reservationFormButton\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
