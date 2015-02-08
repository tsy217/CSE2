//Tsu Kuei Yang
//hw03 4digits
//2.7.2015
//
//
import java.util.Scanner; //tell compiler where to find the command
import java.text.DecimalFormat; //tell compiler where to find the command
public class FourDigits{
    public static void main (String[]args){ //main method
        Scanner input=new Scanner(System.in); //construct Scanner
        System.out.println("Enter a double and I display the four digits to the right of the decimal point: "); //prompt user to enter a double
        double number=input.nextDouble(); //declare and assign number as next input
        int firstDigit=(int)(number*10)%10; //find out the first digit right to the decimal point
        int secondDigit=(int)(number*100)%10; //find out the second digit right to the decimal point
        int thirdDigit=(int)(number*1000)%10; //find out the third digit right to the decimal point
        int fourthDigit=(int)(number*10000)%10; //find out the fourht digit right to the decimal point
        System.out.println("The four digits are number "+firstDigit+secondDigit+thirdDigit+fourthDigit+".");
        
    }
}