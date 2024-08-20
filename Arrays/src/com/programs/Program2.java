package com.programs;

import java.util.Arrays;

public class Program2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int size=0;
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr.length);
		
		for(int i=arr.length-1;i>=size;i--) {
			System.out.print(arr[i]+"  ");
		}
//		int i=arr.length-1;
//		do {
//		System.out.println(arr[i--]);
//		}while(i>0);
	}

}
