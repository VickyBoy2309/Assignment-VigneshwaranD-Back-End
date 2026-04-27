//Task - 4

import java.sql.Connection;
import java.sql.CallableStatement;
import db.DBConnection;

public class UpdateStudentMarks {

  public static void main(String[] args) {
    try { 
      Connection con = DBConnection.getConnection("db_student.properties");

      CallableStatement stmt = con.prepareCall("{call update_stud_marks(?, ?)}");

      stmt.setInt(1, 101);
      stmt.setInt(2, 67);

      stmt.execute();
      System.out.println("Student marks updated successfully!");
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}