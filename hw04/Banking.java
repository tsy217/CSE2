import java.util.Scanner;
import java.lang.Math;
public class Banking{
    public static void main (String[]args){
        int moneyOwned=(int)((Math.random()*4000)+999);
        System.out.println("You have $"+moneyOwned+" in your account.");
        Scanner myScanner=new Scanner(System.in);
        System.out.println("| 1.Deposit | 2.Withdraw | 3.View Balance|");
        System.out.print("Enter what you want to do (1, 2 or 3): ");
        int option=myScanner.nextInt();
        switch(option){
            case 1:
                System.out.print("How much do you want to deposit? ");
                double deposit=myScanner.nextDouble();
                if(deposit>0){
                    System.out.println("You now have $"+(deposit+moneyOwned)+" in your account.");
                }
                else{
                    System.out.println("You enetered an invalid amount of money.");
                }
                break;
            case 2:
                System.out.print("How much do you want to withdraw? ");
                double withdraw=myScanner.nextDouble();
                if(withdraw>0){
                    System.out.println("You now have $"+(moneyOwned-withdraw)+" in your account.");
                }
                else{
                    System.out.println("You enetered an invalid amount of money.");
                }
                break;
            case 3:
                System.out.println("You have $"+(moneyOwned)+" in your account.");
                break;
        }
    }
}