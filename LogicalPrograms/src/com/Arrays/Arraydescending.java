package com.Arrays;

public class Arraydescending {
	public static void main(String[] args) {
		
		int id[]= {11,12,65,5,8};
		
		int temp;
		for (int i = 0; i < id.length; i++) {
			
			for (int j =i+1; j < id.length; j++) {
				
				if(id[i]<id[j]) 
				{
					
					temp=id[i];
					id[i]=id[j];
					id[j]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
			
		}
	}

}
