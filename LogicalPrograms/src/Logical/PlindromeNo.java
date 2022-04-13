package Logical;

public class PlindromeNo {
	public static void main(String[] args) {
		
		int n=121;
		int digit=n;
		int arm=0;
		int temp;
		
		while(digit>0) {
			temp=digit%10; //1  2  1
			arm=(arm*10)+temp; //1  12 121
			digit=digit/10; //12   1   0
		}
		if(n==arm) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}

}
