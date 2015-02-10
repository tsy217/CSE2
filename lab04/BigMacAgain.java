
import java.text.DecimalFormat;  
import java.util.Scanner;
public class BigMacAgain{
    public static void main(String[]args){
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter the # of BigMacs (as an integer>0): ");
        
        if(myScanner.hasNextInt()){
            DecimalFormat myFormat=new DecimalFormat("##.00");
            int nBigMacs=myScanner.nextInt();
            double priceMacs=2.22;
            double macCost=nBigMacs*priceMacs;
            double friesCost=2.15;
            if(nBigMacs>0){
                System.out.println("You ordered "+nBigMacs+ " Big Macs for a cost of "
                +(myFormat.format(macCost)));
                System.out.print("Do you want fries? (y/Y/n/N)  ");
                String answer=myScanner.next();
                if(answer.equals("y")||answer.equals("Y")){
                    System.out.println("You ordered fries at a cost of "+friesCost);
                    System.out.println("Total Cost is: "+(myFormat.format(macCost+friesCost)));
                }
                else if(answer.equals("n")||answer.equals("N")){
                    System.out.println("Total Cost is: "+(myFormat.format(macCost)));
                }
                else{
                    System.out.println("You did not enter y/Y/n/N");
                }
            }
            else if(nBigMacs<=0){
                System.out.println("The number you entered is negative or zero");
            }
        }
        else{
            System.out.println("What you entered was not an integer");
            return;
        }
        
    }
}
