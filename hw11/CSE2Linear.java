//Benedict Kim
//Hw #11
//4/14/15

import java.util.Scanner;   //import scanner

public class CSE2Linear{        //declare class
    public static void main(String args[]){ //declare main method
        Scanner scan = new Scanner(System.in);  //declare scanner
        System.out.println("Please enter 15 final grades");//ask for inputs
        int[] A = new int[15];  //create array size 15
        for(int i = 0; i < 15; i++){
            if(scan.hasNextInt()){  //check if input is an integer
                int x = scan.nextInt();
                if(x < 0 || x > 100){   //check if input is in bounds
                    System.out.println("invalid input not <100 or > 0");
                    i--;
                }
                else{
                    if(i==0 || (x >= A[i-1])){ //check if input is greater than previous input
                        A[i] = x;       //add input to the array
                    }
                    else{
                        System.out.println("grade is not greater than previous input");
                        i--;
                    }
                }
            }
            else{
                System.out.println("input was not an integer");
                i--;
                scan.next();        
            }
        }
        for(int i = 0; i < 15; i++){
            System.out.print(" " + A[i]);   //print array
        }
        System.out.println("");
        boolean check = true;
        while(check){   //while loop to enter a positive integer
            System.out.println("Please enter a grade to be searched");
            if(scan.hasNextInt()){  //if input is an integer
                int a = scan.nextInt();
                binary(A,a);    //method binary to check
                check = false;  //exit out of loop
            }else{
                System.out.println("Please enter an integer");
                scan.next();
            }
        }
        Scramble(A);    //method scramble
    }
    
    public static void binary(int[] a, int b){  //method binary
        int low = 0;    //low value
        int high = 15;  //high value
        int c = 0;  //counter for iterations
        boolean check = true;
        while(low<=high){   //while loop
            c++;    //iteration counter
            int middle = (int)(low + high) / 2; //make middle the average of high and low
            if(a[middle] == b){ //break out if input is found
                check = false;
                break;
            }
            else if(a[middle] > b){ //to check upper half
                high = middle - 1;
            }
            else{   //to check lower half
                low = middle + 1;
            }
        }
        if(!check){ //check determining which of the statemetns to print
            System.out.println(b+" was found with " +c+" iterations");
        }else{
            System.out.println(b+" was not found with " +c+" iterations");
        }
        return;
    }
    
    public static void Scramble(int[] a){   //method scramble
        Scanner scan = new Scanner(System.in); 
        int[] random = new int[15];
        System.out.println("Scramble: ");   
        for(int i = 0; i<15; i++){ //fill new array randomly
            int b =(int)(Math.random() * (15));
            if(random[b] == 0){ //if cell is empty
                random[b] = a[i];
            }
            else{
                i--;    
            }
        }
        for(int i = 0; i < 15; i++){    //print statement
            System.out.print(" " + random[i]);
        }
        System.out.println("");
        boolean check = true;
        int x = 0; 
        while(check){   //gets input that is an integer
            System.out.println("Please enter a grade to be searched");
            if(scan.hasNextInt()){
                x = scan.nextInt();
                check = false;
            }else{
                System.out.println("Please enter an integer");
                scan.next();
            }
        }
        boolean check2 = true;
        boolean check1 = false;
        int c = 0;
        while(check2){  //linear search with counter for iterations
            for(int i = 0; i<15; i++){
                c++;
                if(x == random[i]){
                    check1 = true;
                    check2 = false;
                    break;
                }
            }
        }
        if(check1){ //print statements if input was found
            System.out.println(x+" was found with "+c+ " iterations");
        }
        else{
            System.out.println(x+" was not found with "+c+ " iterations");

        }
        return;
    }
    
}