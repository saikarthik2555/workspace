package com.max;

import java.util.Arrays;

public class Max {
	public static String maxOfArray(int []arr,int choice) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}System.out.println(Arrays.toString(arr));
		return choice+" Max : "+arr[choice-1];
		}
	
	
	public static void main(String[] args) {
		int arr[]= {12,34,2,1,21,31};
		int choice=3;
		System.out.println(Max.maxOfArray(arr, choice));
	}

}
