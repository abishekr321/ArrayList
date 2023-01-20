import java.util.Scanner;
public class Zsgs01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String X=input.next();
		boolean valid=true;
		int count=0;
		for(int i=0;i<X.length();i++) {
			int c=X.charAt(i);
			if(c==40||c==41) {
				count++;
				}
			if(i+1<X.length()) {
			if(X.charAt(i)>='a'&&X.charAt(i)<='z') {
				if(X.charAt(i+1)>='a'&&X.charAt(i+1)<='z') {
				valid=false;
			}
			}
			if(X.charAt(i)>= 42&&X.charAt(i)<=47) {
				if(X.charAt(i+1)>=42&&X.charAt(i+1)<=47) {
				valid=false;
			}
			}
			
		}
			}
		if(count%2!=0) {
			System.out.println("InValid");
		}
		else if(valid==false) {
			System.out.println("InValid");
		}
		else {
			System.out.println("Valid");
		}
		input.close();
		
	}

}
