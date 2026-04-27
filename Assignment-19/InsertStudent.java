//Task - 1

import java.sql.Connection;
import java.sql.CallableStatement;
import db.DBConnection;

public class InsertStudent {

  public static void main(String[] args) {

    try {
      Connection con = DBConnection.getConnection("db_student.properties");

      CallableStatement stmt = con.prepareCall("{call insert_student(?, ?, ?)}");

      stmt.setInt(1, 301);
      stmt.setString(2, "Star Lord");
      stmt.setInt(3, 98);

      stmt.execute();

      System.out.println("Inserted using stored procedure!");

      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}