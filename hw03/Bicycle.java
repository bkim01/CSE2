//Benedict Kim
//hw03 Bicycle
//2/6/15

//scanner has to be imported
import java.util.Scanner;

//class
public class Bicycle{
    
//main method
    public static void main (String[] args) {
//declare scanner for seconds
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter the time in seconds it took: ");
        Double seconds = myScanner.nextDouble();
//declare scanner for counts
        System.out.print("Enter the number of counts: ");
        double counts = myScanner.nextDouble();
        
//needed constants
        int diameter = 27;
        double pi = 3.1415;
        int inchespermile = 5280 * 12;
        
        
//needed formulas
        double distance=pi * diameter * counts / (inchespermile);
        double distance1 =(double) Math.round(distance*100)/ 100;
        double minutes = seconds/60;
        double hours = minutes/60;
        double mph = distance / hours;
        double mph1 =(double) Math.round (mph*100)/ 100;
        
//print out system
        System.out.print("The distance was "+distance1+" miles and took "+minutes+" minutes and the average speed was "+mph1+"");
        
    }
    
    
}

