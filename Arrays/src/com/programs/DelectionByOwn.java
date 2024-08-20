package com.programs;

import java.util.Scanner;

public class DelectionByOwn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,ele=3,j;
		for(i=0;i<n;i++) {
		System.out.println("Enter elements :"); 
		a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]==ele) {
				for(n--,j=i;j<n;j++) {
					a[j]=a[j+1];
				}
				i--;
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}
