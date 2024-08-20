package linkedlistpractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProjectType {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		while(true) {
			System.out.println("1: Insertion");
			System.out.println("2: Deletion");
			System.out.println("3: Printing");
			System.out.println("4: Searching by Name");
			System.out.println("5: Searching by Index");
			System.out.println("6: Exit");
			//logics
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Choice : ");
			Integer choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			
			case 1: System.out.println("Enter the elemt to Insert");
			String addElement=sc.nextLine();
			Boolean b=lst.add(addElement);
			if(b) System.out.println("added");  else System.out.println("not Added");  break;
			
			case 2: System.out.println("Enter The elemt to delete");
			String deleteElement=sc.nextLine();
			if(lst.remove(deleteElement)) System.out.println("deleted"); else System.out.println("Not deleted");  break;
			
			
			case 3: System.out.println("OUTPUT : "+lst.toString());  break;
			
			case 4:  ArrayList<String> al=new ArrayList<String>(lst);
			System.out.println("Enter The Element  to Find element");
			String searchElement=sc.nextLine();
			if(al.contains(searchElement)) 	System.out.println("The Element Found : "+searchElement);
			else System.out.println("Element Not Found ");
			break;
			
			case 5:  ArrayList<String> ai=new ArrayList<String>(lst);
			System.out.println("Enter The Index  to get Element");
			String searchElementByIndex=sc.nextLine();
			if(ai.contains(searchElementByIndex)) 	System.out.println("The index position number is : "+ai.indexOf(searchElementByIndex));
			else System.out.println("Element Not Found at This Index");
			break;
			
			case 6: System.out.println("Thank You , ");
			sc.close();
			System.exit(0);
			}
		}
		
		
	}
}
