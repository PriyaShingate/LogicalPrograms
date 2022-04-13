package Logical;

import java.util.Scanner;

public class PrimeNumbers
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");		
		int n=sc.nextInt();
		boolean prime=true;
		int i;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{	
				prime=false;
				break;
				}
			}
	
	if (prime==true)
	{

	System.out.println("number is prime");
	}else
	{
	System.out.println("number is not prime");
	}

	}	
}
	//	OR	
	//int n=10;
	//boolean prime=true;
	//for(int i=2;i<n;i++)
	//{
	//	if(n%i==0)
	//	{
	//		prime=false;
	//		break;
	//	}
	//}
	//if(prime==true)
	//{
	//	System.out.println("number is prime");	
	//}
	//else {
	//	System.out.println("number is not prime");
	//}
	//	
	


