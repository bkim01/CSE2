//Benedict Kim
//lab05 Space Exploration
//2/18/15

//declare class
public class SpaceExploration{
    
    //main method
    public static void main (String [] args){
        //assign x a random value between 2010 and 2000
        int x = (int)(Math.random()*11) + 2000;
    
        //switch case
        switch (x){
            case (2010):
                //case if x = 2010
                System.out.println("2010:SpaceX sucessfully sends spacecraft to orbit and back");
            case (2009):
                //case if x = 2009
                System.out.println("2009:N/A");
            case 2008:
                //case if x = 2008
                System.out.println("2008: Kepler launched to study deep space");
            case 2007:
                //case if x = 2007
                System.out.println("2007: N/A");
            case 2006:
                //case if x = 2006
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                //case if x = 2005
                System.out.println("2005:Spacecraft collies with comet");
            case 2004:
                //case if x = 2004
                System.out.println("2004: N/A ");
            case 2003:
                //case if x = 2003
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
                //case if x = 2002
                System.out.println("2002: N/A");
            case 2001:
                //case if x = 2001
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000:
                //case if x = 2000
                System.out.println("2000: First spacecraft orbits an asteroid");
                //default case with print statement
            default: System.out.println("Here is the timeline for space exploration from 2000 to "+x+"");
            break;

        }
}}