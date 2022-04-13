package Logical;

public class ReverseNumber {
	public static void main(String[] args) {
		 int digit=123;
		 int temp;
		 System.out.println("Reverse Number is: ");
		 while(digit>0) {//check 12>0 or not,again while loop start
			 
			 temp=digit%10;//3,2,1 reminder
			 System.out.print(temp);
			 digit=digit/10; //12,1,0.1 quotient
			 
		 }
	}

}
