import java.util.Scanner;
public class ZIGZAG{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        while(true){
            int nStars=-1;
            while(nStars<3||nStars>33){
                System.out.print("Enter an integer b/w 3 and 33: ");
                while(!scan.hasNextInt()){
                    String throwaway=scan.next();
                    System.out.print("Invalid input, re-enter an interger within [3,33]: ");
                }
                nStars=scan.nextInt();
            }
            for(int s3=2;s3<=nStars;s3+=1){
                System.out.print("*");
            }

            for(int s1=2;s1<=nStars;s1+=1){
                System.out.println("*");
                if(s1==nStars){
                    continue;
                }
                for(int s2=2;s2<=s1;s2+=1){
                    System.out.print(" ");
                }
            }

            for(int s4=1;s4<=nStars;s4+=1){
                System.out.print("*");
            }
            
            System.out.print("\n");
            System.out.print("Enter y or Y to go again: ");
            String option=scan.next();
            if(option.equals("y")||option.equals("Y")){
              
            }
            else{
                break;
            }
        }
    }
}