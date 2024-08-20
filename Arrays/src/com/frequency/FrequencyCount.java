package com.frequency;

import java.util.Scanner;

public class FrequencyCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int frarr[]=new int[arr.length]; //frequency array
		int i,j;
		int visited=-1;
		for(i=0;i<n;i++) {
		System.out.println("Enter Array Elements :"+i);
		arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			int count=1;
			for(j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					frarr[j]=visited;
				}
			}
			if(frarr[i]!=visited) {
				frarr[i]=count;
			}
		}
		for(i=0;i<frarr.length;i++) {
			if(frarr[i]!=visited) {
			System.out.println(arr[i]+"        ||       "+frarr[i]);
		}
	}
  }
}
