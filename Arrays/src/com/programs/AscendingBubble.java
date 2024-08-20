package com.programs;

import java.util.Scanner;

public class AscendingBubble//sort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array :");
		int n=sc.nextInt();
		int i,j,t;
		int a[]=new int[n];
		for(i=0;i<n;i++) {
		System.out.println("Enter elements for "+i+" Cell");
		a[i]=sc.nextInt();
		}
		for(i=0;i<n-2;i++) {												//tried
			for(j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
				}
			}
		for(i=0;i<n;i++) {
		System.out.print(" "+a[i]);
		}
		
		
		
	}

}
