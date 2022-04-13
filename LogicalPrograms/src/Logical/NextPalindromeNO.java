package Logical;

import java.util.Scanner;

public class NextPalindromeNO {
	
     public static void NextPlindromeNumber(int n) {
			int sum=0;
			int reminder=0;
			int temp;
			while(true) {
				n++;
				temp=n;
				sum=reminder=0;
				while(temp>0) {
					reminder=temp%n;
					sum=(sum*10)+reminder;
					temp=temp/10;
				         }
				if(sum==n) {
					System.out.println("Next palindrome Number is >>"+n);
					break;
				}
			}
		}

		public static void main(String[] args) {
	  
			Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter the number: ");
	   int  n=sc.nextInt();
			
			if(n<=0) {
				System.out.println("Please enter valid number");
			}
			else {
				NextPlindromeNumber(n);
			}
		}

	

	}


