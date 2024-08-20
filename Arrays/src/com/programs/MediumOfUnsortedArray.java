package com.programs;

public class MediumOfUnsortedArray {
	public static void main(String[] args) {
		int a[]= {12,34,55,23,32,1},n=6,i;
		float m;
	m=a[n/2];
	if(n%2==0) {
		m=(m+a[n/2-1])/2;
	}
	System.out.println(m);
	}

}
