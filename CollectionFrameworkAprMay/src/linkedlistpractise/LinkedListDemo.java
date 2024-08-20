package linkedlistpractise;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("pune");
		lst.add("Hyderabad");
		lst.add("Bangalore");
		lst.add("Kolkata");
		System.out.println(lst.toString());
		//System.out.println(lst.removeFirst());
		ListIterator<String> i=lst.listIterator();
		while(i.hasNext()) {
			String name=i.next();
			if(name.equals("Kolkata")) i.remove();
			if(name.equals("Hyderabad")) i.add("Ameerpet");
			if(name.equals("pune")) i.set("Mumbai");
 		}
		System.out.println(lst); 
		
	}

}
