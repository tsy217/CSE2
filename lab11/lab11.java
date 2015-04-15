import java.util.Scanner;

public class lab11{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        int size=50;
        int[]array1=new int[size];
        int[]array2=new int[size];
        int assignN=0;
        
        for(int i=0;i<size;i++){
            assignN=(int)(Math.random()*100);
            array1[i]=assignN;
        }
        
        int temp=array1[0];
        for(int j=1;j<size;j++){
            if(temp>array1[j]){
                temp=array1[j];
            }
        }
        System.out.println("The maximum of array1 is: "+temp);
        for(int k=0;k<size;k++){
            if(temp<array1[k]){
                temp=array2[k];
            }
        }
        System.out.println("The minimum of array1 is: "+temp);
        
        
        for(int l=0;l<size;l++){
            assignN=(int)(Math.random()*100*(l+1));
            array2[l]=assignN;
        }
        System.out.println("The maximum of array2 is: "+array2[49]);
        System.out.println("The minimum of array2 is: "+array2[0]);
        
        System.out.print("Enter an int: ");
        int input=0;
        if(scan.hasNextInt()){
            input=scan.nextInt();
            if(input<0){
                System.out.println("You did not enter an int >0, GoodBye.");
                System.exit(0);
            }
        }
        else{
            System.out.println("You did not enter an int. GoodBye.");
            System.exit(0);
            
        }
        
        int m=0;
        int temp2=0;
        
        int x=0;
        int y=size-1;
        int z=(x+y)/2;
        while(x<=y){
            if(array2[z]==input){
                System.out.println("I found the number "+input+" at array2["+z+"].");
                break;
            }
            else if(array2[z]>input){
                y=z-1;
            }
            else if(array2[z]<input){
                x=z+1;
            }
            z=(x+y)/2;
        }
        if(array2[z]!=input){
            System.out.println(input+" was not found in the list");
            System.out.println("The number above the input is "+array2[x]+" x:"+x);
            System.out.println("The number below the input is "+array2[y]+" y:"+y);
        }
    }
}