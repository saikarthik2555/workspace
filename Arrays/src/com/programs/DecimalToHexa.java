package com.programs;

import java.util.Scanner;

public class DecimalToHexa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int arr[]=new int[16];
		int dno=sc.nextInt();
		for(int i=0;dno!=0;dno=dno/16,i++) {
		arr[i]=dno%16;
		}
		for(int i=15;i>=0;i--) {
			if(arr[i]>=10) {
				System.out.print(" "+(char)(arr[i]+87));
			}
			else {
				System.out.print(" "+arr[i]);
			}
		}
	}

}
