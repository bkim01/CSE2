//Benedict Kim
//hw04 WhichNumber
//2/13/15

//import scanner
import java.util.Scanner;

//declare class
public class WhichNumber{
    
    //main method
    public static void main (String [] args){
        //initial statement
        System.out.println("Think of a number between 1 and 10");
        //scanner declared
        Scanner myScanner = new Scanner (System.in);
        
        //first case if the number is even
        System.out.println("Is the number even?");
        String input1 = myScanner.next();
        //if the even number is divisble by 3
        if(input1.equals("yes")){
            System.out.println("Is the number dividisble by 3");
            String input2 = myScanner.next();
            //if previous cases were true then the number is 6
            if(input2.equals("yes")){
                System.out.println("your number is 6");
           }
           //if the even number is not divisible by 3
            else if(input2.equals("no")){
                //is the number dividsble by 4
                System.out.println("Is the number divisible by 4");
                String input3 = myScanner.next();
                //if the multiple of 4 is 4 or 8
                if(input3.equals("yes")){
                    System.out.println("Is the number divided by 4 greater than 1?");
                    String input4 = myScanner.next();
                    //the number will be 8 if the multiple of 4 is 2
                    if(input4.equals("yes")){
                        System.out.println("Your number is 8");
                    }
                    else if(input4.equals("no")){
                        //the number is 4 if the multiple of 4 is 1
                        System.out.println("Your number is 4");
                    }
                    else{
                        System.out.println("sorry that is not a valid input");
                    }
                }
                //find out if the number is divisble by 5
                else if (input3.equals("no")){
                    System.out.println("Is the number divisible by 5");
                    String input5 = myScanner.next();
                    //if the number is divisble by 5 then the number is 10
                    if(input5.equals("yes")){
                        System.out.println("Your number is 10");
                    }
                    else if(input5.equals("no")){
                        //the number is 2
                        System.out.println("Your number is 2");
                    }
                    else{
                      System.out.println("sorry that is not a valid input");
                    }
                    
                }
                else{
                    System.out.println("sorry that is not a valid input");
                }
            }
            else{
            System.out.println("sorry that is not a valid input");
                
            }
        }
        //if the number is odd
        else if(input1.equals("no")){
            System.out.println("Is the number divisible by 3");
            String input6 = myScanner.next();
            //if the number is divisible by 3
            if(input6.equals("yes")){
                //case for multiples of 3
                System.out.println("When divided by 3 is the result greater than 1?");
                String input7 = myScanner.next();
                if(input7.equals("yes")){
                    //if it is a multiple greater than 1 then it is 9
                    System.out.println("your number is 9");
                }
                else if(input7.equals("no")){
                    //if the multiple is 1 then the number is 3
                    System.out.println("Your number is 3");
                }
                else{
                 System.out.println("sorry that is not a valid input");
            }
            }
            else{
                //check if the number is greater than 6
                System.out.println("Is it greater than 6?");
                String input8 = myScanner.next();
                //if it is then the number is 7
                if(input8.equals("yes")){
                System.out.println("Your number is 7");
                }
                else if (input8.equals("no")){
                    //check if it is less than 3
                    System.out.println("Is it less than 3?");
                    String input9 = myScanner.next();
                    if(input9.equals("yes")){
                        //if yes then the number is 1
                        System.out.println("Your number is 1");
                    }
                    else if (input9.equals("no")){
                        //if it is greater than 3 the number is 5
                        System.out.println("Your number is 5");
                    }
                    else{
            System.out.println("sorry that is not a valid input");
                }
            }
                else{
            System.out.println("sorry that is not a valid input");
                    
                }

            }
            
        }
        else{
            System.out.println("sorry that is not a valid input");
        }
        
    }
    
}