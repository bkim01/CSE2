//Benedict Kim
//Hw 13

import java.util.Scanner;

public class FourDwin{
    public static void main(String args[]){ //main method
        System.out.println("Please enter an integer X ");   
        int x = input();
        System.out.println("Please enter an integer Y where Y > X");
        int y = input();
        while(y<x){
            System.out.println("Y is not greater than X, please reenter");
            y = input();
        }

        double[][][][] A = new double[3][][][]; //declare 4 dimensional array
        double[][][][] B;
        A[0] = new double[x + (int)(Math.random() * y)][x + (int)(Math.random() * y)][x + (int)(Math.random() * y)];
        A[1]= new double[x + (int)(Math.random() * y)][x + (int)(Math.random() * y)][x + (int)(Math.random() * y)];
        A[2] = new double[x + (int)(Math.random() * y)][x + (int)(Math.random() * y)][x + (int)(Math.random() * y)];
        A = fill(A);    //fill array with random integers
        System.out.println("Unsorted");
        print(A);   //print out unsorted aray
        statArray(A);   //void method to get stats
        B= sort4DArray(A);  //sort the array
        System.out.println("Sorted by insertion");
        print(B);   //print sorted array
        System.out.println("Sorted by selection");
        B= sort3DArray(A);
        print(B);
        
    }


 public static int input(){  //method to check for inputs
        boolean check = true;
        Scanner scan = new Scanner(System.in);  //declare scanner
        int a = 0;
        while(check){   //will run until proper inputs are created
            if(scan.hasNextInt()){  //if input is and integer
                a = scan.nextInt();
                if(a<0){    //if input is positive integer
                    System.out.println("Input invalid not positive");
                }
                else{
                    check = false;
                }
            }else{
                System.out.println("invalid input not an integer");
                scan.next();
            }
        }
        return a;
    }
    
    public static double[][][][] fill(double[][][][] A){    //method to fill array
        for(int i = 0; i<3; i++){
            for(int j = 0; j<A[i].length; j++){
                for(int k = 0; k<A[i][j].length; k++){
                    for(int m = 0; m<A[i][j][k].length; m++){   //4 for loops for 4 D array
                        A[i][j][k][m] = (double)((int)((Math.random() * 30) * 10)) / 10;    //random doubles
                    }
                }
            }
        }
        return A;
    }
    
    public static void statArray(double[][][][] A){ //void method to print out statistics
        double sum = 0.0;
        int count = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<A[i].length; j++){
                for(int k = 0; k<A[i][j].length; k++){
                    for(int m = 0; m<A[i][j][k].length; m++){
                        sum += A[i][j][k][m];
                        count++;    //counts number of elements
                    }
                }
            }
        }
        double mean = sum / count; //elements
        System.out.println("The sum of the elements is: "+sum);
        System.out.println("The mean of the elements is: " +mean);
        System.out.println("The number of elements is: " +count);
    }
    
    public static void print(double[][][][] A){ //print out array
        for(int i = 0; i<3; i++){
            System.out.print("{ ");
            for(int j = 0; j<A[i].length; j++){
                System.out.print("{ ");
                for(int k = 0; k<A[i][j].length; k++){
                    System.out.print("{ ");
                    for(int m = 0; m<A[i][j][k].length; m++){
                        System.out.print(A[i][j][k][m] + ", ");
                    }
                    System.out.print("}, ");
                }
                System.out.print("}, ");
            }
            System.out.print("}");
        }
        System.out.println("");
    }
    
    public static double[][][][] sort4DArray(double[][][][] A){ //insertion sort array
        
        for(int i =1; i<A.length; i++){ //insertion sort for loop
            double[][][] temp=A[i]; //temporary array
            int j;
            int k;
            for(j=i-1; j>=0 && temp.length>A[j].length; j--){   //how to insertion sort
                A[j+1]=A[j];
            }
            for(j=i-1; j>=0 && temp.length>A[j].length; j--){
                A[j+1]=A[j];
            }
            A[j+1]=temp;
                
        }
            return A;
    }
    
    public static double[][][][] sort3DArray(double[][][][] A){ //selection sort
        int i,j,first;
        double[][][] temp;  //temporary array
        for(i=A.length-1;i>0;i--){  
            first = 0;
            for(j = 1; j<=1; j++){
                if(A[j].length<A[first].length){
                    first = j;
                }
                temp = A[first];
                A[first] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
