//Benedict Kim
//hw06 2/27/15


import java.util.Scanner;

public class GetIntegers{
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Please enter 5 non negative integers");
        int[] x = new int[5];
        boolean check = true;
        int sum = 0;
        for(int i=0; i<5; i++){
            if(myScanner.hasNextInt()){
                x[i]=myScanner.nextInt();
                if(x[i]<0){
                    System.out.println("You have not entered positive integers");
                    check = false;
                }
            }
            else{
                System.out.println("You have not entered valid inputs");
                check = false;
                break;
            }
        }
        
        System.out.println("");
            if(check){
                for(int j= 0; j<5; j++){
                   sum = sum + x[j];
                }
                System.out.print(sum);
            }
        
    }
}