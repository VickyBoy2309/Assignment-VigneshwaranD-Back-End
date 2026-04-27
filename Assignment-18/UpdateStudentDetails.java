//Task - 4

import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;

public class UpdateStudentDetails { 

  public static void main(String[] args) {

    try {
      Connection con = DBConnection.getConnection("db_student.properties");

      String query = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

      PreparedStatement pstmt = con.prepareStatement(query);

      pstmt.setString(1, "Victor Von Doom");
      pstmt.setFloat(2, 100.0f);
      pstmt.setInt(3, 201);

      int rows = pstmt.executeUpdate();

      if (rows > 0) { 
        System.out.println("Student record updated successfully!");
      } else {
        System.out.println("Student ID not found!");
      }

      pstmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}