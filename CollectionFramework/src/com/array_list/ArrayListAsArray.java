package com.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAsArray {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al);
		
		int arr[]=new int[0];
		int arr1[]= {};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
