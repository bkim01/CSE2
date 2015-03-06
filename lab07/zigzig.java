//Benedict Kim
//lab07 zigzig
//3/6/15

//import sanner
import java.util.Scanner;

//declare public class
public class zigzig{
    //main method
    public static void main (String[] args){
        //Step 1
        int nstars = 10;
        while(nstars > 0){
            System.out.print("*");
            nstars--;
        }
        System.out.println("");
        //decalre boolean run to initate or terminate while loop
        boolean run = true;
        //start while loop
        while (run){
            //ask user for inputs
            System.out.println("Please enter an integer between 3 and 33");
            Scanner myScanner = new Scanner (System.in);
            //check if user input is an integer
            if(myScanner.hasNextInt()){
                nstars = myScanner.nextInt();
                //check if input is within range
                if(nstars>=3 & nstars<=33){
                    //counters
                    int j = nstars;
                    int i = j - 2;
                    //print out first line
                    while(nstars > 0){
                        System.out.print("*");
                        nstars--;
                    }
                    //reset nstar
                    nstars = j;
                    System.out.println("");
                    //print out the diagnol
                    while(i>0){
                        for(int k=nstars- 1; k>i; k--) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        System.out.println("");
                        i--;
                    }
                    //reset nstars
                    nstars = j;
                    //last line of stars
                    while(nstars > 0){
                        System.out.print("*");
                        nstars--;
                    }
                }
                //error message if input is not in the range
                else{
                    System.out.println("Integer not in range");
                }
                //scanner for input string y or Y
                System.out.println("Enter y or Y to go again or end to exit");
                Scanner myScanner1 = new Scanner (System.in);
                String runagain = myScanner1.next();
                //terminates or ends loop
                if(runagain.equals("y") || runagain.equals("Y")){
                    run = true;
                }
                else{
                    run = false;
                }
            }
            else{
                System.out.println("Please re-enter a valid integer");
                run = true;
            }
        }
    }
}