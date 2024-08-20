package com.task;

public class Program01{
	public static void main(String[] args) {
		int arr[]= {16,17,3,4,5,2};
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,4,6,8};
		System.out.print(arr[arr.length-1]+" ");
		leaderArray(arr);		
	}
		public static void leaderArray(int arr[]) {
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i-1]>arr[i]) {
				System.out.print(arr[i-1]+" ");
			}
		}
	}

}
