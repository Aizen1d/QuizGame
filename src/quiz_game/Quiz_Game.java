package quiz_game;

import java.sql.*;

public class Quiz_Game {
    
    public static void main(String[] args) {
    
    Connect connect = new Connect();
    connect.ConnectionDB(); // Check the database connection
   
    Main_menu mainMenu = new Main_menu(); 
    mainMenu.setVisible(true); // Make the main menu appear
    }

}
