//Benedict Kim
//hw07 3/17/15

import java.util.Scanner;   //import scanner

public class waves{     //declare class
    public static void main(String[] args){ //main method
        boolean run = true; //boolean to run while loops
        System.out.println("Please enter an integer between 1 and 30");
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();    //inputed integer
        if(x<1 || x >30 ||){
            run = false;    //stops while loop
        }
        System.out.println("For loop: ");   //for loop
        if(x>1 || x < 30){      
            for(int i = 1; i<=x; i++){      //loop for lines
                for(int k = i; k>0; k--){   //loop for characters
                    if(i%2 != 0){       //if the number is even
                        for(int m = 0; m<k; m++){
                            System.out.print(i);
                        }
                    }
                    else{   //if the number is odd
                        for(int n=0; n<=(i-k); n++){
                            System.out.print(i);
                        }
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("");
        System.out.println("While loop: "); //while loop
        while(run){
            int i1 = 1; //variable for lines
            while(i1<=x){
                int k1= i1;
                while(k1>0){    //while loop for number of characters
                    if(i1%2 != 0){  //if it is even
                        int m1 = 0;
                        while(m1<k1){
                            System.out.print(i1);
                            m1++;
                        }
                    }else{  //if it is odd
                        int n1 = 0;
                        while(n1<=(i1-k1)){
                            System.out.print(i1);
                            n1++;
                        }
                    }
                    System.out.println("");
                
                    k1--;
                }
                i1++;
            }
            break;
        }
        System.out.println("");
        System.out.println("Do while loop: ");  //do while loop
        do{
            int i2 =1;  //counter
            do{
               int k2 = i2;
               do{
                   if(i2%2 != 0){   //if it is odd
                       int m2 = 0;
                       do{
                           System.out.print(i2);
                           m2++;
                       }while(m2<k2);
                     }
                     else{      //if it is even
                         int n2 = 0;
                         do{
                             System.out.print(i2);
                             n2++;
                         }while(n2<=(i2-k2));
                     }
                System.out.println("");
                k2--;
               }while(k2>0);
               i2++;
            }while(i2<=x);
            break;
        }while(run);
    }
}