//Benedict Kiim
//hw05 ToHex
//2/21/15

import java.util.Scanner;

//public class
public class ToHex{
    //main metod
    public static void main (String[] args){
        //declare scanner
        Scanner myScanner = new Scanner (System.in);
        //ask for inputs
        System.out.println("Enter three values for colors of the pixels (from 0-255): ");
        //initiate array
        int[] x1 = new int[3];
        //initiate hex with "" in order to add on hexidecimals
        String hex = "";
        //checks in order to end loops
        boolean check = true;
        boolean check1 = true;
        //for statement checking if all inputs are integers
        for (int j=0;j<3;j++){
            if (myScanner.hasNextInt()){
                x1[j] = myScanner.nextInt();
                System.out.print(" ");
            }
            else{
                check = false;
                System.out.println("You have not entered an integer");
                break;
            }
        }
        //checking if the values are between 0 and 255
        if(check){
            for(int i=0; i<3; i++){
                if(check1){
                    if(x1[i]>255 || x1[i]<0){
                        System.out.println("You have not entered valid integers between 0 and 255");
                        check1 = false;
                    }
                    else{
                        hex = hex + Integer.toHexString(x1[i]).toUpperCase();
                    }
                }
            }
        }
        //final print statement if all conditions are met
        if(check1){
         System.out.println(hex);
        }
    }
}