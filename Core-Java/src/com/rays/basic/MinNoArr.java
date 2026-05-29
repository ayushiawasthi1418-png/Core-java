package com.rays.basic;

public class MinNoArr {
	public static void main(String[] args) {
		int a[]= {15,10,5,20,2};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(+min);

}
}
