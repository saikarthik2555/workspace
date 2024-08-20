package com.practise;
import java.util.Scanner;
public class SwitchDemo {
	public static void main(String[] args) {
		char a='A';
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
//		switch(a) {
//		case 1: System.out.println("web");
//		case 2:System.out.println("Application");
//		case 'a': System.out.println("qwe");
//		case 3: System.out.println("bsbs");
//		case 65: System.out.println("A value");
//		}
		switch(name) {		//jdk 	1.7
		case "smith":System.out.println("smith"); break;
		case "ford": System.out.println("ford"+a); break;
		}
		
	}

}
