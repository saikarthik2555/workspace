package com.programs;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		System.out.println("Enter array size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i,t;
		int a[]=new int[size];
		for(i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Without Reverse Order : ");
		for(i=0;i<size;i++) {
		System.out.print(" "+a[i]);
		}
		for(i=0;i<size/2;i++) {
			t=a[i];
			a[i]=a[size-i-1];
			a[size-i-1]=t;
		}
		System.out.print("With Reverse Order :");
		for(i=0;i<size;i++) {
			System.out.print(" "+a[i]);
		}
		
		}
	}
