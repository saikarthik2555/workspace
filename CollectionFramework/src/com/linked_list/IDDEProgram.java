package com.linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class IDDEProgram {
	public static void main(String[] args) {
		LinkedList<Integer> lst=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println(lst);
			System.out.println(" Enter 1 for Inserting Element ");
			System.out.println(" Enter 2 for Deletion Element");
			System.out.println(" Enter 3 for Display purpose");
			System.out.println(" Enter 4 for Exit the operation");
			switch(sc.nextInt()) {
			case 1: 
			System.out.println("Enter the Element ");
			lst.add(sc.nextInt());
			break;
			case 2: 
				System.out.println("Enter the element to delete");
				Object obj=sc.next();
				System.out.println(lst.remove(obj));
				
				break;
			case 3: System.out.println(lst); 
				break;
			case 4: sc.close();
			System.out.println("Thank You");
			System.exit(0);
			}
		}
	}
}
