//Benedict Kim
//3/17/15
//lab 08

import java.util.Scanner;   //import scanner

public class factorials{    //declare class
        public static int factorial(int input1){    //factorial method
        int fact = 1;   //factorial counter
        for(int count = 1; count <= input1; count++){   //for loop to find factorial
            fact = fact * count;
        }
        return fact;    //brings fact to other methods
    }

    public static void printf(int num){ //print method
        System.out.println("The super factorial is " +num);
    }
    
    public static void main(String args[]){ //main method
        boolean check = true;       //checking boolean
        System.out.println("Please enter a positive integer");
        Scanner input = new Scanner(System.in); //import scanner
        if(!input.hasNextInt()){    //check if input is a number
            check = false;
            System.out.println("You have not entered an integer");
        }
        if(check){      //continues if integer is entered
            int total = 0;
            int x = input.nextInt();        //decalre integer
            if(x<0){        //if the input is negative end method
                System.out.println("You have not entered a positve integer");
            }
            else{       //if all cases fit then find super factorial
                for(int i = 1; (i <= x); i++){      //for statement to find super factorial
                    total = total + factorial(i);
                }
                printf(total);      //method to print out the super factorial;
            }
        }
    }
}