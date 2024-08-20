package com.programs;

public class Program4 {
	public static void main(String[] args) {
		int arr[]= {40,34,22,45};
		//int arc[]=new int[0];
		int arc = 0;
		for(int i=0;i<arr.length;i++) {
		if(arr[0]>=arr[i]  && arr[arr.length-1]>=arr[0]) {
				arc=arr[i];
			}
		}
		System.out.println(arc);
	}
}
