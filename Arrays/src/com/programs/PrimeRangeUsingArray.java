package com.programs;

import java.util.Scanner;

public class PrimeRangeUsingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,j;
		boolean p;
		for(i=0;i<arr.length;i++) {
			System.out.println("Enter elements for : "+i);
			arr[i]=sc.nextInt();
		} 
		for(i=0;i<arr.length;i++) {
			p=true;
		for(j=2;j<=arr[i]/2;j++) {
			if(arr[i]%j==0) {
				System.out.println(arr[i]+" - Composite");
				p=false;
				break;
			}
			System.out.println(arr[i]+" - Prime");
		}
		}
		sc.close();
	}

}
