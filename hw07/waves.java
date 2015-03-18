import java.util.Scanner;

public class waves{
    public static void main(String[]args){
        int limit1=0;
        int limit2=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number between 1 and 30: ");
        int stackN=scan.nextInt();
        System.out.print("\n");
        System.out.println("1. For loop");
        for(int s=1;s<=stackN;s+=1){
            int y=1;
            int x=2;
            int t=0;
            int u=2;
            
            if(s%2==0){
                limit1=(s*(s+1))/2;
                for(int s2=1;s2<=limit1;s2+=1){
                    System.out.print(s);
                    if(s2==y){
                        System.out.print("\n");
                        y+=x;
                        x++;
                    }
                }
            }
            else if(s%2==1){
                limit2=(s*(s+1))/2;
                t=s;
                u=s-1;
                for(int s3=1;s3<=limit2;s3+=1){
                    System.out.print(s);
                    if(s3==t){
                        System.out.print("\n");
                        t+=u;
                        u--;
                    }
                }
            }
            
        }
        System.out.print("\n");
        System.out.println("2. While loop");
        int w=1;
        while(w<=stackN){
            int a=1;
            int b=2;
            int c=0;
            int d=2;
            
            if(w%2==0){
                limit1=(w*(w+1))/2;
                int w2=1;
                while(w2<=limit1){
                    System.out.print(w);
                    if(w2==a){
                        System.out.print("\n");
                        a+=b;
                        b++;
                    }
                    w2++;
                }
            }
            else if(w%2==1){
                limit2=(w*(w+1))/2;
                c=w;
                d=w-1;
                int w3=1;
                while(w3<=limit2){
                    System.out.print(w);
                    if(w3==c){
                        System.out.print("\n");
                        c+=d;
                        d--;
                    }
                    w3++;
                }
            }
            w++;
        }
        System.out.print("\n");
        System.out.println("3. Do-while loop");
        int i=1;
        do{
            int e=1;
            int f=2;
            int g=0;
            int h=2;
            
            if(i%2==0){
                limit1=(i*(i+1))/2;
                int i2=1;
                do{
                    System.out.print(i);
                    if(i2==e){
                        System.out.print("\n");
                        e+=f;
                        f++;
                    }
                    i2++;
                }while(i2<=limit1);
            }
            
            else if(i%2==1){
                limit2=(i*(i+1))/2; 
                g=i; 
                h=i-1; 
                int i3=1; 
                do{
                    System.out.print(i);
                    if(i3==g){
                        System.out.print("\n");
                        g+=h;
                        h--;
                    }
                    i3++;
                }while(i3<=limit2);
            }
            i++;
            
        }while(i<=stackN);
    }
}
