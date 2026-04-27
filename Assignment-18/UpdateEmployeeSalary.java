// Task - 3

import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;

public class UpdateEmployeeSalary {

  public static void main(String[] args) {

    try {
      Connection con = DBConnection.getConnection("db_employee.properties");

      String query = "UPDATE employee SET salary = ? WHERE department = ?";

      PreparedStatement pstmt = con.prepareStatement(query);

      pstmt.setFloat(1, 75697);
      pstmt.setString(2, "IT");

      int rows = pstmt.executeUpdate();

      System.out.println(rows + " Record Updated Successfully!");

      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}