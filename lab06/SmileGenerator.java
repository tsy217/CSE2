public class SmileGenerator{
    public static void main(String[]args){
        System.out.println("for loop");
        for(int smiles=1; smiles < 6; smiles+=1){
            System.out.print(":) ");
        }
        
        System.out.print("\n");
        System.out.println("while loop");
        int smilesW=1;
        while(smilesW<6){
            System.out.print(":) ");
            smilesW++;    
        }
        
        System.out.print("\n");
        System.out.println("do-while loop");
        int smilesD=1;
        do{
            System.out.print(":) ");
            ++smilesD;
        }while(smilesD<6);
        
        System.out.print("\n");
        System.out.println("Random number(1-100) of smileyfaces.");
        System.out.println("Limited to 30 per line.");
        int numberR=(int)(Math.random()*100);
        System.out.println(numberR);
        for(int smilesR=1; smilesR<=numberR; smilesR+=1){
            while(smilesR%30==0){
                System.out.print("\n");
                break;
            }
            System.out.print(":) ");
        }
        System.out.print("\n");
        int s=1;
        int x=1;
        for(int lines=1; lines<=10; lines+=1){
            while(lines==s){
                System.out.print("\n ");
                s=s+(x);
                x++;
            }
            System.out.print(":) ");
        }
        System.out.print("\n");
    }
}