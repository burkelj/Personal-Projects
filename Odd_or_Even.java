import java.util.Scanner;
public class Odd_or_Even{
   private static int num;
   private static Scanner scan;
   
   
   public static int checkNum(){
      if(num % 2 == 0){
         System.out.println("This number is even.");
      
      
      }
      else{
         System.out.println("This number is odd.");
      
      
      
      }
    return num;
   
   
   }
   public static void main(String[] args){
     scan = new Scanner(System.in);
     System.out.println("Enter a number:");
     num = scan.nextInt();
     checkNum();
 
   
   
   }






}