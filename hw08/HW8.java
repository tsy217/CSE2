import java.util.Scanner;

public class HW8{
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
        String continueN=scan.next();
        if(continueN.equals("c")||continueN.equals("C")){
            return "";
        }
        else{
            System.out.println("Yea right, LOSER!");
            System.exit(0);
        }
        return "";
    }
    public static String getInput(Scanner scan, String string, int trial){
        String userIn=scan.next();
        int t=0;
        while(t<trial){
                
            if(userIn.equals("A")||userIn.equals("a")){
                int cM=(int)(Math.random()*2);
                switch(cM){
                    case 0: System.out.println("OH. MY. GOD. How could you MISS A GIANT?!");break;
                    case 1: System.out.println("TZING! **********CRITICAL HIT********");t++;break;
                }
            }
            else if(userIn.equals("E")||userIn.equals("e")){
                int runN=(int)(Math.random()*11);
                if(runN==10){
                    System.out.println("You are FREE!");
                    return "";
                }
                else{
                    System.out.println("Unsuccessful escape: GIANT blocked the way!");
                }
            }
            if(t<10){
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            userIn=scan.next();
            }
        }
        return "";
    }
    public static String getInput(Scanner scan){
        int boxN=scan.nextInt();
        switch(boxN){
            case 1: System.out.println("You get a STAR!    *    ");
                    break;
            case 2: System.out.println("You get a statue of the GIANT!");
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
                    return "";
            case 3: System.out.println("POISON GAS!!! >:D");
                    System.out.println("You DIED! >:D");
                    System.out.println("LOSER!");
                    return "";
            default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                     System.exit(0);
                     return "";
        }
        return "";
    }
}