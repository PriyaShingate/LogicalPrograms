package Logical;

public class CountOfArmstrong {
	public static void main(String[] args) {

       for (int i = 2; i <1000; i++) {
    	   int n=i;
   		int digit=n;
   		int temp=0;
   		int arm=0;
   		
   		while(digit>0) {
   			temp=digit%10;  
   			    arm=(temp*temp*temp)+arm;
   			digit=digit/10; 
   			
   		}
   		if(n==arm) {
   			System.out.println(n);
   			
   		}
   	}

	
  }
	}


