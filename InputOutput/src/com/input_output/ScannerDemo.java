package com.input_output;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter id");
//		//int id=s.nextInt();
//		//System.out.println(id); 		//working exception
//		String id=s.nextLine();
//		System.out.println(id);
		Float f=s.nextFloat();		//no need of parseFloat in Scanner
		System.out.println(f);
		int a[]= {12,21,112,1};
		String str[]= {"sd","sds","wrste","adsssf"};
		Arrays.sort(str);
		DecimalFormat df=new DecimalFormat();
		df.format(0);	//from NumberFormat
	}
}
