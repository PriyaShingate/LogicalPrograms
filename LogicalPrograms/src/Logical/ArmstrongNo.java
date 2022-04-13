package Logical;

public class ArmstrongNo {
	public static void main(String[] args) {
		
		int n=153;
		int digit=n;
		int temp=0;
		int arm=0;
		
		while(digit>0) {
			temp=digit%10;  //3 5 1
			    arm=(temp*temp*temp)+arm;//27+125+1
			digit=digit/10; //15 1  0.1
			
		}
		if(n==arm) {
			System.out.println("Number is Armstrong no ");
			
		}
		else {
			System.out.println("Number is  not Armstrong no ");
			
		}
	}

}
