package quiz_game;

import java.sql.*;

public class Connect {
    Connection con = null;
    
    public static Connection ConnectionDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            System.out.println("Connection succeed");
            return con;
        }
        catch(Exception e) {
            System.out.println("Connection failed" + e);
            return null;
        }
        
    }
}
