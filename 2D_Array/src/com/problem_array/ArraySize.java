package com.problem_array;

import java.util.Arrays;

public class ArraySize {
	public static void main(String[] args) {
				int arr[][]=new int[3][];
				for(int i=0;i<5;i++) {
					arr[0][i]=i;
				}
				System.out.println(Arrays.toString(arr[0]));
			
	}
}
//Without size cannot assign