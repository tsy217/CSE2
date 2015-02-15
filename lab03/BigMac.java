// 2.2.2015
// Tsu Kuei Yang
// lab03 - BigMac
//
//
import java.util.Scanner;


public class BigMac{
    public static void main (String [] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the # of BigMacs (as an integer>0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.println("Enter the cost per BigMac as"
        +" a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole # (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate /=100;
        
        double cost$;
        int dollars, dimes, pennies;
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        dollars = (int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"
        +bigMac$+" per bigMac, with a sales tax of " +(int)(taxRate*100)+
        "%, is $" +dollars+'.'+dimes+pennies);
        
    }
}
