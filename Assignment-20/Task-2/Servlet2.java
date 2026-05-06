import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Servlet2 extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");

    String name = request.getParameter("username");

    PrintWriter out = response.getWriter();

    out.println("<h1>This is Servlet - 2</h1>");
    out.println("<h2>Hello " + name + "</h2>");
  }
}