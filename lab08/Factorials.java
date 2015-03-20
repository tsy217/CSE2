import java.util.Scanner;

public class Factorials{
    public static int Factorial (int input){
        int fac=1;
        int sum=0;
        int limit=input;
        for(int s=1;s<=input;s+=1){
            for(int f=1;f<=limit;f+=1){
                fac*=f;
            }
            sum+=fac;
            limit--;
            fac=1;
        }
        return sum;
    }
    
    public static void Print(int input, int sum){
        System.out.println("The super factorial of "+input+" is "+sum+".");
    }
    
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("!!!Superfactorial Calculator!!!");
        System.out.print("Enter a positive integer: ");
        int n=scan.nextInt();
        if(n>0){
            int superFac=Factorial(n);
            Print(n,superFac);
        }
        else{
            System.out.println("Invalid input: only positive integer");
        }
    }
    
}