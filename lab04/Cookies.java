
import java.text.DecimalFormat;  
import java.util.Scanner;
public class Cookies{
    public static void main (String[]args){
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter the number of people (as an integer>0): ");
        if(myScanner.hasNextInt()){
            int nPpl=myScanner.nextInt();
            if(nPpl>0){
                System.out.print("Enter the number of cookies you are planning to buy: ");
                if(myScanner.hasNextInt()){
                    int nCookies=myScanner.nextInt();
                    if(nCookies>0){
                        System.out.println("How many cookies does each person get? ");
                        int nPerPerson=myScanner.nextInt();
                        if(nPerPerson>0){
                            double nPpl2=(double)nCookies/(double)nPpl;
                            if(nPpl2>nPerPerson){
                                if(nCookies%nPpl==0){
                                    System.out.println("You have enough cookies for each person and the amount will divide equally");
                                }
                                else{
                                    System.out.println("You have enough cookies, but they will not divide equally");
                                }
                            }
                            else if(nPpl2<nPerPerson){
                                System.out.println("You will not have enough cookies. You need to buy atleast "
                                +((nPerPerson*nPpl)-nCookies)+" more.");
                            }
                        }
                        else{
                            System.out.println("The number you entered is negative or zero");
                        }
                    }
                    else{
                        System.out.println("The number you entered is negative or zero");
                    }
                }   
                else{
                    System.out.println("You did not enter an integer");
                    return;
                }
            }
            else if(nPpl<=0){
                System.out.print("The number you entered is negative or zero");
                return;
            }
        }
        else{
            System.out.println("You did not enter an integer");
            return;
        }
   }
}
    