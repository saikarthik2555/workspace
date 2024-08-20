package com.rotate_up_to;

public class UserChoice{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int i,n=4;
		
		for(i=0;i<n;i++) {
			int first=arr[0],j;
			for(j=arr.length-1;j>0;j--) {
				arr[j+1]=arr[j];
			}
			arr[j]=first;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}