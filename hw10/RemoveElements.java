import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
  int num[]=new int[15];
  int newArray1[];
  int newArray2[];
  int index,target;
	String answer="";
	do{
  	System.out.print("Random input 15 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  public static int[] randomInput(){
      int rN=0;
      int[] inputs=new int[10];
      for(int i=0;i<inputs.length;i++){
          rN=(int)(Math.random()*10);
          inputs[i]=rN;
      }
      return inputs;
  }
  public static int[] delete(int[] list, int pos){
      if(list.length>pos){
          System.out.println("Desired position can only be within array's length");
      }
      int[]list2=new int[list.length-1];
      for(int i=0;i<list.length-1;i++){
          list2[i]=list[i];
          if(i>=pos){
              list2[i]=list[i+1];
          }
      }  
      return list2;
  }
  public static int[] remove(int[] list, int target){
      int counter=0;
      for(int i=0;i<list.length;i++){
          if(list[i]==target){
              counter++;
          }
      }
      int []list2=new int[(list.length)-counter];
      
      int k=0;
      for(int j=0;j<list.length;j++){
        if(list[j]!=target){
          list2[k]=list[j];
          k++;
        }
      }
      return list2;
  }
  
}
