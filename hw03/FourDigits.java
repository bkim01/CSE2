//Benedict Kim
//hw03 FourDigits
//2/6/15

//scanner has to be imported
import java.util.Scanner;
import java.text.DecimalFormat;
//class
public class FourDigits{
    
//main method
    public static void main (String[] args) {
//needed decimal format        
        DecimalFormat df = new DecimalFormat("0000");
        Scanner myScanner;
//declare scanner        
        myScanner = new Scanner (System.in);
//input double        
        System.out.print("Enter a double: ");
        double x = myScanner.nextDouble();
//needed formulas        
        double x1 = x - Math.floor(x);
        double x2 = x1*10000;
       
//change decimal into needed format        
        String x4 = df.format(x2);
    
//print statement        
        System.out.println("The four digits are "+x4+"");
        
    }}