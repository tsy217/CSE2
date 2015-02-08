//Tsu Kuei Yang
//hw03 Bicycle
//2.3.2015
//
//
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bicycle{
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        DecimalFormat myformat=new DecimalFormat("##.00");
        System.out.println("Enter the # of seconds: ");
        double time = input.nextInt();
        System.out.println("Enter the # of counts: ");
        int counts=input.nextInt();
        double wheeldiameter=27.0, PI=3.14169, feetpermile=5280, 
        inchesperfoot=12, secondsperminute=60;
        double distance=counts*wheeldiameter*PI/inchesperfoot/feetpermile;
        time/=60;
        double avgMph=(distance/(time/60));
        System.out.println("The distance was "+(myformat.format(distance))+" miles and took "
        +(myformat.format(time))+" minutes.");
        System.out.println("The average speed was "+(myformat.format(avgMph))+" mph.");
        
    }
}