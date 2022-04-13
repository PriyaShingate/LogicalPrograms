package Logical;

import java.util.Scanner;

public class ArrayOccurance {
	public static void main(String[] args) {
		int n,x,count=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements which you want in array");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter all the elements: ");
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number which you want to count");
	   x=sc.nextInt();
	   for(i=0;i<n;i++) 
	   {
		   if(a[i]==x) {
		   count++;
	   }
	}
	   System.out.println("Number of Occurance of the element:"+count);
	}
	
}
//Output
//Enter Number of Elements which you want in array
//4
//Enter all the elements: 
//30
//20
//10
//30
//enter the number which you want to count
//
//30
//Number of Occurance of the element:2


