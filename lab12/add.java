//Benedict Kim
//lab12

public class add{
    public static void main(String args[]){
        int height = (int)(Math.random() *3) +2;
        int width = (int)(Math.random() *3) +2;
        int height1 = (int)(Math.random() *3) +2;
        int width1 = (int)(Math.random() *3) +2;
        int[][] add = new int[height][width];
        int[][] add1 = new int[height][width];
        int[][] A = new int[height][width];
        int[][] B = new int[height][width];
        int[][] C = new int[height1][width1];
        A = increaseMatrix(height, width, true);
        printMatrix(A);
        B = increaseMatrix(height, width, false);
        printMatrix(B);
        C = increaseMatrix(height1, width1, true);
        printMatrix(C);
        if(addMatrix(A,B) == null){
            
        }else{
            add = addMatrix(A,B);
            printMatrix(add);
        }
        if(addMatrix(A,C) == null){
            
        }else{
            add1 = addMatrix(A, C);
            printMatrix(add1);
        }
    }
    
    public static int[][] increaseMatrix(int height, int width, boolean c){
        int[][] D = new int[height][width];
        int count = 0;
        if(c){
            for(int i = 0; i<height; i++){
                for(int j = 0; j<width; j++){
                    count++;
                    D[i][j] = count;
                }
            }
        }else{
            for(int i = 0; i<width; i++){
                for(int j = 0; j<height; j++){
                    count++;
                    D[j][i] = count;
                }
            }
        }
        return D;
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
            System.out.println("");
        }
    }
    
    public static int[][] translate(int[][] A){
        int temp;
        int height = A.length;
        int width = A[0].length;
        int[][] D = new int[width][height];
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                temp = A[i][j];
                D[j][i] = temp;
            }
        }
        return D;
    }
    
    public static int[][] addMatrix(int[][] A, int[][] B){
        int Aheight = A.length;
        int Bheight = B.length;
        int Awidth = A[0].length;
        int Bwidth = B[0].length;
        int[][] D = new int[Aheight][Awidth];
        if(Aheight != Bheight || Awidth != Bwidth){
            System.out.println("Matricies can not be added");
            return null;
        }else{
            for(int i = 0; i<Aheight; i++){
                for(int j = 0; j<Awidth; j++){
                    D[i][j] = A[i][j] + B[i][j];
                }
            }
            return D;
        }
    }
}