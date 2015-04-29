import java.util.Scanner;
import java.text.DecimalFormat;
public class FourDwin{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an integer X: ");
        int x=0;
        while(x==0){
            if(scan.hasNextInt()){
                x=scan.nextInt();
            }
            else{
                System.out.print("Invalid input. Please enter an integer: ");
                String invalid=scan.next();
            }
        }
        System.out.print("Enter and integer Y such that Y>X: ");
        int y=0;
        while(y==0){
            if(scan.hasNextInt()){
                y=scan.nextInt();
                if(x>y){
                    System.out.print("Invalid input. Please enter an integer for Y>x: ");
                    y=0;
                }
            }
            else{
                System.out.print("Invalid input. Please enter an integer for Y>X: ");
                String invalid=scan.next();
            }
        }
        DecimalFormat myformat=new DecimalFormat("##.00"); 
        double[][][][] fourD=new double[3][(int)(Math.random()*((y-x)+1))+x][(int)(Math.random()*((y-x)+1))+x][(int)(Math.random()*((y-x)+1))+x];
        for(int i=0;i<fourD.length;i++){
            for(int j=0;j<fourD[i].length;j++){
                for(int k=0;k<fourD[i][j].length;k++){
                    for(int l=0;l<fourD[i][j][k].length;l++){
                        double random=Math.random()*31;
                        random=Math.floor(random * 10) / 10;
                        fourD[i][j][k][l]=random;
                    }
                }   
            }
        }
        System.out.println("Original Array");
        printArray(fourD);
        fourD=sort4DArray(fourD);
        fourD=sort3DArray(fourD);
        System.out.println();
        System.out.println("Sorted Array");
        printArray(fourD);
        System.out.println();
        statArray(fourD);
    }
    public static void statArray(double[][][][]array){
        DecimalFormat myformat=new DecimalFormat("##.000");
        double members=0,sum=0,mean;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                for(int k=0;k<array[i][j].length;k++){
                    for(int l=0;l<array[i][j][k].length;l++){
                        members++;
                        sum+=array[i][j][k][l];
                    }
                }   
            }
        }
        System.out.println("Members: "+(int)members);
        System.out.println("Sum: "+(int)sum);
        mean=sum/members;
        System.out.println("Mean: "+(myformat.format(mean)));
    }
    public static double[][][][] sort4DArray(double[][][][]array){
        for(int i=1;i<array.length;i++){
            double[][][]temp=array[i];
            int size=temp.length;
            
            if(array[i-1].length==size){
                if(array[i][0][0][0]<array[i-1][0][0][0]){
                    array[i]=array[i-1];
                    array[i-1]=temp;
                }
            }
            int j=i;
            while(j>0 && size<array[j-1].length){
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;
        }
        return array;
    }
    public static double[][][][] sort3DArray(double[][][][]array){
        for(int k=0;k<array.length;k++){
        for(int i=0;i<array[k].length-1;i++){
            int index=i;
            for(int j=i+1;j<array[k].length;j++){
                if(array[k][j][0][0]<array[k][index][0][0]){
                    index=j;
                }
            }
            double[][]temp=array[k][index];
            array[k][index]=array[k][i];
            array[k][i]=temp;
        }
        }
        return array;
    }
    public static void printArray(double[][][][]array){
        System.out.print("{");
        for(int i=0;i<array.length;i++){
            System.out.print("{");
            for(int j=0;j<array[i].length;j++){
                System.out.print("{");
                for(int k=0;k<array[i][j].length;k++){
                    System.out.print("{");
                    for(int l=0;l<array[i][j][k].length;l++){
                        System.out.print(array[i][j][k][l]+", ");
                    }
                    System.out.print("}");
                }
                System.out.print("}, ");
            }
            System.out.print("}");
        }
        System.out.print("}");
    }
}