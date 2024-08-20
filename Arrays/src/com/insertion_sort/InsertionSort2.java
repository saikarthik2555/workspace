package com.insertion_sort;


public class InsertionSort2 {
	public static void main(String[] args) {
		int arr3[]= {12,3,4,56,2};
		InsertionSort2 a=new InsertionSort2();
		a.sort(arr3);
		printArray(arr3);
		
	}
	public void sort(int []arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	static void printArray(int arr[]) {
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
		}
	}
}
