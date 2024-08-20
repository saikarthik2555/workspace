package com.task;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,4,6,8};	
		mergeArray(arr1,arr2);
	}
	public static void mergeArray(int arr1[],int arr2[]) {
	int arr3[]=new int[arr1.length+arr2.length];
	int index=0;
	for(int i=0;i<arr1.length;i++) {
		arr3[index++]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++) {
		arr3[index++]=arr2[i];
	}
	System.out.println("Merged Array :"+Arrays.toString(arr3));
	int temp;
	for(int i=0;i<arr3.length;i++) {
		for(int j=0;j<arr3.length;j++) {
			if(arr3[j]>arr3[i]) {
				temp=arr3[j];
				arr3[j]=arr3[i];
				arr3[i]=temp;
			}
		}
	}
	System.out.println("New Array is :"+Arrays.toString(arr3));
	
	
	}

}
