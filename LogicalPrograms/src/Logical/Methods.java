package Logical;

public class Methods {

	
	public static void mOne() {
		System.out.println("welcome to static");
	}
	
	public void mTwo() {
		System.out.println("welcome to non static 1");
		mThree();
	}
	public void mThree() {
		System.out.println("welcome to non static 2");
	}
	public Methods() {
		System.out.println("welcome to constructor");
	}
	
	public static void main(String[] args) {
		
	Methods methods=new Methods();
	mOne();
	methods.mTwo();
	
	}
}
