package com.rays.basic;

public class SecLarNoArr {public static void main(String[] args) {
	int a[] = {5, 10, 15, 20, 25};

    int max = a[0];
    int secondMax = a[0];

    for (int i = 0; i < a.length; i++) {
        if (a[i] > max) {
            secondMax = max;
            max = a[i];
        } else if (a[i] > secondMax && a[i] != max) {
            secondMax = a[i];
        }
    }

    System.out.println("Second largest number is: " + secondMax);
}
	
}

