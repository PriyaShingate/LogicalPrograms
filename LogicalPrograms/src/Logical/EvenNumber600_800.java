package Logical;

public class EvenNumber600_800 {
   
	public void even() {
		System.out.println("even numbers between 600 to 800 are:");
		for (int i = 600; i <=800; i++) 
		{
			if(i%2==0) {
				System.out.println(i +" ");
			}
		}
	}
	
	public void odd() {
		System.out.println("odd numbers between 600 to 800 are:");
		for (int i = 600; i <=800; i++) 
		{
			if(i%2==1) {
				System.out.println(i +" ");
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumber600_800 nn=new  EvenNumber600_800();
		nn.even();
		nn.odd();
	}

}
