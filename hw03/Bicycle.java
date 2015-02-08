//Tsu Kuei Yang
//hw03 Bicycle
//2.3.2015
//
//
import java.util.Scanner;//telling compiler where the command is                                                   
import java.text.DecimalFormat;//telling compiler where the command DecimalFormat is
public class Bicycle{ //open class
    public static void main (String[]args){ //main method
        Scanner input= new Scanner(System.in); //construct scanner
        DecimalFormat myformat=new DecimalFormat("##.00"); //construct my deicmal format into 2 decimals
        System.out.println("Enter the # of seconds: "); //prompt user to enter # of seconds
        double time = input.nextInt(); //declare time and define it as the input
        System.out.println("Enter the # of counts: "); //prompt user to ender # of counts
        int counts=input.nextInt(); //declare time and define it as the input
        double wheeldiameter=27.0, PI=3.14169, feetpermile=5280, 
        inchesperfoot=12, secondsperminute=60; //declare and assign set variables 
        double distance=counts*wheeldiameter*PI/inchesperfoot/feetpermile; //calculate the distance
        time/=60; //convert time into minutes
        double avgMph=(distance/(time/60)); //calculate the avgMph
        System.out.println("The distance was "+(myformat.format(distance))+" miles and took "
        +(myformat.format(time))+" minutes."); //tell user the distance, and the time whilst casting my decimal format
        System.out.println("The average speed was "+(myformat.format(avgMph))+" mph."); //tell user the avgMph whilst casting my decimal format
        
    }
}