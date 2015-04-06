//Benedict Kim
//lab 10

import java.util.Scanner;

public class ArrayInputs{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        System.out.println("Please enter the size of your array");
        int size = scan.nextInt();
        int[] array = new int[size];
        while(check){
            for(int i = 0; i<size; i++){
                System.out.println("Please enter a positive integer");
                if(scan.hasNextInt()){
                    int x = scan.nextInt();
                    if(x>0){
                        array[i] = x;
                    }
                    else{
                        System.out.println("Not a positive integer");
                        i--;
                    }
                }
                else{
                    System.out.println("Not an integer");
                    i--;
                    scan.next();
                }
            }
            if(array.length == size){
                check = false;
            }
        }
        System.out.println("Here is your array");
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
    }
}