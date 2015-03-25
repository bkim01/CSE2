//Benedict Kim
//3/24/15
//hw08

import java.util.Scanner;       //import util java

public class hw08{              //public class
    
    public static void main(String[] args) {    //main method
            Scanner scan = new Scanner(System.in);
            //declare scanner
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            //intro print statement
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            //print statment for continuation
            getInput(scan, "Cc");
            //altered program, no string statement just a method
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            getInput(scan, "Cc");
            //altered method, no string statment
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            //print out cave diagram
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            getInput(scan, "Cc");
            //altered method, no string statement
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            getInput(scan, "Cc");
            //altered method once again
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            //print out giant figure
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            getInput(scan, "AaEe", 10);
            //once again altered method
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            //print out boxes
            getInput(scan);
            System.out.println("Hero! Have a good day!");
        }
  public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    public static void getInput(Scanner scan, String string){
        String check = scan.next();
        //declare scanner
        if(check.equals("c") || check.equals("C")){
            //simply continue if user writes c or C
        }
        else{
            //if anything except c or C is inputed the main method ends
            System.out.println("Yea right LOSER");
            System.exit(1);
        }
    }
    public static void getInput(Scanner scan, String string, int trial){
        boolean run = true;     //boolean check to end while loop if needed
        String check;
        int health = 10;    //health for the giant
        while(run){
            check= scan.next();
            //declare scanner every time
            if(check.equals("a") || check.equals("A")){
                //if they want to attack
                double attack = Math.random() * 1;
                //random value between 0 and 1
                if(Math.round(attack) == 1){
                    //round value to get either 0 or 1
                    System.out.println("Critical Hit");
                    //decrease health if hit
                    health=health- 1;
                    if(health == 0){
                    //when the giant runs out of health
                    System.out.println("You have killed the giant");
                    break;
                    }
                }
                else if(Math.round(attack) == 0){
                    //if the attack misses
                    System.out.println("Gosh how can you miss?");
                }
            }
            else if(check.equals("e") || check.equals("E")){
                //if the user wants to escape
                double rand = Math.random() * 10;
                //random number between 0 and 10
                if(Math.round(rand) == 10){
                    //integers between 1 and 10
                    System.out.println("You have escaped successfuly!");
                    //if correct then the user can escape
                    run = false;
                    //ends while loop
                    break;
                }
                else{
                    System.out.println("You have not escaped!");
                    //if the escape fails
                }
            }
            else{
                System.out.println("Executed by the Giant, Game Over");
                //if a wrong input is entered, the user dies
                run = false;
                System.out.println("Game Over");
                System.exit(1);
            }
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            //reprint statement
        }
    }
    public static void getInput(Scanner scan){
        //check if the user enters a number
        if(scan.hasNextInt()){
            int x = scan.nextInt();
            //declare x to be the scanner
            switch (x){ //switch case
                case 1 : System.out.println("It's an armor upgrade!"); //if input = 1
                        break;
                case 2 : System.out.println("It's an attack upgrade!"); //if input = 2
                        break;
                case 3 : System.out.println("New Character Unlocked!"); //if input = 3
                        break;
                default: System.out.println("Wrong Number! better play again"); //default statement
            }
        }
        else{   //if a number is not entered
            System.out.println("Whoops, wrong number better play again");
        }
    }
}