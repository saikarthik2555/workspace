package com.programs;

import java.util.Scanner;
//swapping 
public class FlippingArrayElements {
	public static void main(String[] args) {
		int t;
		System.out.println("Enter the size ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter elements for : "+i);
			a[i]=sc.nextInt();			
		}
		for(int i=0;i<size;i=i+2) {
			t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]);
		}	
		sc.close();
	}
}
