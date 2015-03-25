//Benedict Kim
//3/24/15
//hw08

import java.util.Scanner;

public class practice{
    
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
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
    public static String getInput(Scanner scan, String string){
        if(!string.equals("c") || !string.equals("C")){
            System.out.println("Yea right LOSER");
        }
    }
    public static String getInput(Scanner scan, String string, int trial){
        boolean run = true;
        while(run){
            if(string.equals("a") || string.equals("A")){
                int health = 10;
                double attack = Math.random() * 1;
                if(Math.round(attack) == 1){
                    System.out.println("Critical Hit");
                    health--;
                }
                else if(Math.round(attack) == 0){
                    System.out.println("Gosh how can you miss?");
                }
                else if(health == 0){
                    System.out.println("You have killed the giant");
                }
            }
            else if(string.equals("e") || string.equals("E")){
                double rand = Math.random() * 1;
                if(Math.round(rand) == 10){
                    System.out.println("You have escaped successfuly!");
                    run = false;
                }
            }
            else{
                System.out.println("Executed by the Giant, Game Over");
                run = false;
            }
        }
    }
    public static String getInput(Scanner scan){
        if(scan.hasNextInt()){
            int x = scan.nextInt();
            switch (x){
                case 1 : System.out.println("It's an armor upgrade!");
                case 2 : System.out.println("It's an attack upgrade!");
                case 3 : System.out.println("New Character Unlocked!");
                default: System.out.println("Wrong Number! better play again");
            }
        }
    }
}