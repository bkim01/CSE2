//1.
import java.util.Scanner;

public class fall2014{
    /*åpublic static void main(String args[]){
        boolean check = true;
        for(int j = 9; j>0; j--){
            for(int i = j; i>0; i--){
                System.out.print(" ");
            }
            System.out.print(j);
            System.out.println("");
        }
    }
}*/

//2
/*public static int perplex(int x,int y){
	x+=3;
	y+=x;
	if(y>x+2){ return x; }
	return x+y;
}
public static void main( String args[] ){
	int x=-4,z=7;
	int y=perplex(z,x);
	//System.out.println(y+" "+x);		//(a)
	x=10;
	y=perplex(x,x);
	//System.out.println(y+ " " + x);	//(b)
    System.out.println( perplex(5, 1+perplex(6,7)));	//(c)
}*/

//3
   /* public static void main(String args[]){
        boolean check = true;
        while(check){
            System.out.println("Please enter an integer");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            System.out.println("Please enter an integer greater than the first one");
            Scanner input2 = new Scanner(System.in);
            int y = input.nextInt();
            int k;
            if(y>x){
                check = false;
                k = sum(x,y);
                System.out.println(k);
                }
            else{
                check = true;
            }
        }
    }
    public static int sum(int x1, int y1){
        int k = x1;
        for(int i = x1 + 1; i<=y1; i++){
            k += i;
        }
        return k;
    }*/
    
    //4
    /*int k = a;
    while(k<b){
        k+=c;
    }
    
    int k = a;
    do{
        k+=c
    }while(k<b);
    */
   
   //5
   public static void main(String args[]){
       String y = x(1,"two",3); 
       System.out.println(y);
   }
   public static String x(int a, String b, int c){
		return a+c+b;
	}

	//public static int  x(double a, int b, int c){
	//	return (int)(a+b*c);
	//}
}