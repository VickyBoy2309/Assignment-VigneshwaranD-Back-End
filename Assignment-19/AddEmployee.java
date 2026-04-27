//Task - 2

import java.sql.Connection;
import java.sql.CallableStatement;
import db.DBConnection;

public class AddEmployee {

  public static void main(String[] args) {

    try {
      Connection con = DBConnection.getConnection("db_employee.properties");

      CallableStatement stmt = con.prepareCall("{call add_employee(?, ?, ?)}");

      stmt.setInt(1 ,101);
      stmt.setString(2, "Phil");
      stmt.setDouble(3, 56000);

      stmt.execute();

      System.out.println("Employee added successfully!");

      con.close();

    } catch (Exception e) {
      e.printStackTrace(); 
    }

  }
}