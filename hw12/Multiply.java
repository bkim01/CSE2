//Benedict Kim
//Hw12
//4/21/15

import java.util.Scanner;   //import scanner

public class Multiply{   //declare class
    public static void main(String args[]){ //main method
        System.out.println("Enter the height of the first matrix"); //ask for sizes
        int height = input();   //implement input method to check for correct inputs
        System.out.println("Enter the width of the first matrix");
        int width = input();
        System.out.println("Enter the height of the second matrix");
        int height1 = input();
        System.out.println("Enter the width of the second matrix");
        int width1 = input();
        System.out.println(""); 
        int A[][] = randomMatrix(height, width);    //create matrix with random inputs with user defined dimensions
        printMatrix(A); //print matrix
        System.out.println("");
        int B[][] = randomMatrix(height1, width1);
        printMatrix(B);
        System.out.println("");
        int C[][] = matrixMultiply(A, B);   //multiply matricies
        if(C == null){  //if matricies can't be multiplied dont print out anything
            
        }else{
            printMatrix(C); //print out multiplication of 2 matricies
        }
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
    
    public static int[][] randomMatrix(int height, int width){  //creates matrix with random elements
        int[][] A = new int[height][width]; //create matrix
        for(int i = 0; i<height; i++){  //for loop to fill in empty cells
            for(int j = 0; j<width; j++){
                int random = (int)(Math.random() * 2);  //returns either 1 or 0
                if(random < 1){ 
                    A[i][j] = (int)(Math.random() * 10); //assigns positive number
                }else{
                    A[i][j] = (int)(Math.random() * -10);   //assigns negative number
                }
            }
        }
        return A;
    }
    
    public static int[][] matrixMultiply(int[][] A, int[][] B){ //method to multiply matricies
        int Awidth = A[0].length;   //assign integers for height and width
        int Aheight = A.length;
        int Bwidth = B[0].length;
        int Bheight = B.length;
        int[][] C = new int[Aheight][Bwidth];   //create new array with proper dimensions
        boolean check = true;
        int x = 0;
        if(Awidth == Bheight){  //runs if dimensions are suitable to be multiplied
            
        }else{
            check = false;
        }
        if(check){  //creates proper elemnts to fill in cells of empty matrix
            for(int i = 0; i<Aheight; i++){
                for(int j = 0; j<Bwidth; j++){
                    for(int k = 0; k<Awidth; k++){
                        x = x + A[i][k]*B[k][j];
                    }
                    C[i][j] = x;
                    x = 0;
                }
            }
        }
        else{
            System.out.println("Matrices can not be multiplied");   //error message if matricies can't be multiplied
            return null;
        }
        return C;
    }
    public static void printMatrix(int[][] A){  //method to print matrix
        int width = A[0].length;
        int height = A.length;
        if(width==0 || height==0){  //does nothing if matrix has dimension of 0
            
        }else{
            for(int i = 0; i<height; i++){  //print out rows of elements
                for(int j = 0; j<width; j++){
                    System.out.print(A[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}