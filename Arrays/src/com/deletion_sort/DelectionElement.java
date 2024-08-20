package com.deletion_sort;

import java.util.Scanner;

public class DelectionElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n=sc.nextInt();
		int i,f=0,j;
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
		System.out.print("Enter elements for "+(i+1));
		arr[i]=sc.nextInt();
		}
		System.out.println("The Elements are : ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
			}
		System.out.println("Enter the element to delete :");
		int ele=sc.nextInt();
		
		for(i=0;i<n;i++) {	
			if(arr[i]==ele) {
				for(n--,f=1,j=i;j<n;j++) {
					arr[j]=arr[j+1];
				}
			}
		}
// for poisiton
//		for(i=0;i<n;i++) {
//			if(i==pos-1) {
//				for(n--,f=1,j=i;j<n;j++) {
//					arr[j]=arr[j+1];
//				}
//			}
//		}
		if(f==0) { System.out.println("Element not found "); }
		for(i=0;i<n;i++) {
			System.out.println(" "+arr[i]);
		}
		
	}

}
