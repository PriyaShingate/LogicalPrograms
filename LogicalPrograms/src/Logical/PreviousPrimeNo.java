package Logical;

import java.util.Scanner;

public class PreviousPrimeNo {
	public static void previousPrime(int n) {
		boolean temp=false;
		while(!temp) {
			temp=true;
			n--;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					temp=false;
					break;
				}
			}
			if(temp) {
				System.out.println("Previous Prime No is >>"+n);
			}
		}
	}	
		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter Number:");
	        int n=sc.nextInt();
	        if(n<1) {
	        	System.out.println("Number is not valid");
	        }
	        else {
	        	previousPrime(n);
	        }
		}

}
