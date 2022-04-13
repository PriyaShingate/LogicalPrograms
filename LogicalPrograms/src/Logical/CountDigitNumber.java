package Logical;

public class CountDigitNumber {
	public static void main(String[] args) {
		 int digit=4464;
		 int temp;
		 int count=0;
		 System.out.println("Digit Count is:  ");
		 while(digit>0) {
			 
			 temp=digit%10;//checking reminder
			 count++; 
			 digit=digit/10;//checking quotient 
			 
		 }
		 System.out.println(count);
	}

}
