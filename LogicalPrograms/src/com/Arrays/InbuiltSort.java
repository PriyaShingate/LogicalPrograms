package com.Arrays;

import java.util.Arrays;

public class InbuiltSort {
	public static void main(String[] args) {
		
		int id[]= {11,12,65,8,5};
		
		Arrays.sort(id);
	
	System.out.println("smallest number from Array is"+  id[0] );
	System.out.println("highest number from Array is"+  id[id.length-1] );
   System.out.println("second highest number from Array is"+  id[id.length-2] );
}
}