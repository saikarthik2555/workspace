package com.selection.sort;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i,ele,f=0;
		for(i=0;i<size;i++) {
		System.out.println("Enter the element for  "+i+" Cell");
		a[i]=sc.nextInt();
		}
		System.out.print("Enter the element to search : ");
		ele=sc.nextInt();
		for(i=0;i<size;i++) {
			if(a[i]==ele) {
				System.out.println(" The element "+ele+" is in "+(i+1)+"Cell");
				f=1;
			}
		}
		if(f==0) {
			System.out.println("Element Not Found");
		}
		sc.close();
	}

}
