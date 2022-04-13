package Logical;

public class SumOfDigits {
	public static void main(String[] args) {
		 int digit=4464;
		 int temp;
		 int sum=0;
		 System.out.println("Sum Of Digit is: ");
		 while(digit>0) {//cheching quotient>0 or not
			 
			 temp=digit%10;//checking reminder
			 sum=sum+temp; //0+reminder
			 
			 digit=digit/10;//checking quotient 
			 
		 }
		 System.out.println(sum);
	}


}
