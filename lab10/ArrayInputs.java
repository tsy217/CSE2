import java.util.Scanner;
public class ArrayInputs{
    public static void main(String[] args){
        int input=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        int size=scan.nextInt();
        int[] inputs=new int[size];
        System.out.print("Please enter "+size+" positive integers: ");
        for(int i=0;i<size;i++){
            input=scan.nextInt();
            if(input<0){
                System.out.print("Please enter "+(size-i)+" more postive integers: ");
                i--;
            }
            else{
                inputs[i]=input;
            }
        }
        System.out.println("The array is: ");
        for(int j=0;j<size;j++){
            System.out.println(inputs[j]);
        }
    }
    
}