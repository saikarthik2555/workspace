package com._1way;

import java.util.Arrays;
import java.util.Scanner;

public class ObjetProgram1 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size ");
	int size=sc.nextInt();
	Object obj[]=new String[size];
	for(int i=0;i<obj.length;i++) {
		System.out.println("Enter the element for "+i);
		obj[i]=sc.nextLine();
	}
	System.out.print(Arrays.toString(obj));
	}
}