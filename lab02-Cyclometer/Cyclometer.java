//Benedict Kim
//lab 2
//1/30/15

//public class
public class Cyclometer {
    public static void main(String[] args) {
        int secTrip1 = 480;
        int secTrip2 = 3220;
        int countsT1= 1561;
        int countsT2 = 9037;
        double diameter = 27.0;
        int inchespermile = 5280*12;
        int secondsperminute = 60;
        int timeTrip1=secTrip1/secondsperminute;
        int timeTrip2=secTrip2/secondsperminute;
        double pi = 3.1415;
        double distanceT1=pi * diameter * countsT1 / (inchespermile);
        double distanceT2= pi * diameter * countsT2 / (inchespermile);
        double total = distanceT2 + distanceT1;


        System.out.println("Trip 1 took "+timeTrip1+" minutes and had "+countsT1+" counts ");
        System.out.println("Trip 2 took "+timeTrip2+" minutes and had "+countsT2+" counts ");
        System.out.println("Trip 1 was "+distanceT1+" miles long");
        System.out.println("Trip 2 was "+distanceT2+" miles long");
        System.out.println("The total distance was "+total+" miles");

        
        

}

}
