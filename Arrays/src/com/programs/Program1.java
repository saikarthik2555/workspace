package com.programs;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Enter the elements fo 1st array"+i);
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println("Enter the elemenst for 2nd array "+i);
				arr2[i]=sc.nextInt();
			}
		boolean result=Program1.returnType(arr1,arr2);
		System.out.println(result);
		}

public static boolean returnType(int []arr1,int []arr2){
	if(arr1.length>=1 && arr2.length>=1 && arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {
		return true;
	}
	else {
		return false;
	}
	}
}

