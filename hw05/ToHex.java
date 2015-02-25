import java.util.Scanner;
public class ToHex{
    public static void main (String[]arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter three integers representing RGB values (of 0-255 and a space in b/w each number): ");
        int n1=0;
        int n2=0;
        int n3=0;
        String hexa=" ";
        if(scan.hasNextInt()){
            n1=scan.nextInt();
        }
        else{
            System.out.println("You did not enter intergers or it was not in the RGB range(8bit: 0-255).");
            return;
        }
        if(scan.hasNextInt()){
            n2=scan.nextInt();
        }
        else{
            System.out.println("You did not enter intergers or it was not in the RGB range(8bit: 0-255).");
            return;
        }
        if(scan.hasNextInt()){
            n3=scan.nextInt();
        }
        else{
            System.out.println("You did not enter intergers or it was not in the RGB range(8bit: 0-255).");
            return;
        }
        if(n1<256&&n1>=0&&n2<256&&n2>=0&&n3<256&&n3>=0){
            int r1=0, r2=0, r3=0, d1=0, d2=0, d3=0;
            if(n1<10&&n1!=0){
                hexa+="0"+n1;
            }
            else if(n1==0){
                hexa+="0"+n1;
            }
            if(n2<10&&n2!=0){
                hexa+="0"+n2;
            }
            else if(n2==0){
                hexa+="0"+n2;
            }
            if(n3<10&&n3!=0){
                hexa+="0"+n1;
            }
            else if(n3==0){
                hexa+="0"+n3;
            }
            else{
                r1=n1%16;r2=n2%16;r3=n3%16;
                d1=n1/16;d2=n2/16;d3=n3/16;
                if(d1<10){
                    hexa+=d1;
                }
                else{
                    switch(d1){
                        case 10:hexa+="A";break;
                        case 11:hexa+="B";break; 
                        case 12:hexa+="C";break; 
                        case 13:hexa+="D";break; 
                        case 14:hexa+="E";break; 
                        case 15:hexa+="F";break; 
                    }
                }
                if(r1<10){
                    hexa+=r1;
                }
                else{
                    switch(r1){
                        case 10:hexa+="A";break;
                        case 11:hexa+="B";break; 
                        case 12:hexa+="C";break; 
                        case 13:hexa+="D";break; 
                        case 14:hexa+="E";break; 
                        case 15:hexa+="F";break; 
                    }
                }
                if(d2<10){
                    hexa+=d2;
                }
                else{
                    switch(d2){
                        case 10:hexa+="A";break;
                        case 11:hexa+="B";break; 
                        case 12:hexa+="C";break; 
                        case 13:hexa+="D";break; 
                        case 14:hexa+="E";break; 
                        case 15:hexa+="F";break; 
                    }
                }
                if(r2<10){
                    hexa+=r2;
                }
                else{
                    switch(r2){
                        case 10:hexa+="A";break;
                        case 11:hexa+="B";break; 
                        case 12:hexa+="C";break; 
                        case 13:hexa+="D";break; 
                        case 14:hexa+="E";break; 
                        case 15:hexa+="F";break; 
                    }
                }
                if(d3<10){
                    hexa+=d3;
                }
                else{
                    switch(d3){
                        case 10:hexa+="A";break;
                        case 11:hexa+="B";break; 
                        case 12:hexa+="C";break; 
                        case 13:hexa+="D";break; 
                        case 14:hexa+="E";break; 
                        case 15:hexa+="F";break; 
                    }
                }
                if(r3<10){
                    hexa+=r3;
                }
                else{
                    switch(r3){
                        case 10:hexa+="A";break;
                        case 11:hexa+="B";break; 
                        case 12:hexa+="C";break; 
                        case 13:hexa+="D";break; 
                        case 14:hexa+="E";break; 
                        case 15:hexa+="F";break; 
                    }
                }
            }
        
            System.out.println("The decimal numbers: "+n1+", "+n2+", "+n3+", is represented  in hexadecimal as: "+hexa+".");   
        }
        else{
            System.out.println("You did not enter intergers or it was not in the RGB range(8bit: 0-255).");
        }
    }
}