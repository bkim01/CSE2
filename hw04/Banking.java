//Benedict Kim
//hw04 Banking
//2/13/15

//import scanner
import java.util.Scanner;

//declare class
public class Banking{
    
    //main method
    public static void main (String [] args){
        //initial input needed
        System.out.println("would you like to deposit, withdraw, or view your funds?");
        //give random amount of funds
        int funds = (int)Math.ceil((Math.random()*5)*1000);
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
        String input = myScanner.next();
        //check if the user wants to deposit
        if(input.equals("deposit")){
            System.out.println("How much would you like to deposit?");
            //check for input
            int deposit = myScanner.nextInt();
            //check if the deposit is positive
            if(deposit>0){
                //proceed to add the funds
                funds = funds + deposit;
                System.out.println("Your deposit has been accepted, your balance is $"+funds+"");
            }
            else{
                //the value is not positive and not possible 
                System.out.println("You did not deposit a positive value");
            }
        }
        //if the user wants to withdraw
        else if(input.equals("withdraw")){
            //print out current funds
            System.out.println("How much would you like to withdraw your current balance is $"+funds+"");
            int withdraw = myScanner.nextInt();
            //if the withdraw is possible with available funds
            if(withdraw<funds){
                //equation for needed funds and display
                funds = funds - withdraw;
                System.out.println("Your balance is now $"+funds+"");
            }
            //not enough funds to make this deposit
            else{
                System.out.println("You do not have the necessary funds to make this withdrawl");
            }
        }
        //if the user just wants to find the balance
        else if(input.equals("funds")){
            //display balance
            System.out.println("Your current balance is $"+funds+"");
        }
        //if the user did not enter a valid command
        else{
            System.out.println("You did not enter a correct command please try again");
        }
    }
}