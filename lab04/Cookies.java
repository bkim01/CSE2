//Benedict Kim
//lab04 Cookies
//2/11/15

//scanner has to be imported
import java.util.Scanner;

//class
public class Cookies{
    
//main method
    public static void main (String[] args) {
        //needed scanner for the double
        Scanner myScanner = new Scanner (System.in);
        //input from user needed
        System.out.print("Enter number of people: ");
        
        //check if the input is a integer
        if (!myScanner.hasNextInt()) {
            System.out.println("Sorry, you did not enter an integer");
        }
        else{
            //declare people as the input variable
            int people = myScanner.nextInt();
            //if statement for if the input is valid
            if (people == ((int)people) && people>0){
                //input for number of cookies
                System.out.print("Enter the number of cookies you are planning to buy: ");
                int cookies = myScanner.nextInt();
                //input for how the cookies should be split
                System.out.print("How many do you want each person to get? ");
                //necessary variables
                int each = myScanner.nextInt();
                int total = people * each;
                int rem = cookies % people;
                int more = total - cookies;
                //if inputs are true 
                if(rem==0 && total<cookies){
                    System.out.print("You have enough cookies for each person and the amount will divide evenly.");
                } 
                //if the cookies won't split evenly
            else if(rem!=0 && total<cookies) {
                    System.out.print("you have enough cookies but it won't split evenly");
                }
                //checking if you need more cookies
            else if(total>cookies){
                System.out.print("You don't have enough cookies you need "+more+" more");
                }
                
            }
         //if the first if statement is invalid
         else{
             System.out.println("You did not enter a integer > 0");
         }
            
        }
    }
}
