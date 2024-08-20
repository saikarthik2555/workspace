package com.copy_modify;

import java.util.Arrays;

public class CopyArray {
	public static int[] modify(int[] arr,int elements[]) {
		int modifyArr[]=new int[arr.length+elements.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			modifyArr[index]=arr[i];
			
			index++;
		}
		for(int i=0;i<elements.length;i++) {
			modifyArr[index]=elements[i];
			index++;
		}
		return modifyArr;
	}
	
	public static void main(String[] args) {
		int arr[]= {12,34,21,3};
		int newArr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		System.out.println("Copyed Array :"+Arrays.toString(newArr));
		int[] newElements= {67,78,90};
	//int index=newArr.length;
	int result[]=CopyArray.modify(newArr,newElements);
	System.out.println(Arrays.toString(result));
	//System.out.println(Arrays.copyOf(newArr, newElements));
}
}
//write a java program to rotate the array element based on the user choice index
//input :[1,2,3,4,5]
//choice=3
//output :[4,5,1,2,3]