import java.util.Scanner;
public class Zsgs04 {
	public static void main(String[] args) {
	 Scanner input= new Scanner(System.in);
	 System.out.println("enter the target amount");
	 int target=input.nextInt();
	  int[] denomin= {1,2,5,10,20};
	   System.out.println("Enter the frequency of coins {1,2,5,10,20}");
	   int[] coins=new int[denomin.length];
	   for(int i=0;i<denomin.length;i++) {
		  coins[i]=input.nextInt();
	   }
	  int calc=target;
	  int sum=0;
	  for(int i=denomin.length-1;i>=0;i--) {
		  if((calc>=denomin[i])&&coins[i]>0) {
		    calc=calc-(coins[i]*denomin[i]);
		    sum=sum+coins[i];
		    if(calc==0) {
		    	break;
		    }
		    
		    
		  }
		 
	  }
	  if(calc>0) {
		  System.out.println(-1);
	  }
	  else {
	  System.out.println(sum);}
	  input.close();
	  	}

}
