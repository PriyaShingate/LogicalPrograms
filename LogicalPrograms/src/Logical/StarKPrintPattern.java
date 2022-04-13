package Logical;

public class StarKPrintPattern {
	
	public void T1() 
	{
	for (int i = 1; i <=5; i++) 
	{
		for (int j = 1; j <=i; j++)
		{
		System.out.print("*");	
		}
	System.out.println(" ");
	}
	}
	public void T2()
	{
		for (int i = 1; i <=5 ; i++) 
		{
		for (int j = 5; j>=i; j--) 
		{
			System.out.print("*");
		}	
		System.out.println(" ");	
		}
	}

	public static void main(String[] args) {
		StarKPrintPattern sk=new  StarKPrintPattern();
		System.out.println("print K pattern");
		sk.T2();
		sk.T1();
		System.out.println("print triangle shape");
		sk.T1();
		sk.T2();
	}

}
