//Task - 3

import java.sql.Connection;
import java.sql.CallableStatement;
import db.DBConnection;

public class InsertUser {

  public static void main(String[] args) {

    try  { 
      Connection con = DBConnection.getConnection("db_user.properties");

      CallableStatement stmt = con.prepareCall("{call insert_user(?, ?, ?, ?)}");

      stmt.setInt(1, 1);
      stmt.setString(2, "Vicky_Boy_23");
      stmt.setString(3, "0987vickyboy@gmail.com");
      stmt.setString(4, "password");

      stmt.execute();

      System.out.println("User inserted successfully!");
      con.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}