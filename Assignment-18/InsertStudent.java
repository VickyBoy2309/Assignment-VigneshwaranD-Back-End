//Task - 1

import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;

public class InsertStudent {

    public static void main(String[] args) {

        try {
            // Get connection from utility class
            Connection con = DBConnection.getConnection("db_student.properties");

            // SQL query
            String query = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(query);

            // Set values
            pstmt.setInt(1, 201);
            pstmt.setString(2, "Setev");
            pstmt.setFloat(3, 91.0f);

            // Execute
            int rows = pstmt.executeUpdate();

            System.out.println(rows + " Record Inserted Successfully!");

            // Close
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}