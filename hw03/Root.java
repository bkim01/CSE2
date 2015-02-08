//Benedict Kim
//hw03 Root
//2/6/15

//scanner has to be imported
import java.util.Scanner;

//class
public class Root{
    
//main method
    public static void main (String[] args) {
//needed scanner for the double
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a double: ");
        double x = myScanner.nextDouble();
        
//initial guess        
        double guess = x/3;
        System.out.println("The first estimate is "+guess+"");
        
//formula run 5 times         
        double guess1 = (2*guess*guess*guess+x)/(3*guess*guess);
        double guess2 =(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
      
//cube of final estimate      
        double cube = guess5*guess5*guess5;

//print statemetents
        System.out.println("The improved estimate is "+guess5+"");
        System.out.println("The cube of the estimate is "+cube+"");
    }}