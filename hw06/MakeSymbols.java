//Benedict Kim
//hw06 2/27/15

//import scanner
import java.util.Scanner;

//public class
public class MakeSymbols{
    //main method
    public static void main(String[] args){
        //create random number between 1 and 100
        int x = (int) (Math.random()*100);
        //print out random for reference
        System.out.println(x);
        //check if even using mod
        if(x%2 == 0){
            //loop for printing
            do{
                System.out.print("^");
                x--;
            }while(x>0);
        }
        //if the random number is odd
        else{
            do{
                System.out.print("*");
                x--;
            }while(x>0);
        }
    }
}