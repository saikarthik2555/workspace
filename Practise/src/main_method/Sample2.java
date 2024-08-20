package main_method;

import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) throws ClassNotFoundException {
//		for(char c=65;c<=122;++c) {
//			System.out.print(c+" "+(int)c+" "+"\n");
//		}
//		String name="apple";
//		System.out.println(name+"\b");
//	Scanner sc=	new Scanner(System.in);
//	System.out.println("Enter number");
//	Integer no=Integer.parseInt(sc.nextLine());
	int x = 15;
	int y = x--;
	byte c=(byte)-x;
	System.out.println(c);
	System.out.println(x+":"+y); 

	//get(sc);
	}
	public static void get(Scanner sc) {
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("Enter character");
		char d=sc.nextLine().charAt(0);
		System.out.println(d);
		sc.remove();
	}
	
}
