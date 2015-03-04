import java.util.Scanner;

public class GetIntegers{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int total=0;
        System.out.println("Input 5 non-negative integer: ");
        for(int askInput=0; askInput<5; askInput+=1){
            
            if(scan.hasNextInt()){
                int number=scan.nextInt();
                if(number>0){
                    total+=number;
                }
                else{
                    System.out.println("Please enter a non negative integer.");
                    askInput--;
                }
            }
            else{
                String a=scan.next();
                System.out.println("Invalid input, enter again: ");
                askInput--;
            }
            
        }
        System.out.println("Sum is: "+total);
    }
}