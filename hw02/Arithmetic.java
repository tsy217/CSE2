//Tsu Kuei, Yang
//1/26/2015
//hw02 Arithmetic
//compute cost of items I bought in Walmart
//

import java.text.DecimalFormat;                                                 //telling compiler where the command is

public class Arithmetic{
    public static void main(String[]args){                                      //main method
        DecimalFormat myformat = new DecimalFormat ("##.00");                   //declare my decimal format
        int nSocks=3;                                                           //declare and assign #ofsocks
        double sockCost$=2.58;                                                  //declare and assign sockCost
        int nGlass=6;                                                           //declare and assign #ofglass
        double glassCost$=2.29;                                                 //declare and assign glassCost
        int nEnvelopes=1;                                                       //declare and assign #ofevnelope
        double envelopeCost$=3.25;                                              //declare and assign envelopeCost
        double taxPercent=0.06;                                                 //declare and assign taxPercent
        double sockTotal$=(sockCost$*nSocks);                                   //calculating sockTotal
        double glassTotal$=(glassCost$*nGlass);                                 //calculating glassTotal
        double envelopeTotal$=envelopeCost$*nEnvelopes;                         //calculating envelopeTotal
        double total$=sockTotal$+glassTotal$+envelopeTotal$;                    //calculating total
        double totalstax$=total$*taxPercent;                                    //calculating totalstax
        System.out.println("Total cost of socks is "
        +(myformat.format(sockTotal$))+ " and sales tax is " 
        +(myformat.format(sockTotal$*taxPercent))+ " dollars");                 //print out and change deci format and calculate tax% of socks
        System.out.println("Total cost of glass is "
        +(myformat.format(glassTotal$))+ " and sales tax is " 
        +(myformat.format(glassTotal$*taxPercent))+ " dollars");                //print out and change deci format and calculate tax% of glass
        System.out.println("Total cost of envelope is "
        +(myformat.format(envelopeTotal$))+ " and sales tax is "
        +(myformat.format(envelopeTotal$*taxPercent))+ " dollars");             //print out and change deci format and calculate tax% of envelope
        System.out.println("Total before tax is "+(myformat.format(total$))+ 
        " dollars");                                                            //print out and change deci format of total before tax
        System.out.println("Total after tax is " +(myformat.format(total$+totalstax$))+ 
        " dollars");                                                            //print out and change deci format and calculate total+tax 
    }
}