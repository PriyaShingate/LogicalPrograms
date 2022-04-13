package Logical;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int n=sc.nextInt();
		 if(n%2==0) {
			 System.out.println(n + " is even number");
		 }
		 else {
			 System.out.println(n+ " is odd number");
		 }
		 sc.close();
	}

}
