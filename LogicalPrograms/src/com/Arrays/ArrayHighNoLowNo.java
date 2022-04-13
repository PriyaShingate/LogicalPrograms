package com.Arrays;

public class ArrayHighNoLowNo {
	public static void main(String[] args) {
		
		int id[]= {11,12,65,8,5};
		
		int temp;
		for (int i = 0; i < id.length; i++) {
			
			for (int j = 0; j < id.length; j++) {
				
				if(id[i]<id[j]) {
					temp=id[i];
					id[i]=id[j];
					id[j]=temp;
				}
			}
			
		}
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
		}
	
		System.out.println("smallest number from Array is"+ id[0]);
		System.out.println("highest number from Array is"+ id[id.length-1]);
	System.out.println("second highest number from Array is"+ id[id.length-2]);
		}
	}


