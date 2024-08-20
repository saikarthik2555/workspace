package com.tree_set;

import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args) {
		/* Using Comparator
		 *constructors
		 *TreeSet t1=new TreeSet(); empty TreeSet Object
		 *TreeSet t2=new TreeSet(Comparator c);
		 *TreeSet t3=new TreeSet(Collection c);
		 *TreeSet t4=new TreeSet(SortedSet s);
		 */
	TreeSet<Mobile> t1=new TreeSet<Mobile>(new MobileComparatorImp());
	//based on name ascending order
	t1.add(new Mobile("Iqoo", 6, "Blue", 14000d));
	t1.add(new Mobile("Realme Narzo", 8, "Gray",15000d));
	t1.add(new Mobile("Redmi 12", 6, "Black", 13000d));
	t1.add(new Mobile("Lava Agni", 8, "Blue", 18000d));
	
	
//	Comparable<Mobile> cmp=new Comparable<>() {
//
//		@Override
//		public int compareTo(Mobile m) {
//			
//			return Integer.compare(m.getRam(), m.getRam());
//		}
//		
//	};
	
	t1.forEach(t-> System.out.println(t));
	
	System.out.println();
//	TreeSet<Mobile> t2=new TreeSet<Mobile>((m1,m2)-> (int)-(m1.getPrice()-m2.getPrice()));
//	t2.add(new Mobile("Iqoo", 6, "Blue", 14000d));
//	t2.add(new Mobile("Realme Narzo", 8, "Gray",15000d));
//	t2.add(new Mobile("Redmi 12", 6, "Black", 13000d));
//	t2.add(new Mobile("Lava Agni", 8, "Blue", 18000d));
//	t2.forEach(t-> System.out.println(t));
//	System.out.println("name".equals("name"));
	
	}
//
//	@Override
//	public int compareTo(Mobile o) {
//		
//		return Integer.compare(o.getRam(),o.getRam());
//	}
}
