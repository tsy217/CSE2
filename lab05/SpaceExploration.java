import java.util.Scanner;//notify compiler Scanner location
import java.lang.Math;//notify compiler to use lang.Math
public class SpaceExploration{//open class
public static void main(String[]arg){
    int finalYear=(int)(Math.random()*11)+2000;
    System.out.println("Here is a timeline of space exploration events from "+finalYear+" to 2000: ");
    switch(finalYear){
        case 2010:System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back.");
        case 2008:System.out.println("2008: Kepler launched to study deep space");
        case 2006:System.out.println("2006: Spacecraft returns with collections from a comet");
        case 2005:System.out.println("2005: Spacecraft collies with comet");
        case 2003:System.out.println("2003: Largest infrared telescope released");
        case 2001:System.out.println("2001: First spacecraft lands on asteroid");
        case 2000:System.out.println("2000: First spaceship orbits and asteroid"); break;
        default: System.out.println("Program Error");
    }
}
}
