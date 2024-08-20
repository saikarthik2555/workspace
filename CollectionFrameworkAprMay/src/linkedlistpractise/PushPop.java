package linkedlistpractise;

import java.util.LinkedList;

public class PushPop {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		lst.push("sunday");
		lst.push("monday");
		lst.push("tuesday");
		lst.push("wednesday");
		lst.push("thursday");
		lst.push("friday");
		lst.push("saturday");
		System.out.println(lst);
		lst.add("Sun");		//adding down of last push element
		lst.add("Mon");
		lst.add("Tues");
		lst.add("Wednes");
		lst.add("Thurs");
		lst.add("Fri");
		lst.add("Satur");
		System.out.println(lst);
		lst.push("Holiday");
		lst.push("Festival");
		System.out.println(lst);

		System.out.println(lst.pop());
		System.out.println(lst.poll());
		System.out.println(lst.pollLast());
		System.out.println(lst.peekFirst());
		System.out.println(lst.peekLast());
		
	}
}
