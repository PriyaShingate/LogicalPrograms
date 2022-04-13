package Logical;

public class MergeArray {
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4};
		int[]b= {3,5,6,7};
		
		int[]c=new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			
		}
		for (int i =0; i < b.length; i++) {
			c[i+ a.length]=b[i];
		}
		
       for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}		
		
		
		
		
	}

}
