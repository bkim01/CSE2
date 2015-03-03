//Benedict Kim
//hw 06 2/27/15

//import scanner
import java.util.Scanner;

//class
public class RunFactorial{
    //main method
    public static void main(String[] args){
        //import scanner
        Scanner myScanner = new Scanner (System.in);
        //ask user for input
        System.out.println("Please enter a non negative integer");
        //make x the input
        int x = myScanner.nextInt();
        //declare counter for factorial
        int z = 1;
        //check if x is positive
        if(x>0){
            //for loop using y as counter and mulitplying y and z
            for (int y = 1; y<=x; y++){
                z = z * y;
            }
            System.out.println(z);
        }
        else{
            System.out.println("You have not entered a valid input");
        }
    }
}