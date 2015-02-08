//Tsu Kuei Yang
//hw03 4digits
//2.7.2015
//
//
import java.util.Scanner;
import java.text.DecimalFormat;
public class FourDigits{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a double and I display the four digits to the right of the decimal point: ");
        double number=input.nextDouble();
        int firstDigit=(int)(number*10)%10;
        int secondDigit=(int)(number*100)%10;
        int thirdDigit=(int)(number*1000)%10;
        int fourthDigit=(int)(number*10000)%10;
        System.out.println("The four digits are number "+firstDigit+secondDigit+thirdDigit+fourthDigit+".");
        
    }
}