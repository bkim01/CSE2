import java.util.Scanner;
public class spring2014{
//1
    /*public static void main (String args[]){
        for(int i = 0; i<5; i++){
            for(int j = (5-i); j<=5; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(int j = 5; j<10; j++){
            for (int k =j; k<10; k++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static int perplex(int x,int y){
	x++;
	y+=x;
	System.out.println(x+" "+y);
	return x+y;
}

//2
public static void main( String args[] ){
	int x=3,z=5;
	int y=perplex(x,z);
	System.out.println(y+" "+x+" "+z);
	x=10;
	y=perplex(x,x);
	System.out.println(y+ " " + x);
}
//3
    public static void main(String args[]){
        boolean check = true;
        do{
            System.out.println("Please enter a positive integer");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                int y = scan.nextInt();
                if(y>0){
                int z = sumq(y);
                System.out.println(z);
                }
            }
            
        }while(check);
    }
    public static int sumq(int x){
        int y = 0;
        for(int i=1; i<=x; i++){
            y = y + (i*i);
        }
        return y;
    }
    
//4
    public static void main(String args[]){
        System.out.println("Please enter a positive integer");
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        if(y<0){
            System.out.println(0);
        }else{
            int x = sumPow(y);
            System.out.println(x);
        }
    }
    public static int sumPow(int y){
        int z = 0;
        for(int i=1; i<=y; i++){
            int k = 1;
            for(int j = 1; j<=i; j++){
                k = k* i;
            }
            z = z + k;
        }
        return z;
    }
    
    public static void main(String args[]){
        boolean check = true;
        do{
            System.out.println("Input a positive integer(0) to exit: ");
            Scanner scan = new Scanner (System.in);
            if(scan.hasNextInt()){
                int x = scan.nextInt();
                if(x>0){
                    String z = isPrime(x);
                    System.out.println(z);
                }
                else if (x< 0){
                    System.out.println("integer is not positive");
                }
                else{
                    check = false;
                }
            }else{
                System.out.println("Invalid input");
            }
        }while(check);
        
    }
    
    public static String isPrime(int a){
        int b = (int)(Math.sqrt(a));
        String z = "Prime!";
        String y = "Not Prime!";
        for(int c = 2; c<=b; c++){
            if(a%c == 0){
                return y;
        }
    }
    return z;
}
public static void main(String[] args){
        for(int i=2; i<=4; i++){
            for (int j = 0; j<=i; j++){
            for(int k = 0; k<j; k++){
                System.out.print("b");
            }
            System.out.println("");
        }}
    }
public static String convertToDay( int a ){
String b = "";
switch(a){
    case 1: b = "Monday";
            break;
    case 2 : b = "Tuesday";
    break;
    case 3 : b = "Wednesday";
    break;
    case 4: b = "Thursday";
    break;
    case 5: b = "Friday";
    break;
    case 6: b = "Saturday";
    break;
    default: b = "Sunday";
}
return b;
  }

  public static void main( String args[] ){
boolean check = true;
do{
    System.out.println("Please enter a number between 1 and 7, 0 to exit");
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    if(x>7 || x<0){
        System.out.println("not a day");
    }
    else if (x == 0){
        check = false;
    }
    else{
        String y = convertToDay(x);
        System.out.println(y);
    }
}while(check);
}}

public static double X(int i, int j, int k){
int z = result;
     if( i < z ){
         z = i;
     } 	
     if( k < z ){	
         z = k;	
}
return z;
  }*/

public static void main(String args[]){
        for(int j = 2;  j<=5; j++){
            for(int k = 0; k<j; k++){
                System.out.println("");
                for(int i = 0; i<k; i++){
                System.out.print("b");
            }
}}}}