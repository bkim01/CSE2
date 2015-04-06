//Benedict Kim
//lab 10

import java.util.Scanner;

public class ArrayInputs{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        System.out.println("Please enter the size of your array");
        int size = scan.nextInt();
        //declare integer size to be the size of the array
        int[] array = new int[size];
        while(check){   //continuous loop until broken
            for(int i = 0; i<size; i++){    //for loop to assign values in empty cells
                System.out.println("Please enter a positive integer");
                if(scan.hasNextInt()){  //if the input is an integer
                    int x = scan.nextInt(); //assign x to be the integer
                    if(x>0){    //if it is positive
                        array[i] = x;   //assign a cell in the array the value of x
                    }
                    else{   //error message
                        System.out.println("Not a positive integer");
                        i--;    //run the loop one more time
                    }
                }
                else{   //if the input is not an integer
                    System.out.println("Not an integer");   //error message
                    i--;
                    scan.next();    //redeclare scanner
                }
            }
            if(array.length == size){   //if array is populated then break out of loop
                check = false;
            }
        }
        //print out array
        System.out.println("Here is your array");
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }
}