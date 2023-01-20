import java.util.Scanner;
public class Zsgs04 {
	public static void main(String[] args) {
	 Scanner input= new Scanner(System.in);
	 System.out.println("enter the target amount");
	 int target=input.nextInt();
	  int[] denomin= {1,2,5,10};
	  int[] coins= {5,4,6,5};
	  int calc=target;
	  int calu=target;
	  int k=denomin.length-1;
	  int[]ans=new int[coins.length];
	  int sum=0;
	  for(int i=denomin.length-1;i>=0;i--) {
		  if((calc>=denomin[i])&&coins[i]>0) {
			 int count=calc/denomin[i];
			 if(count >coins[i]) {
				 count=coins[i];
			 }
			calc=target-(count*denomin[i]);
			target=calc;
			ans[k]=count;
		    sum=sum+count;
		    k--;
		    if(calc==0) {
		    	break;
		    }
		    
		    
		  }
		 
	  }
	  for(int i=0;i<denomin.length;i++) {
		  System.out.println(denomin[i]+" X "+ans[i]);
	  }
	  if(calc>0) {
	  System.out.println(-1);
	 }
	  {
	 System.out.println(sum);}
	 input.close();
	 }

}
