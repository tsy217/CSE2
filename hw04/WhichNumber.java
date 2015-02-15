import java.util.Scanner;//tell compiler where to find Scanner
public class WhichNumber{//open class
    public static void main (String[]args){//open main method
        Scanner myScanner=new Scanner(System.in);//create Scanner
        System.out.println("Think of an integer between 1-10");//prompt user to think of random number b/w 1-10
        System.out.println("I am going to guess the integer.");
        System.out.print("Is the number even (answer all following questions either y/Y/n/N)? ");//ask if it is even: y/Y/n/N
        String answer1=myScanner.next();//store user's answer
        if(answer1.equals("y")||answer1.equals("Y")){//open if y or Y
            System.out.print("Is it divisible by 3? ");//ask if / by 3
            String answer2=myScanner.next();//store user's answer
            if(answer2.equals("y")||answer2.equals("Y")){//open if yes for / by 3
              System.out.println("The number is 6");
            }//close if yes / by 3
            else if(answer2.equals("n")||answer2.equals("N")){//open if no for / by 3
                System.out.print("Is it divisible by 4? ");//ask if / by 4
                String answer3=myScanner.next();//store answer
                if(answer3.equals("y")||answer3.equals("Y")){//open if yes for / by 4
                    System.out.print("Is the number divided by 4 greater than 1? ");//ask if after / by 4, >1
                    String answer4=myScanner.next();//store answer
                    if(answer4.equals("y")||answer4.equals("Y")){//open if yes >1
                        System.out.println("The number is 8");
                    }//close if yes >1
                    else if(answer4.equals("n")||answer4.equals("N")){//open else not >1
                        System.out.println("The number is 4");
                    }//close if not >1
                }//close if yes / by 4
                else if(answer3.equals("n")||answer3.equals("N")){//open if not for / by 4
                    System.out.print("Is it divisible by 5? ");//ask user if / by 5
                    String answer5=myScanner.next();//store answer
                    if(answer5.equals("y")||answer5.equals("Y")){//open if yes / by 5
                        System.out.println("The number is 10");
                    }//close if yes / by 5
                    else if(answer5.equals("n")||answer5.equals("N")){//open if not / by 5
                        System.out.println("The nubmer is 2");
                    }//close if not / by 5
                }//close if not / by 4
            }//close if not / by 3
        }//close if yes for even
        else if(answer1.equals("n")||answer1.equals("N")){//open if no for even
            System.out.print("Is it divisible by 3? ");//ask if / by 3
            String answer6=myScanner.next();//store answer
            if(answer6.equals("y")||answer6.equals("Y")){//open if yes / by 3
                System.out.print("When divided by 3 is the result greater than 1? ");//ask if after / by 3, >1
                String answer7=myScanner.next();//store answer
                if(answer7.equals("y")||answer7.equals("Y")){//open if yes >1
                   System.out.println("The number is 9");
                }//close if yes >1
                else if(answer7.equals("n")||answer7.equals("N")){//open if no >1
                    System.out.println("The number is 3");
                }//close if no >1
            }//close if yes / by 3
            else if(answer6.equals("n")||answer6.equals("N")){//open if not / by 3
                System.out.print("Is it greater than 6? ");//ask if >6
                String answer8=myScanner.next();//store answer
                if(answer8.equals("y")||answer8.equals("Y")){//open if yes >6
                    System.out.println("The number is 7");
                }//clsoe if yes >6
                else if(answer8.equals("n")||answer8.equals("N")){//open if not >6
                    System.out.print("Is it less than 3? ");//ask if < 3
                    String answer9=myScanner.next();//store asnwer
                    if(answer9.equals("y")||answer9.equals("Y")){//open if yes < 3
                        System.out.println("The number is 1");
                    }//close if yes < 3
                    else if(answer9.equals("n")||answer9.equals("N")){//open if not < 3
                        System.out.println("The number is 5");
                    }//close if not < 3
                }//clsoe if not >6
            }//clsoe if not / by 3
        }//close if no for even
        else{//open if incorrect input
            System.out.println("*Invalid input* Please enter y or Y or n or N!");
        }//close if incorrect input
    }//close main method
}//close class