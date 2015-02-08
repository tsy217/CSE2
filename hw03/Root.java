//Tsu Kuei Yang
//hw03 Bicycle
//2.3.2015
//
//
import java.util.Scanner; //tell compiler where to find the command
    public class Root{
        public static void main (String[]args){ //main method
            Scanner input= new Scanner(System.in); //construct Scanner
            System.out.println("Enter a double, and I print it's cube root: "); //prompt user to enter a double
            double number=input.nextDouble(); //declare number and assign it to input
            double cuberoot1=number/3; //first cube root guess
            double result1=cuberoot1*cuberoot1*cuberoot1; //result of first guess

            double cuberoot2=(result1+number)/(3*cuberoot1*cuberoot1); //second cube root guess
            double result2=cuberoot2*cuberoot2*cuberoot2; //result of second guess

            double cuberoot3=(2*result2+number)/(3*cuberoot2*cuberoot2); //third cube root guess
            double result3=cuberoot3*cuberoot3*cuberoot3; //result of third guess

            double cuberoot4=(2*result3+number)/(3*cuberoot3*cuberoot3); //fourth cube root guess
            double result4=cuberoot4*cuberoot4*cuberoot4; //result of fourth guess

            double cuberoot5=(2*result4+number)/(3*cuberoot4*cuberoot4); //fifth cube root guess
            double result5=cuberoot5*cuberoot5*cuberoot5; //result of fifth guess
            
            double cuberoot6=(2*result5+number)/(3*cuberoot5*cuberoot5); //sixth cube root guess
            double result6=cuberoot6*cuberoot6*cuberoot6; //result of sixth guess
            System.out.println("-------------------------------------------------------------------------------------------"); //print a - line
            System.out.println("The cube root is "+cuberoot6+"."); //tell user what the cube root is
            System.out.println(+cuberoot6+"*"+cuberoot6+"*"+cuberoot6+" = "+result6+"."); //show user the result of the cuberoot
        }
    }