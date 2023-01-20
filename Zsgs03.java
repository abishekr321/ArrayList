

import java.util.Scanner;
public class Zsgs03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count=0;
		int maincount=0;
		System.out.println("Enter the Size of String X");
		int m= input.nextInt();
		String []X=new String[m];
		System.out.println("Enter the string");
		for(int a=0;a<m;a++) {
			X[a]=input.next();
		}
		System.out.println("Enter the Size of Substring Y");
		int n= input.nextInt();
		System.out.println("Enter the Substring");
		String []Y=new String[n];
		for(int b=0;b<n;b++) {
			Y[b]=input.next();
		}
		
		
		for(int i=0;i<X.length;i++) {
			int[] frequency=new int[26];
        	for(int j=0;j<X[i].length();j++) {
			if(X[i].charAt(j)>='a')
		    	frequency[X[i].charAt(j)-'a']++;
		    	}
	outer:	for(int k=0;k<Y.length;k++) {
			for(int l=0;l<Y[k].length();l++) {
				if(Y[k].charAt(l)>='a') {
					if(frequency[Y[k].charAt(l)-'a']==0) {
						break outer;
					}
					
				}
				}
			   count++;
		      	
			}
	        if(count==Y.length) {
	        	maincount++;
	        }
		}
		System.out.println(maincount);
		input.close();
		
		}
		}
		
	


