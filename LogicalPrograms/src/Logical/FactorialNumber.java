package Logical;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		int f=1;
		for (int i = 1; i <=n; i++) 
		{
			f=f*i;
		}
		System.out.println("Factorial of Number "  + n + "is" + f);
	  sc.close();
	}

}
//output
//Enter the Number
//6
//Factorial of Number 6is720