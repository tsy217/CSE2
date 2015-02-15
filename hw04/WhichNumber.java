import java.util.Scanner;
public class WhichNumber{
    public static void main (String[]args){
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Think of an integer between 1-10");
        System.out.println("I am going to guess the integer.");
        System.out.print("Is the number even (answer all following questions either y/Y/n/N)? ");
        String answer1=myScanner.next();
        if(answer1.equals("y")||answer1.equals("Y")){
            System.out.print("Is it divisible by 3? ");
            String answer2=myScanner.next();
            if(answer2.equals("y")||answer2.equals("Y")){
              System.out.println("The number is 6");
            }
            else if(answer2.equals("n")||answer2.equals("N")){
                System.out.print("Is it divisible by 4? ");
                String answer3=myScanner.next();
                if(answer3.equals("y")||answer3.equals("Y")){
                    System.out.print("Is the number divided by 4 greater than 1? ");
                    String answer4=myScanner.next();
                    if(answer4.equals("y")||answer4.equals("Y")){
                        System.out.println("The number is 8");
                    }
                    else if(answer4.equals("n")||answer4.equals("N")){
                        System.out.println("The number is 4");
                    }
                }
                else if(answer3.equals("n")||answer3.equals("N")){
                    System.out.print("Is it divisible by 5? ");
                    String answer5=myScanner.next();
                    if(answer5.equals("y")||answer5.equals("Y")){
                        System.out.println("The number is 10");
                    }
                    else if(answer5.equals("n")||answer5.equals("N")){
                        System.out.println("The nubmer is 2");
                    }
                }
            }
        }
        else if(answer1.equals("n")||answer1.equals("N")){
            System.out.print("Is it divisible by 3? ");
            String answer6=myScanner.next();
            if(answer6.equals("y")||answer6.equals("Y")){
                System.out.print("When divided by 3 is the result greater than 1? ");
                String answer7=myScanner.next();
                if(answer7.equals("y")||answer7.equals("Y")){
                   System.out.println("The number is 9");
                }
                else if(answer7.equals("n")||answer7.equals("N")){
                    System.out.println("The number is 3");
                }
            }
            else if(answer6.equals("n")||answer6.equals("N")){
                System.out.print("Is it greater than 6? ");
                String answer8=myScanner.next();
                if(answer8.equals("y")||answer8.equals("Y")){
                    System.out.println("The number is 7");
                }
                else if(answer8.equals("n")||answer8.equals("N")){
                    System.out.print("Is it less than 3? ");
                    String answer9=myScanner.next();
                    if(answer9.equals("y")||answer9.equals("Y")){
                        System.out.println("The number is 1");
                    }
                    else if(answer9.equals("n")||answer9.equals("N")){
                        System.out.println("The number is 5");
                    }
                }
            }
        }
        else{
            System.out.println("*Invalid input* Please enter y or Y or n or N!");
        }
    }
}