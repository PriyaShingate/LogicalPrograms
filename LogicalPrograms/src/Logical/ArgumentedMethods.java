package Logical;

public class ArgumentedMethods {
	
	public static void Akshay(int a,int b) {
		int c=a+b;
		System.out.println("c="+ c);
		
	}
	public void Akshay2(int a,int b) {
		int c=a-b;
		System.out.println("c="+  c);
	}
	public ArgumentedMethods(float x,float y) {
		 float z=x+y;
		System.out.println("z="+  z);
	}
public static void main(String[] args) {
	ArgumentedMethods am=new ArgumentedMethods(1.2f,2.0f);
	Akshay(20,10);
	am.Akshay2(20,5);
	
	
}
}
