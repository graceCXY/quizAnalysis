import java.util.Scanner;
import java.io.*; 

public class Quiz{
    
    public static void main(String[] args){
        File quizdata = new File("quiz responses.csv");
        try{
            Scanner input = new Scanner(quizdata);
            String[] anskey = new String[9];
            
            while(input.hasNext() ){
                String str = input.nextLine();
                String[] temp = str.split(",");
                String name = "";
                int scorecount = 0; 
                if(str.contains("Answer Key") ){
                    for(int i =0; i<temp.length; i++){
                        anskey[i] = temp[i];
                    }
                }
                name = temp[0];
                for(int i = 1; i< anskey.length; i++){
                    if(temp[i].equals( anskey[i])){
                        scorecount ++; 
                        
                    }
                }
                System.out.println(name+ " : " + scorecount + "/8");
            }
            
        } 
        catch(FileNotFoundException e ){
            e.printStackTrace();
        }
    }
}