package com.programs;

public class Program3 {
	public static void main(String[] args) {
		int arr[]= {12,34,22};
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>=arr[arr.length-2]&&arr[i]>=arr[arr.length-1]) {
		System.out.println(arr[i]);
			}
		}
	}
}
