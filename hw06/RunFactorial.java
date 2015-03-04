import java.util.Scanner;
public class RunFactorial{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter an integer that is between 9 and 16: ");
        int number=0;
        int total=1;
        if(scan.hasNextInt()){
            number=scan.nextInt();
            if(number>=9&&number<=16){
                for(int run=0;run<number;run+=1){
                     total*=(number-run);
                }
                System.out.println(number+"! = "+total);
            }
            else{
                do{
                        System.out.print("Invalid input, enter again: ");
                        number=scan.nextInt();
                }while(number<9&&number>16);
                for(int run2=0;run2<number;run2+=1){
                     total*=(number-run2);
                }
                System.out.println(number+"! = "+total);
            }
        }
        else{
            String throwAway=scan.next();
            do{
                System.out.print("Invalid input, enter again: ");
                number=scan.nextInt();
            }while(number<9&&number>16);
            for(int run3=0;run3<number;run3+=1){
                     total*=(number-run3);
            }
            System.out.println(number+"! = "+total);
        }
    }
}
