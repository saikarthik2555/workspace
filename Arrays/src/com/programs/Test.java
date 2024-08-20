package com.programs;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
	int arr[]= {2,4,6};
	int result[]=getArra(arr);
	System.out.println(Arrays.toString(result));
	}
	public static int[] getArra(int []arr) {
		int nee[]=new int[arr.length*2];
		nee[nee.length-1]=arr[arr.length-1];
		return nee;
	}
}
