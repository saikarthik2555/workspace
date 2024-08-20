package com.programs;

import java.util.Scanner;
// 2 case
//i)  sorting arr1 and sorting arr2		-->Time consuming
//ii) merging both arrays and sorting arr3  --> Best
public class MergingSorted {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array1  And Array2");
		int n1=sc.nextInt();	//1st array
		int n2=sc.nextInt();	//2nd array
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int arr3[]=new int[arr1.length+arr2.length];	//3rd array
		int i,pos=0,j,t;
		for(i=0;i<arr1.length;i++) {
		System.out.println("Enter Element for Array 1 "+i);
		arr1[i]=sc.nextInt();      }
		for(i=0;i<arr2.length;i++) {
			System.out.println("Enter Element for Array 2 "+i);
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<arr1.length-1;i++) {
		for(j=0;j<arr1.length-1;j++) {
			if(arr1[j]>arr1[j+1]) {
				t=arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1]=t;
			}
		}
		}
		for(i=0;i<arr2.length-1;i++) {
			for(j=0;j<arr2.length-1;j++) {
				if(arr2[j]>arr2[j+1]) {
					t=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=t;
				}
			}
			}
		for(i=0;i<arr1.length;i++) {
			arr3[pos++]=arr1[i];
		}
		for(i=0;i<arr2.length;i++) {
			arr3[pos++]=arr2[i];
		}
		System.out.println("Merged Array ");
		for(i=0;i<arr1.length+arr2.length;i++) {
			System.out.print(" "+arr3[i]);
		}
	}

}
