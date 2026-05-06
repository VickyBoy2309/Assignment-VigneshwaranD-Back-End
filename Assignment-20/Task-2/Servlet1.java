import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Servlet1 extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");

    String name = request.getParameter("username");

    PrintWriter out = response.getWriter();

    // ✅ Show Servlet1 content
    out.println("<h1>This is Servlet - 1</h1>");
    out.println("<h2>Hello " + name + "</h2>");

    // ✅ Button to go to Servlet2
    out.println("<form action='Servlet2' method='get'>");
    out.println("<input type='hidden' name='username' value='" + name + "'>");
    out.println("<input type='submit' value='Go To Servlet - 2'>");
    out.println("</form>");
  }
}