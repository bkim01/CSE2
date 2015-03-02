//Benedict Kim
//hw06 2/27/15

import java.util.Scanner;

public class MakeSymbols{
    public static void main(String[] args){
        int x = (int) (Math.random()*100);
        System.out.println(x);
        if(x%2 == 0){
            do{
                System.out.print("^");
                x--;
            }while(x>0);
        }
        else{
            do{
                System.out.print("*");
                x--;
            }while(x>0);
        }
    }
}