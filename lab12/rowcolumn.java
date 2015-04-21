//Benedct Kim
//lab12

import java.util.Scanner;

public class rowcolumn{
    public static void main(String args[]){
        int width1 = (int)(Math.random() * 4) + 1;
        int height1 = (int)(Math.random() * 4) + 1;
        int width2 = (int)(Math.random() * 4) + 1;
        int height2 = (int)(Math.random() * 4) + 1;
        int[][] A = IncreasingMatrix(width1, height1, true);
        printMatrix(A, true);
        System.out.println("");
        int[][] B = IncreasingMatrix(width1, height1, false);
        printMatrix(B, false);
        System.out.println("");
        int[][] C = IncreasingMatrix(width2, height2, true);
        printMatrix(C, true);
        System.out.println("");
        int[][] add1 = addMatrix(A, true, B, false);
        printMatrix(add1, true);
        System.out.println("");
        int[][] add2 = addMatrix(A, true, C, true);
        printMatrix(add2, true);
    }
    public static int[][] IncreasingMatrix(int a, int b, boolean c){
        int[][] A = new int[a][b];
        int z = 0;
        if(c){
            for(int i = 0; i<b; i++){
                for(int j = 0; j<a; j++){
                    z++;
                    A[i][j] = z;
                }
            }
        }else{
            for(int i =0; i<a; i++){
                for(int j = 0; j<b; j++){
                    z++;
                    A[j][i] = z;
                }
            }
        }
        return A;
    }
    public static void printMatrix(int[][] A, boolean c){
        int row = A.length;
        int column = A[0].length;
        if(c){
            for(int i = 0; i<column; i++){
                for(int j = 0; j<row; j++){
                    System.out.print(A[i][j] + " ");
                }
                System.out.println("");
            }
        }else{
            for(int i = 0; i<row; i++){
                for(int j = 0; j<column; j++){
                    System.out.print(A[j][i] + " ");
                }
                System.out.println("");
            }
        }
    }
    
    public static int[][] translate(int[][] A){
        int row = A.length;
        int column = A[0].length;
        int[][] B = new int[column][row];
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column; j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
    
    public static int[][] addMatrix(int[][] A, boolean a, int[][] B, boolean b){
        int rowa = A.length;
        int cola = A[0].length;
        int rowb = B.length;
        int colb = A[0].length;
        int[][] C = new int[rowa][cola];
        int[][] D = new int[cola][rowa];
        int[][] E = new int[colb][rowb];
        if(!a){
            D = translate(A);
            for(int i = 0; i<rowa;i++){
                for(int j = 0; j<cola; j++){
                    A[i][j] = D[i][j];
                }
            }
        }
        if(!b){
            E = translate(B);
            for(int i = 0; i<rowb;i++){
                for(int j = 0; j<colb; j++){
                    B[i][j] = E[i][j];
                }
            }
        }
        if(rowa != rowb || cola != colb){
            System.out.println("matricies can not be added");
            return null;
        }else{
            for(int i = 0; i<rowa; i++){
                for(int j = 0; j<cola; j++){
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            return C;
        }
    }
}