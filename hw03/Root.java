//Tsu Kuei Yang
//hw03 Bicycle
//2.3.2015
//
//
import java.util.Scanner;
    public class Root{
        public static void main (String[]args){
            Scanner input= new Scanner(System.in);
            System.out.println("Enter a double, and I print it's cube root: ");
            double number=input.nextDouble();
            double cuberoot1=number/3;
            double result1=cuberoot1*cuberoot1*cuberoot1;

            double cuberoot2=(result1+number)/(3*cuberoot1*cuberoot1);
            double result2=cuberoot2*cuberoot2*cuberoot2;

            double cuberoot3=(2*result2+number)/(3*cuberoot2*cuberoot2);
            double result3=cuberoot3*cuberoot3*cuberoot3;

            double cuberoot4=(2*result3+number)/(3*cuberoot3*cuberoot3);
            double result4=cuberoot4*cuberoot4*cuberoot4;

            double cuberoot5=(2*result4+number)/(3*cuberoot4*cuberoot4);
            double result5=cuberoot5*cuberoot5*cuberoot5;
            
            double cuberoot6=(2*result5+number)/(3*cuberoot5*cuberoot5);
            double result6=cuberoot6*cuberoot6*cuberoot6;
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("The cube root is "+cuberoot6+".");
            System.out.println(+cuberoot6+"*"+cuberoot6+"*"+cuberoot6+" = "+result6+".");
        }
    }