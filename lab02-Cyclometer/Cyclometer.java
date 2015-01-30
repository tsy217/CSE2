//Tsu Kuei Yang
//lab02 Cyclometer
//1/26/2015
//calculate data of bicycle in two trips
//
public class Cyclometer{
    //main method
    public static void main (String[]args) {
        int secTrip1=480;                                       //480seconds in the first trip
        int secTrip2=3220;                                      //3220secs in the 2nd trip
        int countsTrip1=1561;                                   //rotation counts in trip 1
        int countsTrip2=9037;                                   //rotation counts in trip 2
        double wheeldiameter=27.0, PI=3.14169, feetpermile=5280, 
               inchesperfoot=12, secondsperminute=60;           //defining inputs

        System.out.println("Trip 1 took "+(secTrip1/secondsperminute)+      
                            "minutes and had " +countsTrip1+" counts"); //printing Trip1 time and count after calculation
        System.out.println("Trip 2 took "+(secTrip2/secondsperminute)+
                            "minutes and had " +countsTrip2+" counts");  //printing Trip2 time and count after calculation
                            
        double distanceTrip1=countsTrip1*wheeldiameter*PI/inchesperfoot/feetpermile; //calculation of Trip1 distance
        double distanceTrip2=countsTrip2*wheeldiameter*PI/inchesperfoot/feetpermile; //calculation of Tirp2 distance
        double totalDistance=distanceTrip2+distanceTrip1;                            //calculation total distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles");                    //printing out Trip1 distance
        System.out.println("Trip 2 was "+distanceTrip2+" miles");                    //printing out Trip2 distance
        System.out.println("The total distance traveled was " +totalDistance+" miles"); //printint total distnace
    }
}