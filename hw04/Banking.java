import java.util.Scanner;//notify compiler Scanner location
import java.lang.Math;//notify compiler to use lang.Math
public class Banking{//open class
    public static void main (String[]args){//open main method
        int moneyOwned=(int)((Math.random()*4000)+999);//generate random 1000-5000 in person's account
        System.out.println("You have $"+moneyOwned+" in your account.");//tell user how much money he has
        Scanner myScanner=new Scanner(System.in);//create scanner
        System.out.println("| 1.Deposit | 2.Withdraw | 3.View Balance|");//tell user options
        System.out.print("Enter what you want to do (1, 2 or 3): ");//tell users to only use 1, 2, 3
        int option=myScanner.nextInt();//store user's option in 'option'
        switch(option){//open switch statement
            case 1://case 1 deposit
                System.out.print("How much do you want to deposit? ");//Ask user how much to deposit
                double deposit=myScanner.nextDouble();//store amount in 'deposit'
                if(deposit>0){//open: check if 'deposit' is positive
                    System.out.println("You now have $"+(deposit+moneyOwned)+" in your account."); //Tell user how much money in account after deposit
                }//close: if 'deposit' is positie
                else{//open else: negative or zero
                    System.out.println("You enetered an invalid amount of money.");// tell user he entered invalid amount of money
                }//close else: negative or zero
                break;//break: end case 1
            case 2://case 2 withdraw
                System.out.print("How much do you want to withdraw? ");//Ask user how much he/she wants to withdraw
                double withdraw=myScanner.nextDouble();//store amount in 'withdraw'
                if(withdraw>0){//open: check if 'withdraw' is positive
                    System.out.println("You now have $"+(moneyOwned-withdraw)+" in your account.");//Tell user how much money in account after withdraw
                }//close: if 'withdraw' positive
                else{//open else: invalid
                    System.out.println("You enetered an invalid amount of money.");//Tell user he/she entered invalid amount of money
                }//close else
                break;//break: end case 2
            case 3://case 3: tell user how much money he/she has
                System.out.println("You have $"+(moneyOwned)+" in your account.");//Tell user how much money he/she has
                break;//end case 3
        }//close switch
    }//close main method
}//close class