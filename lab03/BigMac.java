//Benedict Kim
//lab03
//2/6/15

//scanner has to be imported
import java.util.Scanner;

//class
public class BigMac {
//main method
    public static void main(String [] args){
//Scanner for number of Big Macs
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter the number of BigMacs: ");
        int nBigMacs = myScanner.nextInt();
        
//Scanner for price of Big Macs
        System.out.print("Enter the price of a BigMac: ");
        double bigMac$ = myScanner.nextDouble();
        
//Scanner for the tax
        System.out.print("Enter the sales tax as a whole number: ");
        double tax = myScanner.nextDouble()/100;

//find the needed cost
        double cost = nBigMacs*bigMac$*(1+tax);
        
//break up the cost so that there will be only two places after the .
        int dollars = (int) cost;
        int dimes =  (int) (cost*10)%10;
        int pennies = (int) (cost*100)%100;
        int change = dimes+pennies;
        
//print out the needed information
        System.out.println("The total cost of "+nBigMacs+" BigMacs at $"+bigMac$+" with a tax of "+tax+"% will be $"+dollars+"."+change+"");
        
        
        
        
    }}