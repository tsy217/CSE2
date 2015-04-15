import java.util.Scanner;
import java.util.Random;

public class hw11{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int[]grades=new int[15];
        
        int lastI=0;
        int input=0;
        System.out.println("Enter 15 ints for the final grades: ");
        
        for(int i=1;i<=grades.length;i++){
            if(scan.hasNextInt()){
                input=scan.nextInt();
                if(input<0||input>100){
                    System.out.println("Grades must be in between 1-100%.");
                    i--;
                }
                else if(input<lastI){
                    System.out.println("Grades must be entered from lowest to highest.");
                    i--;
                    continue;
                    
                }
                else{
                    grades[i-1]=input;
                }
                lastI=input;
            }
            else{
                System.out.println("You did not enter an int. GoodBye.");
            }
        }
        System.out.print("The grades, sorted, are: ");
        for(int j=0;j<grades.length;j++){
            System.out.print(grades[j]+" ");
        }
        
        System.out.println("");
        System.out.print("Search for grade: ");
        int search=scan.nextInt();
        int iT=0;
        int x=0;
        int y=grades.length-1;
        int z=(x+y)/2;
        while(x<=y){
            iT++;
            if(grades[z]==search){
                System.out.println("I found the number "+search+" within "+iT+" iterations.");
                break;
            }
            else if(grades[z]>search){
                y=z-1;
            }
            else if(grades[z]<search){
                x=z+1;
            }
            z=(x+y)/2;
        }
        if(grades[z]!=search){
            System.out.println(search+" was not found, withtin "+iT+" iterations.");
        }
        
        int temp=0;
        int shuffle=0;
        for(int k=grades.length-1;k>0;k--){
            shuffle=random.nextInt(k+1);
            temp=grades[shuffle];
            grades[shuffle]=grades[k];
            grades[k]=temp;
        }
        System.out.println("Scrambled ");
        for(int l=0;l<grades.length;l++){
            System.out.print(grades[l]+" ");
        }
        System.out.println("");
        System.out.println("Enter a grade to search for: ");
        search=scan.nextInt();
        int m=0;
        int n=0;
        while(m!=search){
            if(grades[n]==search){
                m=grades[n];
                System.out.println(search+" was found in the list with "+(n+1)+" iterations");
            }
            n++;
        }
    }
}