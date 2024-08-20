package com.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class InsertDelete {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		var sc=new Scanner(System.in);
		while(true) {
			System.out.println("Choose 1 for insertion ");
			System.out.println("Choose 2 for deletion");
			System.out.println("choose 3 for display");
			System.out.println("Choose 4 for exit");
			Integer choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter element");
			if(hs.add(sc.nextInt())) {
			System.out.println("Added");	
			}
			break;
			case 2: System.out.println("Enter element to delete from "+hs);
			if(hs.remove(sc.nextInt())) {
				System.out.println("Deleted");
			}else {
				System.out.println("Not Found from the Collection");
			}
			break;
			case 3: hs.forEach(t -> System.out.print("Output"+t+" "));
			break;
			case 4: sc.close();
			System.exit(0); 							//It will shutdown JVM
			default : System.out.println("Invalid ");
			}
		}
	}

}
