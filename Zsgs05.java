
import java.util.Scanner;
public class Zsgs05 {
	public static void main(String[] args) {
	    System.out.println("print the given string");
	    Scanner input = new Scanner(System.in);
	    String main=input.nextLine().toLowerCase();
	    System.out.println("Enter the substring");
	    String sub=input.nextLine().toLowerCase();
	    int[] frequency=new int[26];
	    for(int i=0;i<main.length();i++) {
	    	if(main.charAt(i)>='a')
	    	frequency[main.charAt(i)-'a']++;
	    	}
	    for(int i=0;i<sub.length();i++) {
	    	if(sub.charAt(i)>='a') {
	    		System.out.println(sub.charAt(i)+":"+frequency[sub.charAt(i)-'a']);
	    	}
	    		
	    }
	    
	  input.close();  
	}

}
