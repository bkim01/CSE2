//Benedict Kim
//hw06 2/27/15

//import Scanner
import java.util.Scanner;

//public class
public class GetIntegers{
    //main method
    public static void main(String[] args){
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
        //print out needed information
        System.out.println("Please enter 5 non negative integers");
        //create array of 5
        int[] x = new int[5];
        //declare counter for the sum of the 5 integers
        int sum = 0;
        //declare boolean that will end while loop if needed
        boolean check = true;
        //for statement incrementing to every element in array
        for(int i=0; i<5; i++){
            //do-while statement checking if there is a valid input
            do{
                //try statment that will throw errors if input is not a number
                try{
                    x[i] = myScanner.nextInt();
                    check = false;
                    //catches error of non integer
                }catch(Exception e){
                    //ask for input again
                    System.out.println("Please re-enter a valid input");
                    myScanner.next();
                    check = true;
                }
            }while(check);
            //while loop checking for positive integers
            while(x[i] < 0){
                System.out.println("Please re-enter a positve integer");
                x[i] = myScanner.nextInt();
            }
            //counter which is sum of all the integers
            sum = sum + x[i];
        }
        //print out sum
        System.out.println(sum);
    }
}