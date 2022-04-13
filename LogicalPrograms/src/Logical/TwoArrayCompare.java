package Logical;

public class TwoArrayCompare {
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4};
		int[]b= {1,2,3,4};
		boolean count=true;
		//System.out.println(a==b);
		if(a[a.length-1]==b[b.length-1])
		{
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=b[i])
			{
			count=false;
			break;
			}
		}
		
		}
		else {
			count=false;
		}
		if(count==true)
		{
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
