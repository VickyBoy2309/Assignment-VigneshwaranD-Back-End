import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class InsertServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String name = request.getParameter("name");
    String email = request.getParameter("email");

    try {
      // 1. Load Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 2. Connect to DB
      Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/20Task3", "root", "admin");

      // 3. Prepare SQL
      PreparedStatement ps = con.prepareStatement(
          "INSERT INTO users(name, email) VALUES (?, ?)");

      ps.setString(1, name);
      ps.setString(2, email);

      // 4. Execute
      int i = ps.executeUpdate();

      if (i > 0) {
        out.println("<h2>Data Inserted Successfully!</h2>");
      } else {
        out.println("<h2>Insertion Failed</h2>");
      }

      con.close();

    } catch (Exception e) {
      out.println("Error: " + e);
    }
  }
}