//Tsu Kuei, Yang
//1/26/2015
//hw02 Arithmetic
//compute cost of items I bought in Walmart
//
import java.util.Scanner;
import java.text.DecimalFormat;

public class Arithmetic{
    public static void main(String[]args){
        DecimalFormat myformat = new DecimalFormat ("##.00");
        
        int nSocks=3;
        double sockCost$=2.58;
        int nGlass=6;
        double glassCost$=2.29;
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        double sockTotal$=(sockCost$*nSocks);
        double glassTotal$=(glassCost$*nGlass);
        double envelopeTotal$=envelopeCost$*nEnvelopes;
        double total$=sockTotal$+glassTotal$+envelopeTotal$;
        double totalstax$=total$*taxPercent;
        System.out.println("Total cost of socks is "
        +(myformat.format(sockTotal$))+ " and sales tax is " 
        +(myformat.format(sockTotal$*taxPercent))+ " dollars");
        System.out.println("Total cost of glass is "
        +(myformat.format(glassTotal$))+ " and sales tax is " 
        +(myformat.format(glassTotal$*taxPercent))+ " dollars");
        System.out.println("Total cost of envelope is "
        +(myformat.format(envelopeTotal$))+ " and sales tax is "
        +(myformat.format(envelopeTotal$*taxPercent))+ " dollars");
        System.out.println("Total before tax is "+(myformat.format(total$))+ " dollars");
        System.out.println("Total after tax is " +(myformat.format(total$+totalstax$))+ " dollars");
    }
}