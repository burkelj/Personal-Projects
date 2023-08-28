import java.util.Scanner;
import java.util.Random;

public class numberGuesser{
   private static int number;
   private static Scanner scan;
   private static Random random;
   private static int randNum;
   private static int attempts;
public static int randomNumber(){
   random = new Random();
   return random.nextInt(10);
 }
public static int rightNumber(){
    randNum = randomNumber();
       
       if(number == randNum){
         System.out.println("Number matches!" + randNum);
         
      
      
      
      }
     else if(number > randNum){
        System.out.println("Number is too high.");
        
  
     
     }
    else if(number < randNum){
        System.out.println("Number is too low.");
        
        

    
    
    }
    
    
    
    
      return number;



}



public static void main(String[]args){
   scan = new Scanner(System.in);
   attempts = 2;
   do{
   System.out.println("Guess a number between 1 and 10:");
   number = scan.nextInt();
   rightNumber();
   if(attempts == 0){
      System.out.println("You have no more attempts. Game over.");
      break;
   
   }
   attempts--;
   } while(number != randNum);
   
   
}
















}