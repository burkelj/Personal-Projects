import java.util.Scanner;
public class ATM {
   private static int currBalance;
   private static int deposit;
   private static int withdraw;
   private static Scanner scan;
   private static int Balance;
   private static int optionInput;
public static int getCurrentBalance(){
  if(currBalance <=0){
      System.out.println("There is currently no balance on this account.");
  
  
}
 else { 
      System.out.println("Your current balance is:" + currBalance);
 
 
 }
      return currBalance;
}
public static int depositCash(){
   scan = new Scanner(System.in);
   System.out.println("Enter how much you would like to deposit here:");
   deposit = scan.nextInt();
   System.out.println("The amount you entered to this account is:" + deposit);
   currBalance = currBalance + deposit;
   return currBalance;
}
public static int withdrawCash(){
   System.out.println("Select how much money you would like to withdraw from this account:");
   withdraw = scan.nextInt();
   if(withdraw > currBalance){
      System.out.println("Withdrawal cannot exceed the current balance. Either make a deposit to meet amount or withdraw less money.");
   
   }
   else{
      currBalance = currBalance - withdraw;
      System.out.println("The amount that has been withdrawn from your account is:" + withdraw);
      System.out.println("The current balance is now:" +  currBalance);
      
   }
   return currBalance;
}
public static void main(String[] args){
   scan = new Scanner(System.in);
   boolean exit = false;
   while(!exit){
   System.out.println("Please select an option:");
   System.out.println("1. Deposit Cash:");
   System.out.println("2. Withdraw cash:");
   System.out.println("3. Check current balance:");
   System.out.println("4. Exit:");
   optionInput = scan.nextInt();
   switch(optionInput){
      case 1:
         depositCash();
         break;
      case 2:
         withdrawCash();
         break;
      case 3:
         getCurrentBalance();
         break;
      case 4:
         exit = true;
         break;
      default:
         System.out.println("Number is invalid. Please select another option.");
         break;
   
   }
   }
   


}




}

