//Benedict Kim
//hw 06 2/27/15

import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Please enter a non negative integer");
        int x = myScanner.nextInt();
        int z = 1;
        if(x>0){
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