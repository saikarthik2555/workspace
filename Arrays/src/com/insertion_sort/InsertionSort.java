package com.insertion_sort;

import java.util.Scanner;

//https://youtu.be/rrfRRllt4c4?si=4itz3zPQEEviZNV6  --> LINK

public class InsertionSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array size :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,key,j;
		for(i=0;i<arr.length;i++) {
		System.out.println("Enter element for "+i);
		arr[i]=sc.nextInt();
		}
		
		for(i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
		while(j>=0 && arr[j]>key) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	
	
}