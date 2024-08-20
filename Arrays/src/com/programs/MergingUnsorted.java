package com.programs;

import java.util.Scanner;

public class MergingUnsorted {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array1  And Array2");
		int n1=sc.nextInt();	//1st array
		int n2=sc.nextInt();	//2nd array
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int arr3[]=new int[arr1.length+arr2.length];
		int i,pos=0;
		for(i=0;i<arr1.length;i++) {
		System.out.println("Enter Element for Array 1 "+i);
		arr1[i]=sc.nextInt();      }
		for(i=0;i<arr2.length;i++) {
			System.out.println("Enter Element for Array 2 "+i);
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<arr1.length;i++) {
			arr3[pos++]=arr1[i];
		}
		for(i=0;i<arr2.length;i++) {
			arr3[pos++]=arr2[i];
		}
		System.out.println("Merged Array :");
		for(i=0;i<arr3.length;i++) {
			System.out.println(" "+arr3[i]);
		}
		
	}

}
