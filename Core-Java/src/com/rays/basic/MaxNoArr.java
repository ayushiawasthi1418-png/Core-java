package com.rays.basic;

public class MaxNoArr {
	public static void main(String[] args) {
		int a[]= {5,10,15,20,25};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(+max);
	}

}
				
				
						
			
