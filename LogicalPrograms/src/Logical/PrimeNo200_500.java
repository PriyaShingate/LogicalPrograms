package Logical;

public class PrimeNo200_500 {

	public static void main(String[] args) {

		for (int i = 200; i <=500; i++) 
		{
			int p=0;
			for (int j = 2; j <i; j++) {
				int r=i%j;
				if(r==0) {
					p=1;
				}
			}
			if(p==0) {
				System.out.println(i + " ");
			}
		}
	}

}
