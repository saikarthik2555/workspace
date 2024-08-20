package com.programs;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size ");
	int n=sc.nextInt();
	System.out.println("Enter the number : ");
	int arr[]=new int[n];
	int dno=sc.nextInt();
	for(int i=0;dno!=0;i++,dno=dno/2) {
		arr[i]=dno%2;
	}
	for(int i=15;i>=0;i--) {
		System.out.print(" "+arr[i]);
	}
	
	}
}
