//DBConnection
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;

public class DBConnection {

  public static Connection getConnection(String fileName) {
    Connection con = null;

    try {
      // Load properties file
      FileInputStream fis = new FileInputStream("config/" + fileName);
      Properties prop = new Properties();
      prop.load(fis);

      // Get values
      String url = prop.getProperty("url");
      String user = prop.getProperty("user");
      String pass = prop.getProperty("password");

      // Create connection
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, user, pass);

    } catch (Exception e) {
      e.printStackTrace();
    }

    return con;
  }
}