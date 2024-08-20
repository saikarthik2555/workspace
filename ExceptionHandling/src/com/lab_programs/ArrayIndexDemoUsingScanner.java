package com.lab_programs;

import java.util.Scanner;

public class ArrayIndexDemoUsingScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the size :");
			int size=sc.nextInt();
			int a[]=new int[size];
			for(int i=0;i< a.length;i++) {
				System.out.println("Enter elements for :"+i);
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the index number to print");
			int index=sc.nextInt()-1;
			System.out.println(a[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot print that index number"+e);
		}
	}

}
