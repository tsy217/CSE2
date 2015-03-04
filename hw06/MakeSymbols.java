//Tsu Kuei Yang
//Hw06
//Making Symbols
//3/3/2015

public class MakeSymbols{
    public static void main(String[]args){
        int randN=(int)(Math.random()*101);
        System.out.println("Random number generated: "+randN);
        if(randN%2==0){
            while(randN>0){
                System.out.print("*");
                randN--;
            }
        }
        else{
            while(randN>0){
                System.out.print("&");
                randN--;
            }
        }
        System.out.print("\n");
    }
}
