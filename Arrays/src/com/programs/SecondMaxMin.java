package com.programs;

import java.util.Scanner;
//interesting  
public class SecondMaxMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,t;
		for(i=0;i<n;i++) {
		System.out.println("Enter the Elements for  "+i+" Cell : ");
		a[i]=sc.nextInt();
		}
		System.out.println("Enter nth min and nth max : ");
		int nmin=sc.nextInt();
		int nmax=sc.nextInt();
		for(i=0;i<=n-1;i++) {
			for(j=i+1;j<=n-1;j++) {
				if(a[i]>a[j]) {			//if(a[i]<a[j] {	descending order
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=1;i<a.length;i++) {
			if(a[i]>a[0]) {
				nmin--;
			{
					if(nmin==1) {
						System.out.println("th min "+a[i]);
					}
				}
		}
	}
		for(i=n-2;i>=0;i--) {
			if(a[i]<a[i+1]) {
				nmax--;
				if(nmax==1) {
					System.out.println("th max "+a[i]);
				}
		  }
	   }
	}
}
