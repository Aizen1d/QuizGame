
package quiz_game;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Operations {
    Connection con = null;
    static ArrayList<Integer> usedQuestions = new ArrayList<>();
    
    public static boolean checkIfThereIsUser() {
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try {
            con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            String Query = "SELECT * FROM Users WHERE userName IS NOT NULL";
            statement = con.prepareStatement(Query);
            result = statement.executeQuery();
            
           if (result.next()) {
               con.close();
               statement.close();
               result.close();
               return true;
           }
           else {
               con.close();
               statement.close();
               result.close();
               return false;
           }   
        }
        catch (Exception error) {
            System.out.println("There is no user created yet " + error);
             return false;
        }
              
    }
    
    public void inputUserName(String userName){
        
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            String Query = "INSERT INTO Users (userName) VALUES ('" + userName + "')";
            PreparedStatement statement = con.prepareStatement(Query);
            
            statement.executeUpdate();
            System.out.println("New user has been created");
            
            con.close();
            statement.close();
        }
        catch (Exception e) {
            System.out.println("There was error:" + e);
        }
       
    }
    
    public static String getName(){
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            String Query = "SELECT userName FROM Users";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery();
            String s = "";
            
            if (result.next()) {
                s = result.getString(1);
            }
            
            con.close();
            statement.close();
            result.close();
            
            return s;
        }
        catch (Exception e) {
            System.out.println("There was error:" + e);
            return "";
        } 
    }
    
    public static String[] getQuestionForGrammar(){
        try {
            int packageQuestion = 7; //Question + Choice A-D + Answer + Num = 7 things
            String[] values = new String[packageQuestion];
            String situation = Attributes.getSituation();
            
            if (situation.equals("Ended") || situation == "Ended") {
                System.out.println("Clear the list");
                usedQuestions.clear();
            }  
                   
            Random random = new Random();
            int number = random.nextInt(88);
            number = number + 1;
            
            for (int i = 0; i < usedQuestions.size(); i++) {
                if (number == usedQuestions.get(i)) {
                    System.out.println("Repeated question detected " + number);
                    return getQuestionForGrammar();
                }
                else {
                    //System.out.println("Unique Question");
                   // usedQuestions.add(number);
                }
            }
            
            System.out.println("Unique Question");
            usedQuestions.add(number);
            
            Connection con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            String Question = "SELECT Questions FROM Grammar WHERE Num = " + Integer.toString(number);
            String ChoiceA = "SELECT ChoiceA FROM Grammar WHERE Num = " + Integer.toString(number);
            String ChoiceB = "SELECT ChoiceB FROM Grammar WHERE Num = " + Integer.toString(number);
            String ChoiceC = "SELECT ChoiceC FROM Grammar WHERE Num = " + Integer.toString(number);
            String ChoiceD = "SELECT ChoiceD FROM Grammar WHERE Num = " + Integer.toString(number);
            String Answer = "SELECT Answer FROM Grammar WHERE Num = " + Integer.toString(number);
            
            //prepare the statements of our queries 
            PreparedStatement ques = con.prepareStatement(Question);
            PreparedStatement cA = con.prepareStatement(ChoiceA);
            PreparedStatement cB = con.prepareStatement(ChoiceB);
            PreparedStatement cC = con.prepareStatement(ChoiceC);
            PreparedStatement cD = con.prepareStatement(ChoiceD);
            PreparedStatement ans = con.prepareStatement(Answer);
            
            //executing the queries
            ResultSet r1 = ques.executeQuery();
            ResultSet r2 = cA.executeQuery();
            ResultSet r3 = cB.executeQuery();
            ResultSet r4 = cC.executeQuery();
            ResultSet r5 = cD.executeQuery();
            ResultSet r6 = ans.executeQuery();
            
            //retrieving the values
            r1.next();
                values[0] = r1.getString(1);
            r2.next();
                values[1] = r2.getString(1);
            r3.next();
                values[2] = r3.getString(1);
            r4.next();
                values[3] = r4.getString(1);
            r5.next();
                values[4] = r5.getString(1);
            r6.next();
                values[5] = r6.getString(1);
            
                values[6] = Integer.toString(number); //what number in the database
            
            con.close();
            ques.close();
            cA.close();
            cB.close();
            cC.close();
            cD.close();
            ans.close();
            
            r1.close();
            r2.close();
            r3.close();
            r4.close();
            r5.close();
            r6.close();
              
            return values;
        }
        catch (Exception e) {
            System.out.println("There was error:" + e);
            return null;
        } 
     
    }
    
    public static String getAnswer(String question) {
        String answer = null;
         try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            String Query = "SELECT Answer FROM Grammar WHERE Questions = '" + question + "'";
            PreparedStatement statement = con.prepareStatement(Query);
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                answer = result.getString(1);
            }
            
            con.close();
            statement.close();
            result.close();
            
            return answer;
        }
        catch (Exception e) {
            System.out.println("There was error:" + e);
            return "";
        } 
        
    }
    
    public static void updateDifficulty(String difficulty) { // Increment the number of difficulty played
          Connection con = null;
          PreparedStatement statement = null;
            
          try {
            con = DriverManager.getConnection("jdbc:sqlite:QuizGameDB.db");
            String Query = "UPDATE Grammar SET " + difficulty + " = " + difficulty + " + 1 WHERE Num = 1";
            
            statement = con.prepareStatement(Query);
          
            statement.executeUpdate();
            
            con.close();
            statement.close();
        }
          
        catch (Exception e) {
            System.out.println("There was error:" + e);
        } 
          
    }
   
}

