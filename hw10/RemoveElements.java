//Benedict Kim
//hw10
import java.util.Arrays;
import java.util.Scanner;
public class RemoveElements{
    public static void main(String [] arg){
        
	    Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int Array[];
        int index,target;
	    String answer="";
	    do{
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
  	        System.out.print("Enter the index ");
  	        index = scan.nextInt();
  	        newArray1 = delete(num,index);
  	        String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
  	        String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer=scan.next();
	    }while(answer.equals("Y") || answer.equals("y"));

    }
 
    public static String listArray(int num[]){
	    String out="{";
	    for(int j=0;j<num.length;j++){
  	        if(j>0){
        	out+=", ";
  	    }
  	    out+=num[j];
	    }
	    out+="} ";
	    return out;
    }

//method to create the array
    public static int[] randomInput(){
        int x[] = new int[10];  //declare array with 10 elements
        int y = 0;  //declare an int y
        for(int i = 0; i<10; i++){  //for loop 10 times
            y = (int)(Math.random()*10);    //assign y a random integer between 1 and 10
            x[i]=y;     //assign y to a cell in the array
        }
        return x;   //return x
    }
//method to remove a specific element in array
    public static int[] delete(int[] list, int pos){
        if(pos < 0 || pos>9){   //if a number less than 0 or greater than 9 is entered
            System.out.println("The index is not valid");   //error message
            return list;    //return original 
        }
        else{
            int n[] = new int[list.length - 1]; //new array with 9 cells
            for(int i = 0; i<n.length; i++){
                if(i < pos){    //if the cell# is less than the target cell
                    n[i] = list[i]; //assign same values
                }
                else{
                    n[i] = list[i+ 1];  //after the element in n is the element in the next list
                }
            }
            return n;   //return n
        }
    }
//method to declare different integers to be removed
    public static int[] remove(int[] list, int target){
        int a = 0;  //declare a - length of new array
        int z = 0;  //integer z
        boolean check = true;
        for(int i = 0; i< list.length; i++){
            if(list[i] == target){  //if the target is in the array continue
                check = true;
                break;
            }
            else{
                check = false;  //if the target is not in the array
            }
        }
        //size of the new array
        for (int i = 0; i<list.length; i++){
            if(list[i] == target){
                
            }
            else{
                a++;
            }
        }
        //declare the new array with size a
        int[] n = new int[a];
        if(check){
            for(int i = 0; i<list.length; i++){
                if(list[i] == target){  //if target is in array, increase z by 1
                    z++;
                }else{
                    n[i-z] = list[i];   //if not target, assign cell in n value in List
                }
            }
            return n;   //return new array
        }
        else{   //error message
            System.out.println("Element "+target+" was not found");
            return list;    //return original list
        }
    }
    
}