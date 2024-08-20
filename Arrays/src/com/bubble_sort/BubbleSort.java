package com.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int temp;
		int arr[]= {23,21,45,87,21};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
//		for(int y:arr) {
//			System.out.print(y+" ,");
//		}
		}

}
