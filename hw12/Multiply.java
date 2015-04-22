import java.util.Scanner;

public class Multiply{
    public static void main(String[]args){
        int width1=0;
        int height1=0;
        int width2=0;
        int height2=0;
        String flush= " ";
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Program: Multiply two random matrix.");
        System.out.println("Enter the width for matrix 1: ");
        while(width1==0){
            if(scan.hasNextInt()){
                width1=scan.nextInt();
                if(width1<0){
                    width1=0;
                    System.out.print("Please re-enter a width for matrix 1: ");
                }
            }
            else{
                flush=scan.next();
                System.out.print("Please re-enter a width for matrix 1: ");
            }
        }
        System.out.println("Enter the height for matrix 1: ");
        while(height1==0){
            if(scan.hasNextInt()){
                height1=scan.nextInt();
                if(height1<0){
                    height1=0;
                    System.out.print("Please re-enter a height for matrix 1: ");
                }
            }
            else{
                flush=scan.next();
                System.out.print("Please re-enter a height for matrix 1: ");
            }
        }
        
        System.out.println("Enter the width for matrix 2: ");
        while(width2==0){
            if(scan.hasNextInt()){
                width2=scan.nextInt();
                if(width2<0){
                    width2=0;
                    System.out.print("Please re-enter a width for matrix 2: ");
                }
            }
            else{
                flush=scan.next();
                System.out.print("Please re-enter a width for matrix 2: ");
            }
        }
        System.out.println("Enter the height for matrix 2: ");
        while(height2==0){
            if(scan.hasNextInt()){
                height2=scan.nextInt();
                if(height2<0){
                    height2=0;
                    System.out.print("Please re-enter a height for matrix 2: ");
                }
            }
            else{
                flush=scan.next();
                System.out.print("Please re-enter a height for matrix 2: ");
            }
        }
        while(width1!=height2){
            System.out.println("Please re-enter width of matrix1 and height of matrix2 so that w1=h1");
            width1=0;height2=0;
            System.out.print("Please re-enter a width for matrix 1: ");
            while(width1==0){
                if(scan.hasNextInt()){
                    width1=scan.nextInt();
                    if(width1<0){
                        width1=0;
                        System.out.print("Please re-enter a width for matrix 1: ");
                    }
                }
                else{
                    flush=scan.next();
                    System.out.print("Please re-enter a width for matrix 1: ");
                }
            }
            System.out.print("Please re-enter a height for matrix 2: ");
            while(height2==0){
                if(scan.hasNextInt()){
                    height2=scan.nextInt();
                    if(height2<0){
                        height2=0;
                        System.out.print("Please re-enter a height for matrix 2: ");
                    }
                }
                else{
                    flush=scan.next();
                    System.out.print("Please re-enter a height for matrix 2: ");
                }
            }
        }
        int[][]matrix1=randomMatrix(width1,height1);
        System.out.println("Matrix 1: ");
        printMatrix(matrix1);
        int[][]matrix2=randomMatrix(width2,height2);
        System.out.println("Matrix 2: ");
        printMatrix(matrix2);
        int[][]multiplied=multiply(matrix1,matrix2);
        System.out.println();
        System.out.println("M1 x M2 = ");
        printMatrix(multiplied);
    }
    
    public static int[][] randomMatrix(int width, int height){
        int[][] newArray=new int[height][width];
        int randomN=0;
        int low=1;
        int high=2;
        int pN=0;
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                pN=(int)(Math.random()*10);
                if(pN<=4){
                    randomN=(int)(Math.random()*11);
                }
                else if(pN>=5){
                    randomN=(int)(Math.random()*(-11));
                }
                newArray[i][j]=randomN;
            }
        }
        return newArray;
    }
    public static void printMatrix(int[][]array){
        for(int i=0;i<array.length;i++){
            System.out.print("[");
                for(int j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
            System.out.print("]");
            System.out.println();
        }
    }
    public static int[][] multiply(int[][]a, int[][]b){
        int[][]c;
        int row=0;
        int num=0;
        if(a[0].length==b.length){
            c=new int[a.length][b[0].length];
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[i].length;j++){
                    for(int k=0;k<a[0].length;k++){
                        num+=a[i][k]*b[k][j];
                    }
                    c[i][j]=num;
                    num=0;
                }
            }
        }
        else{
            System.out.println("These two matrices can't be multiplied.");
            return null;
        }
        return c;
    }
}