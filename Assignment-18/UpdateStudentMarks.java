//Task - 2

import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;

public class UpdateStudentMarks {

  public static void main(String[] args) {

    try {

      Connection con = DBConnection.getConnection("db_student.properties");

      String query = "UPDATE students SET marks = ? WHERE id = ?";

      PreparedStatement pstmt = con.prepareStatement(query);

      pstmt.setFloat(1, 94.0f);
      pstmt.setInt(2, 201);

      int rows = pstmt.executeUpdate();

      if (rows > 0) {
        System.out.println("Record Updated Successfully!");
      } else {
        System.out.println("Student ID Not found!");
      }

      pstmt.close();
      con.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}