package Logical;

public class CountOfPrimeNo {
	public static void main(String[] args) {
		int countis=0;
		for(int i=2;i<=100;i++) {
			int count=0; 
			int n=i;
			for(int j=2;j<n;j++)
			{
				if(n%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
			countis++;
			}
				
		}
		System.out.println("Count of Prime Numbers is: " +countis);
	}

}
