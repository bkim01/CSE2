//Benedict Kim
//hw02 Arithmetic
//1/30/15

//class
public class Arithmetic {
//main method
    public static void main(String [] args){
//given variables
        int nsocks=3;
        double sockcost = 2.58;
        int nglass = 6;
        double glasscost = 2.29;
        int nenvelopes = 1;
        double envelopescost = 3.25;
        double tax = .06;

//cost before tax
        double totalsockcost = nsocks * sockcost;
        double  totalglasscost = nglass * glasscost;
        double totalenvelopescost = nenvelopes * envelopescost;
        double totalb4tax = totalsockcost+totalglasscost+totalenvelopescost;

//taxes taken into account for individual items
        double taxsocks = totalsockcost * tax;
        double taxglass = totalglasscost * tax;
        double taxenvelopes = totalenvelopescost * tax;
        double taxtotal = taxsocks+taxglass+taxenvelopes;

//total costs for each item
        double totalsocks = taxsocks + totalsockcost;
        double totalglass = taxglass + totalglasscost;
        double totalenvelope = taxenvelopes + totalenvelopescost;
    
//total cost before and after tax
        double total = totalsockcost + totalenvelope + totalglass;
        double totaltax = (total * tax) + total;
//printed statements
        System.out.println(""+nsocks+" socks were bought at $"+sockcost+"");
        System.out.println("The tax is $"+tax+" and the total cost is $"+taxsocks+"");
        System.out.println(""+nglass+" glasses were bought at $"+glasscost+"");
        System.out.println("The tax is $"+tax+" and the total cost is $"+taxglass+"");
        System.out.println(""+nenvelopes+" envelopes were bought at $"+envelopescost+"");
        System.out.println("The tax is $"+tax+" and the total cost is $"+taxenvelopes+"");
        System.out.println("before tax = $"+totalb4tax+"");
        System.out.println("sales tax was $"+tax+"");
        System.out.println("total tax was $"+taxtotal+"");
        System.out.println("total is $"+totaltax+"");
    }
    
    
    
}