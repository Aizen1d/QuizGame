package quiz_game;

public class Attributes {
    
    private static int numQuestions;
    
    private static String difficulty;
    private static int correctAnswer;
    private static int mistakeAnswer;
    
    private static String situation;
    
    // Setters //
    
    public static void setNumQuestions(int numQ){
        numQuestions = numQ;
    }
    
    public static void setDifficulty(String diff){
        difficulty = diff;
    }
    
    public static void setCorrect(int corr){
        correctAnswer = corr;
    }
     
    public static void setMistake(int miss){
        mistakeAnswer = miss;
    }
    
    public static void setSituation(String sit) {
        situation = sit;
    }
    
    // Getters //
    
    public static int getNumQuestions(){
        return numQuestions;
    }
    
    public static int getCorrect(){
        return correctAnswer;
    }
    
    public static int getMistake(){
        return mistakeAnswer;
    }
    
    public static String getDifficulty(){
        return difficulty;
    }
    
    public static String getSituation(){
        return situation;
    }
    
}
