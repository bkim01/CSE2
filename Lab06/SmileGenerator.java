//Benedict Kim
//2/25/15
//Lab 06 Smile Generator

//declare class
public class SmileGenerator{
    //main method
    public static void main (String[] args){
        //Step 1 that involves a simple print statement
        System.out.println(":) :) :) :) :)");
        //initiate counters for loop
        int n = 5;
        int m = 5;
        //while look to print out :)
        while (n > 0){
            System.out.print(":) ");
            n--;
        }
        //next line needed
        System.out.println("");
        //while loop involving do, while
        do{
            System.out.print(":) ");
            m--;
        } while(m > 0);
        //next line
        System.out.println("");
        //random number generator STEP 2
        int b = (int) (Math.random() * 100);
        //print out random number just to make sure
        System.out.println(b);
        
        //boolean checking if b is less than 30 and simply prints them out STEP 3
        if (b<=30){
            while(b>0){
                    System.out.print(":) ");
                    b--;
                }
        }
        //checks if the random number is between 30 and 60
        else if (b>30 & b<=60){
            int j = b - 30;
            
            while((b-j)>0){
                System.out.print(":) ");
                b--;
            }
            System.out.println("");
            while(j>0){
                System.out.print(":) ");
                j--;
            }
        }
        //makes if the number is greater than 60
        else{
            int a = b - 60;
            int c = b - 30;
            while((b-c)>0){
                System.out.print(":) ");
                b--;
            }
            System.out.println("");
            int d = 30;
            while(d>0){
                System.out.print(":) ");
                d--;
            }
            System.out.println("");
            while(c>0){
                System.out.print(":) ");
                c--;
            }
        }
        //next line
        System.out.println("");
        System.out.println("");
        
        //for statement incrimenting r until it hits 30 STEP 4
        for(int r = 1; r< 30; r++){
            //counter for the while loop
            int x = 0;
            while(x<r){
                System.out.print(":) ");
                x++;
            }
            System.out.println("");
        }
    }
}