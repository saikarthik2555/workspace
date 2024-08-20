package com.programs;

import java.util.Scanner;

public class DeletingDuplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,k;
		for(i=0;i<n;i++) {
		System.out.println("Enter elements :"); 
		a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
			if(a[i]==a[j]) {
				for(n--,k=i;k<n;k++) {
					a[k]=a[k+1];
				}
				j--;
			}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Array Size : ");
//		int n=sc.nextInt();
//		int i,f=0,j,k;
//		int arr[]=new int[n];
//		for(i=0;i<n;i++) {
//		System.out.print("Enter elements for "+(i+1));
//		arr[i]=sc.nextInt();
//		}
//		System.out.println("The Elements are : ");
//		for(i=0;i<n;i++) {
//			System.out.println(arr[i]);
//			}
//		for(i=0;i<n;i++) {
//			for(j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					for(n--,k=j;k<n;k++) {
//					arr[k]=arr[k+1];		
//					}	
//				}
//			}
//		}
//		for(i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
//		
//	}

}
