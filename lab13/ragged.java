public class ragged{
    public static void main (String args[]){
        int[][] A = new int[5][];
        int width;
        for(int i = 0; i<5; i++){
            width = (i*3)+5;
            A[i] = new int[width];
            
        }
        A = random(A);
        printMatrix(A);
        A = sort(A);
        printMatrix(A);
        A = copy(A);
        printMatrix(A);
        
    }
    public static void printMatrix(int[][] A){  //method to print matrix
        
        int height = A.length;
        if(height==0){  //does nothing if matrix has dimension of 0
            
        }else{
            for(int i = 0; i<height; i++){  //print out rows of elements
                for(int j = 0; j<A[i].length; j++){
                    System.out.print(A[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static int[][] random(int[][] A){
        for(int i = 0; i<5; i++){
            for(int j = 0; j<A[i].length; j++){
                A[i][j] = (int)(Math.random() * 39);
            }
        }
        return A;
    }
    public static int[][] sort(int[][] A){
        boolean check = true;
        int temp;
        int temp1;
        for(int i = 0; i<5; i++){
            while(check){
                check = false;
                for(int j = 0; j<A[i].length-1; j++){
                    if(A[i][j] > A[i][j+1]){
                        temp = A[i][j];
                        temp1 = A[i][j+1];
                        A[i][j] = temp1;
                        A[i][j+1] = temp;
                        check = true;
                    }
                }
            }
        }
        return A;
    }
    
    public static int[][] copy(int[][] A){
        int[][] B = new int[5][17];
        for(int i = 0; i <5; i++){
            for(int j = 0; j<A[i].length; j++){
                if(A[i][j] != 0){
                    B[i][j] = A[i][j];
                }
            }
        }
        return B;
    }
}