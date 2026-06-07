package lab08;

import java.sql.Connection;

public class StudentConnectionTest {

    public static void main(String[] args) {

        try {
            Connection con = StudentDatabaseConnection.getConnection();
            System.out.println("Database connected successfully.");
        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}