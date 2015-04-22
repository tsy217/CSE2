import java.util.Scanner;

public class lab12{
    public static void main(String[]args){
        int row=(int)(Math.random()*11);
        int column=(int)(Math.random()*11);
        boolean aM=true;
        boolean bM=false;
        boolean cM=true;
        System.out.println("Generating a matrix with width "+column+" and height "+row+": ");
        int a[][]=increasingMatrix(row,column,aM);
        printMatrix(a,aM);
        System.out.println("Generating a matrix with width "+column+" and height "+row+": ");
        int b[][]=increasingMatrix(row,column,bM);
        printMatrix(b,bM);
        row=(int)(Math.random()*11);
        column=(int)(Math.random()*11);
        System.out.println("Generating a matrix with width "+column+" and height "+row+": ");
        int c[][]=increasingMatrix(row,column,cM);
        printMatrix(c,cM);
        System.out.println("Adding two matrices:");
        printMatrix(a,aM);
        System.out.println("and");
        printMatrix(b,bM);
        System.out.println("Output =");
        int [][]addedM=addMatrix(a,aM,b,bM);
        if(a.length==b.length&&a[0].length==b[0].length&&a.length!=0&&b.length!=0&&a[0].length!=0&&b[0].length!=0){
            printMatrix(addedM,aM);
        }
        addedM=addMatrix(a,aM,c,cM);
    }
    public static int[][] increasingMatrix(int r, int c, boolean m){
        int[][]Array;
        int num=1;
        if(m){
            Array=new int[r][c];
            for(int i=0;i<r;i++){
                Array[i]=new int[c];
                for(int j=0;j<c;j++){
                    Array[i][j]=num;
                    num++;
                }
            }
        }
        else{
            Array=new int[r][c];
            for(int k=0;k<c;k++){
                for(int l=0;l<r;l++){
                    Array[l][k]=num+(l*c);
                }
                num++;
            }
        }
        return Array;
    }
    public static void printMatrix(int[][] array, boolean m){
        if(m){
            if(array!=null){
                for(int i=0;i<array.length;i++){
                    System.out.print("[");
                    for(int j=0;j<array[i].length;j++){
                        System.out.print(array[i][j]+" ");
                    }
                    System.out.print("]");
                    System.out.println();
                }
            }
            else{
                System.out.print("The matrix is empty!");
            }
        }
        else{
            if(array!=null){
                for(int k=0;k<array.length;k++){
                    System.out.print("[");
                    for(int l=0;l<array[0].length;l++){
                        System.out.print(array[k][l]+" ");
                    }
                    System.out.print("]");
                    System.out.println();   
                }
            }
            else{
                System.out.print("The matrix is empty!");
            }
        }
    }
    public static int[][] translate(int[][] array){
        System.out.println("Translating column major to row major");
        int[][]transA;
        transA=new int[array.length][];
        for(int k=0;k<array.length;k++){
            transA[k]=new int[array[k].length];
            for(int l=0;l<array[k].length;l++){
                transA[k][l]=array[l][k];
            }
        }
        return transA;
    }
    public static int[][] addMatrix( int[][] a, boolean formata, int[][] b, boolean formatb){
        int [][]addedA;
        if(a.length==b.length&&a[0].length==b[0].length&&a.length!=0&&b.length!=0&&a[0].length!=0&&b[0].length!=0){
            if(formata=false){
                translate(a);
            }
            else if(formatb=false){
                translate(b);
            }
            addedA=new int[a.length][b[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[i].length;j++){
                    addedA[i][j]=a[i][j]+b[i][j];
                }
            }
        }
        else{
            System.out.println();
            System.out.println("Unable to add input matrices");
            return null;
        }
        return addedA;
    }
}