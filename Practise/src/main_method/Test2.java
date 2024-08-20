package main_method;

import java.util.Scanner;

public class Test2 {
public static void main(String[] a) {
	//System.out.println(a[0]+a[1]);
	//System.out.println(""+12+12);
	int a1=(int) 122.35;
	int a2='A';
	System.out.println('a');
//10+23=a1; //error left side of an assignment should be variable	
	System.out.println(a2);
	System.out.println(12.4644d);
	System.out.println(5.0/2.0);
	System.out.println('A'+'B'+'C');
	System.out.println(Float.parseFloat(""+12)+Float.parseFloat("12"));
	System.out.println("min"+0x80000000);
	System.out.println("max"+0x7fffffff);
	System.out.println(Integer.parseInt("12")+Integer.parseInt("34"));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length and breath");
	int length=sc.nextInt();
//	String breath=sc.nextLine();
//	System.out.println(Integer*Double.parseDouble(breath));
	sc.close();
	}
}
