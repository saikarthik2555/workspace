package com.exam_mcqs;

@FunctionalInterface
 interface Predi {
	public abstract boolean test(String name);
}
//class Search implements Predi {
//@Override
//public boolean test(String name) {
//	
//	return name.equals("india");
//}
//}
public class PredicateEquals{
	public static void main(String[] args) {
		Predi p= (String name) -> name.equals("india");
		System.out.println(p.test("india"));
//		Predi p=new Search();
//		System.out.println(p.test("india"));
	}
	
}
