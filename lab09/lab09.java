import java.util.Scanner;
public class lab09{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int i=0;
        while(i>-1){
            System.out.println("The "+adjective()+" "+adjective()+" "+subject()+" "+pastTenseVerb()+" the "+adjective()+" "+object()+".");
            System.out.println("Do you want to construct another sentence (Yes or No)?");
            String input=scan.next();
            if(input.equals("No")){
                i--;
            }
            else if(input.equals("Yes")){
            }
        }
    }
    public static String adjective(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "active";
            case 1: return "big"; 
            case 2: return "cheap"; 
            case 3: return "elastic"; 
            case 4: return "fat"; 
            case 5: return "eager"; 
            case 6: return "flimsy"; 
            case 7: return "optimistic"; 
            case 8: return "soggy"; 
            case 9: return "zesty"; 
        }
        return "";
    }
    public static String subject(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "dog";
            case 1: return "cat"; 
            case 2: return "mammoth"; 
            case 3: return "moose"; 
            case 4: return "lion"; 
            case 5: return "leopard"; 
            case 6: return "bear"; 
            case 7: return "dinosuar"; 
            case 8: return "monkey"; 
            case 9: return "whale"; 
        }
        return "";
    }
    public static String pastTenseVerb(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "baked";
            case 1: return "attacked"; 
            case 2: return "hugged"; 
            case 3: return "nested"; 
            case 4: return "fired"; 
            case 5: return "visited"; 
            case 6: return "worked"; 
            case 7: return "marched"; 
            case 8: return "harmed"; 
            case 9: return "raced"; 
        }
        return "";
    }
    public static String object(){
        int rN=(int)(Math.random()*10);
        switch (rN){
            case 0: return "bike";
            case 1: return "plant"; 
            case 2: return "president"; 
            case 3: return "car"; 
            case 4: return "tree"; 
            case 5: return "house"; 
            case 6: return "chair"; 
            case 7: return "computer"; 
            case 8: return "table";
            case 9: return "pencil"; 
        }
        return "";
    }
    
}