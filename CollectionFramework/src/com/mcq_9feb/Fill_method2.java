package com.mcq_9feb;
import java.util.Arrays;

public class Fill_method2 {
	public static void main(String[] args) {

		int arr[]=new int[5];
		for(int i=5;i>0;i--) {
			arr[5-i]=i;
		}
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr, 1,4,8);	
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+"  ");
		}
	}

}
