package Logical;

public class ArgumentMethods {
	static int a=20;
	static int b=5;
	float x=1.0f;
	float y=0.5f;
	
	
	public static void Akshay() {
		int c=a+b;
		System.out.println("c="+ c);
		
	}
	public void Akshay2() {
		int c=a-b;
		System.out.println("c="+  c);
	}
	public ArgumentMethods() {
		 float z=x+y;
		System.out.println("z="+  z);
	}
public static void main(String[] args) {
	ArgumentMethods aa=new ArgumentMethods();
	Akshay();
	aa.Akshay2();
	
}
}
