import java.util.Scanner;
import java.util.Random;

public class numberGuesser{
   private static int number;
   private static Scanner scan;
   private static Random random;
   private static int randNum;
   //private static int Range;
public static int randomNumber(){
   random = new Random();
   return random.nextInt(100);
 }
public static int rightNumber(){
    randNum = randomNumber();
      if(number == randNum){
         System.out.println("Number matches!");
      
      
      
      
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
   System.out.println("Guess a number between 1 and 100:");
   number = scan.nextInt();
   //System.out.println(randomNumber());
   rightNumber();
   //System.out.println(randomNumber());
   
}
















}