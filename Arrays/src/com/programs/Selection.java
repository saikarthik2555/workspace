package com.programs;

import java.util.Scanner;
//also called as linear sort
public class Selection//sort
{
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
	for(i=0;i<=n-1;i++) {
		for(j=i+1;j<=n-1;j++) {
			if(a[i]>a[j]) {			//if(a[i]<a[j] {	descending order
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for(i=0;i<n;i++) {
	System.out.println(a[i]);
	}
	sc.close();
}
}
