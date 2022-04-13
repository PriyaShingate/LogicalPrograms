package Logical;

public class TriangleDiamondPattern {
	
	public void triangle(int n) {
		for (int i = 1; i <=n; i++) 
		{
		for (int j = n; j >=i; j--)
		{
			System.out.print(" ");
		}
		for (int k= 1; k <=i; k++) 
		{
			System.out.print("*");
		}
		System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		TriangleDiamondPattern td=new TriangleDiamondPattern();
		System.out.println("Print triangle");
		td.triangle(5);
		System.out.println("\n"+"\n");

	}

}
